/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.service;

import br.com.nsbruno.sisinfo.model.SmadispoEntity;
import br.com.nsbruno.sisinfo.repository.SmadispoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nogueira
 */
@Service
public class SmadispoService extends BaseMyService<SmadispoRepository, SmadispoEntity>{
    
    @Autowired
    private SmadispoRepository smadispoRepository;
    
    public SmadispoService(SmadispoRepository smadispoRepository) {
        super(smadispoRepository);
    }
    
    public SmadispoEntity getOneByIndentificacao(String identificacao){
        return smadispoRepository.findByIdentificacao(identificacao);
    }
}
