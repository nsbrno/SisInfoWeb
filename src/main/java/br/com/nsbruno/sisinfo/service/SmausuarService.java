/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.service;

import br.com.nsbruno.sisinfo.model.SmausuarEntity;
import br.com.nsbruno.sisinfo.repository.SmausuarRepository;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nogueira
 */
@Service
@Transactional
public class SmausuarService extends BaseMyService<SmausuarRepository, SmausuarEntity> {

    public SmausuarService(SmausuarRepository baseMyRepository) {
        super(baseMyRepository);
    }
}
