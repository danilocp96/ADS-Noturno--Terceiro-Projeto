/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioMain;

import Entidades.Funcionario;
import Repositorios.FuncionarioRepositorio;

/**
 *
 * @author Danilo
 */
public class FuncionariooRepositorioTesteExcluir {
    public static void main(String[] args) {
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioRepositorio();
        Funcionario funcionario = funcionarioRepositorio.buscarPorCodigo(2);
        System.out.println("Funcionario Encontrada");
        funcionarioRepositorio.excluir(funcionario);
        System.out.println("Excluido");
        
    }
}
