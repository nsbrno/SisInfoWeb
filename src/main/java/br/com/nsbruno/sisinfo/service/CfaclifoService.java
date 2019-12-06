/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.service;

import br.com.nsbruno.sisinfo.model.CfaclifoEntity;
import br.com.nsbruno.sisinfo.repository.CfaclifoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nogueira
 */
@Service
public class CfaclifoService extends BaseMyService<CfaclifoRepository, CfaclifoEntity>{
    
    @Autowired
    CfaclifoRepository cfaclifoRepository;
    
    public CfaclifoService(CfaclifoRepository baseMyRepository) {
        super(baseMyRepository);
    }

    public CfaclifoEntity getOneByIdCfaclifo(Integer id){
        return cfaclifoRepository.findByIdCfaclifo(id);
    }
}
