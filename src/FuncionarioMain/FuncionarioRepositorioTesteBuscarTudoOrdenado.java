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
public class FuncionarioRepositorioTesteBuscarTudoOrdenado {
    public static void main(String[] args) {
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioRepositorio();
         List<Funcionario> funcionarios = funcionarioRepositorio.buscarTudoOrdenado();
         for(Funcionario funcionario : funcionarios){
            System.out.println("Funcionario Encontrado");
            System.out.println("Codigo: " + funcionario.getCodigo());
            System.out.println("Pis: " + funcionario.getPis());
            System.out.println("Carteira de Trabalho: " + funcionario.getCarteiraDeTrabalho());
           
            
            
           
        } 
    }
}
