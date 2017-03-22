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
public class PessoaRepositorioTesteIncluir {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria teste");
        pessoa.setCpf("433.697.464");
        PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
        pessoaRepositorio.inserir(pessoa);
        System.out.println("Pessoa inserida com sucesso!");
    }
}
