/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioCargoMain;

import Entidades.FuncionarioCargo;
import Repositorios.FuncionarioCargoRepositorio;

/**
 *
 * @author Danilo
 */
public class FuncionarioCargoRepositorioTesteBuscar {
    public static void main(String[] args) {
        FuncionarioCargoRepositorio funcionarioCargoRepositorio = new FuncionarioCargoRepositorio();
        FuncionarioCargo funcionarioCargo = funcionarioCargoRepositorio.buscarPorCodigo(2);
        System.out.println("Funcionario encontrado:");
        System.out.println("Codigo: "+funcionarioCargo.getCodigo());
        System.out.println("Admissao: " +funcionarioCargo.getAdmissao());
        System.out.println("Demissao: " +funcionarioCargo.getDemissao());
        System.out.println("Salario: "+funcionarioCargo.getSalario());
        System.out.println("Nome: "+funcionarioCargo.getFuncionario().getPessoa().getNome());
        System.out.println("Cargo: "+funcionarioCargo.getCargo().getDescricao());
       
          
    }
}
