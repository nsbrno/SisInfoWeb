/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.beans;

import java.util.List;
import lombok.Data;

/**
 *
 * @author Nogueira
 */
@Data
public class PageBeans<E> {

    PageableBeans pageable;
    boolean last = false, //Marca se eh a ultima pagina
            first = false, //Marca se eh a primeira pagina
            empty = false;  //Marca se a lista esta vazia, ou seja, não retornou nenhum resultado
    int totalElements, // Total de elementos/registros para a requisicao/select
            totalPages, // Total de paginas para a requisicao/select
            number = 0, // Numero da pagina atual
            size, // Total de elementos/registros estipulado para retornar por pagina
            numberOfElements;       // Total de elementos/registro que retorno na pagina atual
    SortBeans sort;         // Para armazenar se foi usado algum tipo de ordenacao
    List<E> content;

    public PageBeans() {
    }

    public PageBeans(PageableBeans pageable, int totalElements, int totalPages, List<E> content) {
        this.pageable = pageable;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.content = content;
        // Checa se o pageable eh nullo
        if (pageable != null) {
            // Instancia a vareavel de status de ordenacao
            this.sort = new SortBeans();
            // Checa se existe algum tipo de ordenacao
            if ( (pageable.getSort() != null) && (!pageable.getSort().isEmpty()) ) {
                this.sort.setEmpty(false);
                this.sort.setSorted(true);
                this.sort.setUnsorted(false);
            } else {
                this.sort.setEmpty(true);
                this.sort.setSorted(false);
                this.sort.setUnsorted(true);
            }
            // Checa se eh a ultima pagina
            if ((pageable.getPageNumber() >= 0) && pageable.getPageNumber() == (totalPages - 1)) {
                this.last = true;
            }
            // Checa se eh a primeira pagina
            if (pageable.getPageNumber() == 0) {
                this.first = true;
            // Checa em qual pagina esta atualmente
            } else if (pageable.getPageNumber() > 0){
                this.number = pageable.getPageNumber();
            }
            this.size = pageable.getPageSize();
        }
        // Checa se existe alguma registro/row na lista
        if ( (content == null) || (content.size() <= 0)){
            empty = true;
        } else {
            this.numberOfElements = content.size();
        }
    }

}
