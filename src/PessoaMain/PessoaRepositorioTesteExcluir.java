/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PessoaMain;

import Entidades.Pessoa;
import Repositorios.PessoaRepositorio;

/**
 *
 * @author Danilo
 */
public class PessoaRepositorioTesteExcluir {
     public static void main(String[] args) {
     PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
     Pessoa pessoa = pessoaRepositorio.buscarPorCodigo(1);
     System.out.println("Pessoa encontrada:");
     System.out.println("Codigo: "+pessoa.getCodigo());
     System.out.println("Descrição: " +pessoa.getNome());
     System.out.println("CPF: " +pessoa.getCpf());
     
     pessoaRepositorio.excluir(pessoa);
     System.out.println("Pessoa excluida");
    }
}
