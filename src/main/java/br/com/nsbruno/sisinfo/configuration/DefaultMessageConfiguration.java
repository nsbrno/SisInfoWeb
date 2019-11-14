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
    String FILE_CONFIG_NOT_FOUND = "Não conseguimos encontrar o arquivo de configuração.";
    String FILE_CONFIG_NOT_PROPS = "O arquivo de configuração não tem nenhuma propriedade. Ou seja, não tem chaves(key)/propriedades no arquivo properties.";
    String NOT_EMPTY = "Não pode ser vazio, é necessário preencher o campo, pois é obrigatório.";
    String NOT_PARAM = "Não foi passado nenhum parâmetro, ou existe algum parâmetro vazio.";
    String NOT_FOUND_PROPERTIE = "Não foi encontrado o valor da propriedade.";
    String ERROR_NOT_FOUND_KEY_PROPERTIE = "Não encontramos a chave(key) passada no parâmetro.";
    String USER_NOT_FOUND = "Usuário não encontrado, ou digitado errado.";
    String PASSWORD_INCORRECT = "Senha incorreta. Lembrese de conferir maiusculas e minusculas, e se tem caracteres especiais.";
}
