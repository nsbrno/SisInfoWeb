/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.service;

import br.com.nsbruno.sisinfo.model.SmausuarEntity;
import br.com.nsbruno.sisinfo.repository.SmausuarRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nogueira
 */
@Service
public class SmausuarService extends BaseMyService<SmausuarRepository, SmausuarEntity> {

    public SmausuarService(SmausuarRepository baseMyRepository) {
        super(baseMyRepository);
    }
//  TODO--Deletar este comentario
//    @Autowired
//    SmausuarRepository smausuarRepository;
//
//    @Autowired
//    CfaclifoRepository cfaclifoRepository;
//
//    @Autowired
//    private HttpServletRequest request;
//
//    @Override
//    public UserDetails loadUserByUsername(String nome) {
//        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity();
//        errorMessageEntity.setTimestamp(new Date());
//        errorMessageEntity.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
//        errorMessageEntity.setError(HttpStatus.INTERNAL_SERVER_ERROR.name());
//        //errorMessageEntity.setPath((String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE));
//        User userReturn = null;
//        //String s1 = request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE).toString();
//        Enumeration headerNames = request.getHeaderNames();
//        String s2 = request.getHeader("dispositivo");
//        try {
//            SmausuarEntity user = smausuarRepository.findByNome(nome);
//            // Checa se voltou algum usuario
//            if (user == null) {
//                //throw new BaseMyException("Usuário (" + nome + ") não encontrado! - Mensagem Customizada.");
//                throw new BaseMyException(null);
//                //throw new RuntimeException("Usuário não encontrado! - Mensagem Customizada.");
//                //return new ResponseEntity<>("Username ", HttpStatus.UNAUTHORIZED);
//            }
//            boolean userIsAdmin = user.getAcessoTotal().equalsIgnoreCase("1");
//            // Pega os dados do usuario na tabela clifo
//            CfaclifoEntity cfaclifo = cfaclifoRepository.findById(user.getIdCfaclifo()).get();
//            // Cria os grupos de autoridades
//            List<GrantedAuthority> listAuthorityAdmin = AuthorityUtils.createAuthorityList("ROLE_ACTUATOR", "ROLE_USER", "ROLE_ADMIN");
//            List<GrantedAuthority> listAuthorityUser = AuthorityUtils.createAuthorityList("ROLE_USER");
//            userReturn = new User(user.getNome(),
//                    user.getSenha(),
//                    cfaclifo.getAtivo().equalsIgnoreCase("1"),
//                    true,
//                    true,
//                    true,
//                    (userIsAdmin ? listAuthorityAdmin : listAuthorityUser));
//        } catch (Exception ex) {
//            errorMessageEntity.setMessage(ex.getMessage());
//            throw new BaseMyException(errorMessageEntity);
//        }
//        return userReturn;
//    }

}
