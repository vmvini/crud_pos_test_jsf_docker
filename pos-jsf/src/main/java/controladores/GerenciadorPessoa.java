/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author marcelo
 */
@ManagedBean(name = "gerenciadorPessoa")
@SessionScoped
public class GerenciadorPessoa {
        
    @EJB
    PessoaService pessoaService;
    Pessoa pessoa;
    
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
