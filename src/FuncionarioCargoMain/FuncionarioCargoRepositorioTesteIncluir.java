/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioCargoMain;

import Entidades.Cargo;
import Entidades.Funcionario;
import Entidades.FuncionarioCargo;
import Repositorios.CargoRepositorio;
import Repositorios.FuncionarioCargoRepositorio;
import Repositorios.FuncionarioRepositorio;
import java.util.Date;

/**
 *
 * @author Danilo
 */
public class FuncionarioCargoRepositorioTesteIncluir {
    public static void main(String[] args) {
        FuncionarioCargo funcionarioCargo = new FuncionarioCargo();
        FuncionarioCargoRepositorio funcionarioCargoRepositorio = new FuncionarioCargoRepositorio();
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioRepositorio();
        Funcionario funcionario = funcionarioRepositorio.buscarPorCodigo(1);
        CargoRepositorio cargoRepositorio = new CargoRepositorio();
        Cargo cargo = cargoRepositorio.buscarPorCodigo(1);
        
        
        funcionarioCargo.setAdmissao();
        funcionarioCargo.setDemissao();
        funcionarioCargo.setSalario(1588.00f);
        funcionarioCargo.setFuncionario(funcionario);
        funcionarioCargo.setCargo(cargo);
        funcionarioCargoRepositorio.inserir(funcionarioCargo);
        
    }
}
