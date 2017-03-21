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
        pessoa.setNome("Joaozin Beira mar");
        pessoa.setCpf("111.555.777");
        PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
        pessoaRepositorio.inserir(pessoa);
        System.out.println("Pessoa inserido com sucesso!");
    }
}
