/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PessoaMain;

import Entidades.Pessoa;
import Repositorios.PessoaRepositorio;
import java.util.List;

/**
 *
 * @author Alan
 */
public class PessoaRepositorioTesteBuscarPorNome {
    public static void main(String[] args) {
        
    

    PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
        
        List<Pessoa> pessoas = pessoaRepositorio.buscarPorNome("José Silva Sauron");
        
        for(Pessoa pessoa : pessoas){
            System.out.println("Pessoa Encontrada");
            System.out.println("Codigo: " + pessoa.getCodigo());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Cpf: " + pessoa.getCpf());

        }
    }
}