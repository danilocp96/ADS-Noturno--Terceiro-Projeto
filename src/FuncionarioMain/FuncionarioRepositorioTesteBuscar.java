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
public class FuncionarioRepositorioTesteBuscar {
    public static void main(String[] args) {
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioRepositorio();
        Funcionario funcionario = funcionarioRepositorio.buscarPorCodigo(2);
        System.out.println("Funcionario encontrado:");
        System.out.println("Codigo: "+funcionario.getCodigo());
        System.out.println("PIS: " +funcionario.getPis());
        System.out.println("Carteira de trabalho: " +funcionario.getCarteiraDeTrabalho());
        System.out.println("Nome: " +funcionario.getPessoa().getNome() );
       
          
    }
}
