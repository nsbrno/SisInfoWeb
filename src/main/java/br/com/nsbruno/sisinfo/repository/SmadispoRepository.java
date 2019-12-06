/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.repository;

import br.com.nsbruno.sisinfo.model.SmadispoEntity;

/**
 *
 * @author Nogueira
 */
public interface SmadispoRepository extends BaseMyRepository<SmadispoEntity, Integer>{
    
    public SmadispoEntity findByIdentificacao(String identificacao);
}
