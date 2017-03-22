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
 * @author Alan
 */
public class FuncionarioCargoRepositorioTesteExcluir {
    public static void main(String[] args){
        FuncionarioCargoRepositorio funcionarioCargoRepositorio = new FuncionarioCargoRepositorio();
        FuncionarioCargo funcionarioCargo = funcionarioCargoRepositorio.buscarPorCodigo(1);
        System.out.println("FuncionarioCargo Encontrada");
        funcionarioCargoRepositorio.excluir(funcionarioCargo);
        System.out.println("Excluido");
    }
}
