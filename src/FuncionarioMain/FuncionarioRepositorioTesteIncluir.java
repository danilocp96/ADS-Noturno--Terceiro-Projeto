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
public class FuncionarioRepositorioTesteIncluir {
    public static void main(String[] args) {
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioRepositorio();
        Funcionario funcionario = new Funcionario();
        PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
        Pessoa pessoa = pessoaRepositorio.buscarPorCodigo(2);
        
        funcionario.setCarteiraDeTrabalho("123456999");
        funcionario.setPis("884545545");
        funcionario.setPessoa(pessoa);
        funcionarioRepositorio.inserir(funcionario);
        System.out.println("Funcionario inserido com sucesso!");
        
    }
}
