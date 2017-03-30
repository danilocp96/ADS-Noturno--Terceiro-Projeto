/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioMain;

import Entidades.Funcionario;
import Repositorios.FuncionarioRepositorio;
import java.util.List;

/**
 *
 * @author Danilo
 */
public class FuncionarioRepositorioTesteBuscarPisCT {
    public static void main(String[] args) {
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioRepositorio();
         List<Funcionario> funcionarios = funcionarioRepositorio.buscarPorPisCt("55152222", "3131666999");
         for(Funcionario funcionario : funcionarios){
            System.out.println("Funcionario Encontrado");
            System.out.println("Codigo: " + funcionario.getCodigo());
            System.out.println("Pis: " + funcionario.getPis());
            System.out.println("Carteira de Trabalho: " + funcionario.getCarteiraDeTrabalho());
           
            
            
           
        } 
    }
}
