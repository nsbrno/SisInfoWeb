/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.service;

import br.com.nsbruno.sisinfo.handler.exception.BaseMyException;
import br.com.nsbruno.sisinfo.model.CfaclifoEntity;
import br.com.nsbruno.sisinfo.model.SmausuarEntity;
import br.com.nsbruno.sisinfo.repository.CfaclifoRepository;
import br.com.nsbruno.sisinfo.repository.SmausuarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nogueira
 */
@Service
public class SmausuarService extends BaseMyService<SmausuarRepository, SmausuarEntity> implements UserDetailsService {

    public SmausuarService(SmausuarRepository baseMyRepository) {
        super(baseMyRepository);
    }
    
    @Autowired
    SmausuarRepository smausuarRepository;
    
    @Autowired
    CfaclifoRepository cfaclifoRepository;
    
    @Override
    public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
        SmausuarEntity user = smausuarRepository.findByNome(nome);
        // Checa se voltou algum usuario
        if (user == null) {
            throw new BaseMyException("Usuário (" + nome + ") não encontrado! - Mensagem Customizada.");
            //throw new RuntimeException("Usuário não encontrado! - Mensagem Customizada.");
            //return new ResponseEntity<>("Username ", HttpStatus.UNAUTHORIZED);
        }
        boolean userIsAdmin = user.getAcessoTotal().equalsIgnoreCase("1");
        // Pega os dados do usuario na tabela clifo
        CfaclifoEntity cfaclifo = cfaclifoRepository.findById(user.getIdCfaclifo()).get();
        // Cria os grupos de autoridades
        List<GrantedAuthority> listAuthorityAdmin = AuthorityUtils.createAuthorityList("ROLE_ACTUATOR" , "ROLE_USER", "ROLE_ADMIN");
        List<GrantedAuthority> listAuthorityUser = AuthorityUtils.createAuthorityList("ROLE_USER");
        return new User(user.getNome(), 
                        user.getSenha(), 
                        cfaclifo.getAtivo().equalsIgnoreCase("1"), 
                        true, 
                        true, 
                        true, 
                        (userIsAdmin ? listAuthorityAdmin : listAuthorityUser));
    }
    
}
