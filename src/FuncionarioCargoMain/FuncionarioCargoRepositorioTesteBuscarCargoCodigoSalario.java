/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioCargoMain;

import Entidades.FuncionarioCargo;
import Repositorios.FuncionarioCargoRepositorio;
import java.util.List;

/**
 *
 * @author Danilo
 */
public class FuncionarioCargoRepositorioTesteBuscarCargoCodigoSalario {
    public static void main(String[] args) {
        FuncionarioCargoRepositorio funcionarioCargoRepositorio = new FuncionarioCargoRepositorio();
         List<FuncionarioCargo> funcionarioCargos = funcionarioCargoRepositorio.buscarPorCargoCodSalario("1", "600,000");
         for(FuncionarioCargo funcionarioCargo : funcionarioCargos){
            System.out.println("FuncionarioCargo Encontrado");
            System.out.println("Codigo: " + funcionarioCargo.getCodigo());
            System.out.println("Admissao: " + funcionarioCargo.getAdmissao());
            System.out.println("Demissao: " + funcionarioCargo.getDemissao());
            System.out.println("Nome do Funcionario: " + funcionarioCargo.getFuncionario());
            System.out.println("Salario: " + funcionarioCargo.getSalario());
            System.out.println("Cargo: " + funcionarioCargo.getCargo());
            
            
           
        } 
    }
}
