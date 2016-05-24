/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import ifpb.pos.Pessoa;
import ifpb.pos.dao.PessoaService;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author marcelo
 */
@Named
@RequestScoped
public class GerenciadorPessoa {
        
    @Inject
    private PessoaService pessoaService;
    private Pessoa pessoa;
    
    public GerenciadorPessoa() {
        this.pessoa = new Pessoa();
    }    
    
    public String salvarPessoa(){
        pessoaService.salvar(pessoa);
        this.pessoa = new Pessoa();
        return null;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
