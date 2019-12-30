/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.function;

import br.com.nsbruno.sisinfo.beans.PageableBeans;
import br.com.nsbruno.sisinfo.configuration.DefaultMessageConfiguration;
import br.com.nsbruno.sisinfo.configuration.GeneralConfiguration;
import br.com.nsbruno.sisinfo.handler.exception.BaseMyException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Nogueira
 */
public class CustomFunction {

    public static String KEY_USERNAME = "username";
    public static String KEY_PASSWORD = "password";
    public static String KEY_DEVICE = "device";
    public static String KEY_INSERT = "I";
    public static String KEY_UPDATE = "U";
    public final static int KEY_ENCRYPT = 0,
            KEY_DECRYPT = 1,
            KEY_NAO = 0,
            KEY_SIM = 1;
    protected static final byte PAD_DEFAULT = '=';
    private static final byte[] DECODE_TABLE = {
        //   0   1   2   3   4   5   6   7   8   9   A   B   C   D   E   F
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, // 00-0f
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, // 10-1f
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, // 20-2f + - /
        52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, // 30-3f 0-9
        -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, // 40-4f A-O
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, // 50-5f P-Z _
        -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, // 60-6f a-o
        41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51 // 70-7a p-z
    };

    /**
     * Metodo para pegar o nome de usuário e a senha passado como autenticador
     * no header. Pega o autenticador, que esta codificado, e decodifica
     * retornando uma Map&lt;String, String&gt; com a chave(key) e o valor.
     * Retorna apenas o username e o password. Os nomes das chaves são
     * "username" e "password", essas chaver estão com variavel public com os
     * seguintes nomes: {@link #KEY_USERNAME} e {@link #KEY_PASSWORD}.
     *
     * @param request
     * @return
     */
    public Map<String, String> getUserAndPassowordFromAuth(HttpServletRequest request) {
        Map<String, String> map = new HashMap<>();
        final String authorization = request.getHeader("Authorization");
        if (authorization != null && authorization.toLowerCase().startsWith("basic")) {
            // Authorization: Basic base64credentials
            String base64Credentials = authorization.substring("Basic".length()).trim();
            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(credDecoded, StandardCharsets.UTF_8);
            // credentials = username:password
            final String[] values = credentials.split(":", 2);
            map.put(KEY_USERNAME, values[0]);
            map.put(KEY_PASSWORD, values[1]);
        }
        return map;
    }

    /**
     *
     * @param encriptaDecripta - Obrigatorio, pode ser 0 para encriptar, ou 1
     * para descriptografar.
     * @param texto
     * @param chaveEncriptacao
     * @return - Retorna <code>byte[]</code> para qualquer tido, criptografar ou
     * descriptografar. Vai retornar nulo(null) caso não seja um texto válido
     * para descriptografar ou se acontecer qualquer tipo de erro.
     */
    public byte[] encryptDecrypt(int encriptaDecripta, String texto, String chaveEncriptacao) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec keySecretKeySpec = new SecretKeySpec(chaveEncriptacao.getBytes("UTF-8"), "AES");

            if ((texto != null) && (!texto.isEmpty()) && (texto.length() > 0)) {
                if ((encriptaDecripta == KEY_ENCRYPT)) {
                    cipher.init(Cipher.ENCRYPT_MODE, keySecretKeySpec, new IvParameterSpec(GeneralConfiguration.IV_DEFAULT_ENCRYPT_DECRYPT.getBytes("UTF-8")));

                    return Base64.getEncoder().encode(cipher.doFinal(texto.getBytes("UTF-8")));
                }
                if ((encriptaDecripta == KEY_DECRYPT)
                        && (isBase64(texto.getBytes("UTF-8")))
                        && (texto.length() % 4 == 0)) {
                    byte[] textoEncriptado = Base64.getDecoder().decode(texto);
                    cipher.init(Cipher.DECRYPT_MODE, keySecretKeySpec, new IvParameterSpec(GeneralConfiguration.IV_DEFAULT_ENCRYPT_DECRYPT.getBytes("UTF-8")));

                    return cipher.doFinal(textoEncriptado);
                }
            } else {
                throw new BaseMyException(DefaultMessageConfiguration.ERROR_NOT_TEXT_FOR_ENCRYPT);
            }
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException
                | InvalidKeyException | NoSuchAlgorithmException
                | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            //logger.error(MensagemPadrao.ERROR_ENCRYPT_DECRYPT + " | " + e.getMessage());
            throw new BaseMyException(e);
        }
        return null;
    }

    /**
     * Returns whether or not the <code>octet</code> is in the base 64 alphabet.
     *
     * @param octet The value to test
     * @return <code>true</code> if the value is defined in the the base 64
     * alphabet, <code>false</code> otherwise.
     * @since 1.4
     */
    public static boolean isBase64(final byte octet) {
        return octet == PAD_DEFAULT || (octet >= 0 && octet < DECODE_TABLE.length && DECODE_TABLE[octet] != -1);
    }

    /**
     * Essa funcao foi copiada do pacote do apache no link abaixo;
     * https://commons.apache.org/proper/commons-codec/apidocs/org/apache/commons/codec/binary/BaseNCodec.html#PAD_DEFAULT
     *
     * Tests a given byte array to see if it contains only valid characters
     * within the Base64 alphabet. Currently the method treats whitespace as
     * valid.
     *
     * @param arrayOctet byte array to test
     * @return <code>true</code> if all bytes are valid characters in the Base64
     * alphabet or if the byte array is empty; <code>false</code>, otherwise
     * @since 1.5
     */
    public static boolean isBase64(final byte[] arrayOctet) {
        for (int i = 0; i < arrayOctet.length; i++) {
            if (!isBase64(arrayOctet[i]) && !isWhiteSpace(arrayOctet[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if a byte value is whitespace or not. Whitespace is taken to mean:
     * space, tab, CR, LF
     *
     * @param byteToCheck the byte to check
     * @return true if byte is whitespace, false otherwise
     */
    protected static boolean isWhiteSpace(final byte byteToCheck) {
        switch (byteToCheck) {
            case ' ':
            case '\n':
            case '\r':
            case '\t':
                return true;
            default:
                return false;
        }
    }

    public String constructSelect(String table, PageableBeans pageable) {
        return constructSelect(table, pageable, KEY_NAO);
    }

    public String constructSelectForCount(String table, PageableBeans pageable) {
        return constructSelect(table, pageable, KEY_SIM);
    }

    private String constructSelect(String table, PageableBeans pageable, Integer forCount) {
        StringBuilder query = new StringBuilder();
        try {
            // Checa se o nome da tabela foi enviado
            if ((table != null) && (!table.isEmpty())) {
                // Checa se eh para construir um select de count
                if ((forCount != null) && (forCount.equals(KEY_SIM))) {
                    query.append("SELECT COUNT(*) FROM ");
                    // Verifica se foi passado paginacao
                } else if ((pageable != null)) {
                    query
                            .append("SELECT FIRST ")
                            .append(pageable.getPageSize())
                            .append(" SKIP ")
                            .append(pageable.getPageNumber() * pageable.getPageSize())
                            .append(" * FROM ");
                } else {
                    query.append("SELECT * FROM ");
                }
                query.append(table);
                // Checa se foi pasado um where
                if ((pageable != null) && (pageable.getWhere() != null) && (!pageable.getWhere().isEmpty())) {
                    query.append(" WHERE (").append(pageable.getWhere().replace("+", " ")).append(")");
                }
                // Checa se foi passado alguma ordenacao
                if ((pageable != null) && (pageable.getSort() != null)
                        && (!pageable.getSort().isEmpty()) && (((forCount != null) && (!forCount.equals(KEY_SIM))) || (forCount == null))) {
                    query.append(" ORDER BY ");
                    query.append(pageable.getSort());
                    query.append(" ");
                }
                query.append(";");
            }
        } catch (Exception e) {
            throw new BaseMyException(e);
        }
        return query.toString().toUpperCase();
    }

    public String constructUpdateFromEntity(Object entityClass) {
        return constructInsertOrUpdateFromEntity(KEY_UPDATE, entityClass);
    }
    
    public String constructInsertFromEntity(Object entityClass){
        return constructInsertOrUpdateFromEntity(KEY_INSERT, entityClass);
    }

    private String constructInsertOrUpdateFromEntity(String insertOrUpdate, Object entityClass) {
        StringBuilder sql = new StringBuilder();
        StringBuilder valuesColumns = new StringBuilder();
        String idReturn = null;
        Integer idForUpdate = null;
        try {
            if (entityClass.getClass().isAnnotationPresent(Entity.class)) {
                String nameTable = entityClass.getClass().getSimpleName().toUpperCase().replace("ENTITY", "");
                if (insertOrUpdate.equalsIgnoreCase(KEY_INSERT)) {
                    sql.append("INSERT");
                    sql.append(" INTO ");
                    sql.append(nameTable);
                    sql.append("(");
                } else if (insertOrUpdate.equalsIgnoreCase(KEY_UPDATE)) {
                    sql.append("UPDATE ");
                    sql.append(nameTable);
                    sql.append(" SET ");
                }
                Field[] fields = entityClass.getClass().getDeclaredFields();

                int i = 0;
                for (Field field : fields) {
                    field.setAccessible(true);
                    // Checa se tem alguma anotacao de coluna de banco
                    if (field.isAnnotationPresent(Column.class)) {
                        Column column = field.getAnnotation(Column.class);
                        Object value = field.get(entityClass);
                        //sql.append(((i > 0) && (value != null) && (value.toString().length() > 0)) ? ", " : "");
                        //sql.append(((value != null) && (value.toString().length() > 0)) ? column.name() : "");
                        if ( ((value != null) && (value.toString().length() > 0) && (!(value instanceof byte[])) && (!(value instanceof Byte[])) )
                                || ((value != null) && ((value instanceof byte[]) || (value instanceof Byte[])) && (((byte[]) value).length > 0))) {
                            // Adiciona um virgula se nao for a primeira coluna
                            sql.append((i > 0) ? ", " : "");
                            valuesColumns.append((i > 0) ? ", " : "");

                            if (insertOrUpdate.equalsIgnoreCase(KEY_INSERT)) {
                                // Adiciona o nome da coluna
                                sql.append(column.name());
                            } else if (insertOrUpdate.equalsIgnoreCase(KEY_UPDATE)) {
                                sql.append(column.name()).append(" = ");
                            }
                            if (((value.getClass().equals(String.class)) || (value.getClass().equals(CharSequence.class)))
                                    && (!(((value.toString().contains("SELECT")) && (value.toString().contains("FROM")))
                                    || ((value.toString().contains("select")) && (value.toString().contains("from")))))) {
                                // Checa se esta tentando construir um insert
                                if (insertOrUpdate.equalsIgnoreCase(KEY_INSERT)) {
                                    // Adiciona o nome da coluna
                                    valuesColumns.append("'").append(value.toString()).append("'");
                                    // Checa se esta tentando construir um update
                                } else if (insertOrUpdate.equalsIgnoreCase(KEY_UPDATE)) {
                                    sql.append("'").append(value.toString()).append("'");
                                }
                                // Checa se o value esta em byte[]
                            } else if ( (value instanceof byte[]) || (value instanceof Byte[]) ) {
                                // Checa se esta tentando construir um insert
                                if (insertOrUpdate.equalsIgnoreCase(KEY_INSERT)) {
                                    // Adiciona o nome da coluna
                                    valuesColumns.append("'").append(value.toString()).append("'");
                                    // Checa se esta tentando construir um update
                                } else if (insertOrUpdate.equalsIgnoreCase(KEY_UPDATE)) {
                                    sql.append("'").append(value.toString()).append("'");
                                }
                            } else {
                                // Checa se esta tentando construir um insert
                                if (insertOrUpdate.equalsIgnoreCase(KEY_INSERT)) {
                                    // Adiciona o nome da coluna
                                    valuesColumns.append(value.toString());
                                    // Checa se esta tentando construir um update
                                } else if (insertOrUpdate.equalsIgnoreCase(KEY_UPDATE)) {
                                    sql.append(value.toString());
                                }
                            }
                            i++;
                        }
                    }
                    if ((field.isAnnotationPresent(Id.class)) && (idReturn == null)) {
                        idReturn = " RETURNING " + field.getAnnotation(Column.class).name();
                        idForUpdate = (Integer) field.get(entityClass);
                    }
                }
                // Checa se esta tentando construir um insert
                if (insertOrUpdate.equalsIgnoreCase(KEY_INSERT)) {
                    // Adiciona os valores do insert
                    sql.append(") VALUES (").append(valuesColumns.toString()).append(")");
                    // Checa se esta tentando construir um update. Nao checa se tem algum id para nao criar um update para todos os registros
                    // Assim força a criar um update sempre com where
                } else if (insertOrUpdate.equalsIgnoreCase(KEY_UPDATE)) {
                    sql.append(" WHERE ID_").append(nameTable).append(" = ").append(idForUpdate);
                }

                if ((idReturn != null) && (!idReturn.isEmpty())) {
                    sql.append(idReturn);
                }
            }
        } catch (IllegalAccessException | IllegalArgumentException | SecurityException e) {
            throw new BaseMyException(DefaultMessageConfiguration.ERROR_CONSTRUCT_SQL + " | NESTE CASO NAO FOI CONSTRUIDO O INSERT DE UMA ENTITY. " + e.getMessage());
        }
        return sql.toString();
    }
}
