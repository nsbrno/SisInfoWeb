/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.nsbruno.sisinfo.configuration;

/**
 * Document   : DefaultMessageConfiguration
   Created on : 08/11/2019, 11:12:15
   Author     : Bruno Nogueira Silva
 * @author Nogueira
 */
public interface DefaultMessageConfiguration {

    String ERROR_NOT_TEXT_FOR_ENCRYPT = "Não recebemos nenhum texto para criptografar.";
    String ERROR_CONSTRUCT_SQL = "Erro ao construir o SQL. Não conseguimos montar o SQL por algum erro interno. O SQL poder ser um Select, Insert, Update ou Delete.";
    String ERROR_NOT_FOUND_KEY_PROPERTIE = "Não encontramos a chave(key) passada no parâmetro.";
    String FILE_CONFIG_NOT_FOUND = "Não conseguimos encontrar o arquivo de configuração.";
    String FILE_CONFIG_NOT_PROPS = "O arquivo de configuração não tem nenhuma propriedade. Ou seja, não tem chaves(key)/propriedades no arquivo properties.";
    String NOT_EMPTY = "Não pode ser vazio, é necessário preencher o campo, pois é obrigatório.";
    String NOT_PARAM = "Não foi passado nenhum parâmetro, ou existe algum parâmetro vazio.";
    String NOT_FOUND_PROPERTIE = "Não foi encontrado o valor da propriedade.";
    String NOT_FOUND_BY_ID = "Não conseguimos encontrar os dados do ID que você esta pesquisando.";
    String NOT_PARAM_ID = "Não foi passado o parâmetro ID. Por favor fazer uma nova requisição utilizando o parâmetro com a chave(key) \"id\".";
    String NOT_FOUND_CLIENT_DATABASE = "Não conseguimos localizar o cadastro da empresa que pertence esse dispositivo. Provavelmente porque não foi cadastrada.";
    String NOT_SAVE = "Não conseguimos salvar/alterar os dados que foi passado. Pode acontecer de ter sido um erro ao tentar buscar novamente o registro após ter sido salvo ou alterado, por isso tente fazer a requisição novamente para ver se vai retornar os dados que você esta tentando salvar.";
    String NOT_DELETE = "Não foi possível deletar o registro.";
    String USER_NOT_FOUND = "Usuário não encontrado, ou digitado errado.";
    String USER_PASSWORD_NOT_PASSED = "Usuário e/ou senha não foi passado. Ou seja, a autenticação básica http não foi passada junto com a requisição.";
    String PASSWORD_INCORRECT = "Senha incorreta. Lembrese de conferir maiusculas e minusculas, e se tem caracteres especiais.";
    String DEVICE_NOT_PASSED_HEADER = "Os dados do dispositivo não foi passado no Header(cabeçalho). Envie os dados do dispositivo como Header com o nome da chave(key) igual a: \"device\"";
    String DEVICE_NOT_FOUND = "Dispositivo/device não encontrado. Possivelmente não esta cadastrado.";
    String DEVICE_DISABLE = "Dispositivo/device esta inativo, por isso não pode ser usado.";
    String CLIENT_NOT_FOUND = "Cliente não encontrado. Possivelmente não esta cadastrado.";
    String CLIENT_DISABLE = "Esta conta está inativada, por isso não pode ser usada.";
    String OUTPUTCLASS_NOT_ENTITY = "A classe da tabela a ser pesquisada não tem uma anotação 'Entity' por isso não pode retornar os dados. Provavelmente esse é uma erro interno no código fonte, por isso contate o suporte para verificar uma solução ou o possível problema na requisição.";
    String INTERNAL_ERROR_FROM_MAP_RESULT = "Erro desconhecido no método mapResultSetToObject(ResultSet rs, Class outputClass). Primeiro analise se esta enviando todos os dados necessario na requisição. Caso persista contate o suporte.";
    String QUERY_NOT_FOUND = "Não foi passado nenhuma query(select/insert/delete/etc.) nos parametros. Pode acontecer de não ter conseguido montar a query com os parâmetros passados, por isso verifique se os parâmetros passados estão com os nomes corretos.";
    String ENTITY_EMPTY = "Não foi passado os dados da entidade, ou seja, não recebemos os dados que é para ser inserido no banco de dados.";
    String BAD_REQUEST = "A URL passado por parametro com ontem a estrutura básica para pesquisar no servidor webservice. Por exemplo, a URL deve ser similar a isto: http://localhost:8080/client/v1/Smausuar";
}
