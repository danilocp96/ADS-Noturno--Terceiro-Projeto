/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelefoneMain;

import Entidades.Telefone;
import Entidades.Pessoa;
import Repositorios.TelefoneRepositorio;
import Repositorios.PessoaRepositorio;

/**
 *
 * @author Alan
 */
public class TelefoneRepositorioTestIncluir {
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        
        PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
        Pessoa pessoa = pessoaRepositorio.buscarPorCodigo(1);
        
        telefone.setDdd(14);
        telefone.setNumero(40028922);
        telefone.setPessoa(pessoa);
  
        TelefoneRepositorio telefoneRepositorio = new TelefoneRepositorio();
        telefoneRepositorio.inserir(telefone);
        System.out.println("Telefone inserido com sucesso!");
    }
}
