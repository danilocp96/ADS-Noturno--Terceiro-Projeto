/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioMain;

import Entidades.Funcionario;
import Entidades.Pessoa;
import Repositorios.FuncionarioRepositorio;
import Repositorios.PessoaRepositorio;

/**
 *
 * @author Danilo
 */
public class FuncionarioRepositorioTesteEditar {
    public static void main(String[] args) {
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioRepositorio();
        Funcionario funcionario = new Funcionario();
        PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
        Pessoa pessoa = pessoaRepositorio.buscarPorCodigo(1);
        
        funcionario.setCarteiraDeTrabalho("88799926");
        funcionario.setPis("212555722");
        funcionario.setPessoa(pessoa);
        System.out.println("Funcionario alterado com sucesso!");
        
    }
}
