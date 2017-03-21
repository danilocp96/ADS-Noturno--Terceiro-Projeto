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
public class PessoaRepositorioTesteBuscar {
    public static void main(String[] args) {
         
     PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
     Pessoa pessoa = pessoaRepositorio.buscarPorCodigo(1);
     System.out.println("Pessoa encontrado:");
     System.out.println("Codigo: "+pessoa.getCodigo());
     System.out.println("Nome: " +pessoa.getNome());
     System.out.println("CPF: " +pessoa.getCpf());
     
    }
}
