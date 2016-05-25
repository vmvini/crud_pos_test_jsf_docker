/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pos.dao;

import ifpb.pos.Pessoa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Antônio
 */

@Stateless
public class PessoaService {
    @PersistenceContext(name = "pos-jsf-crud")
    EntityManager em;
    
    public void salvar(Pessoa pessoa){
        em.persist(pessoa);
    }
    
    public List<Pessoa> listarTodas(){
    return em.createQuery("from Pessoa",Pessoa.class).getResultList();
    }
}
