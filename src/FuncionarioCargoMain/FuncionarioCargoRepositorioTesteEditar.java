/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioCargoMain;

import Entidades.Cargo;
import Entidades.Funcionario;
import Entidades.FuncionarioCargo;
import Entidades.Pessoa;
import Repositorios.CargoRepositorio;
import Repositorios.FuncionarioCargoRepositorio;
import Repositorios.FuncionarioRepositorio;
import Repositorios.PessoaRepositorio;
import java.util.Date;

/**
 *
 * @author Alan
 */
public class FuncionarioCargoRepositorioTesteEditar {
    public static void main(String[] args) {
        FuncionarioCargo funcionarioCargo = new FuncionarioCargo();
        FuncionarioCargoRepositorio funcionarioCargoRepositorio = new FuncionarioCargoRepositorio();
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioRepositorio();
        Funcionario funcionario = funcionarioRepositorio.buscarPorCodigo(1);
        CargoRepositorio cargoRepositorio = new CargoRepositorio();
        Cargo cargo = cargoRepositorio.buscarPorCodigo(1);
        
        funcionarioCargo.setAdmissao(new Date(117, 01, 11, 23, 00,58));
        funcionarioCargo.setDemissao(new Date(117, 01, 11, 23, 00,59));
        funcionarioCargo.setSalario(1598.00f);
        funcionarioCargo.setFuncionario(funcionario);
        funcionarioCargo.setCargo(cargo);
        funcionarioCargoRepositorio.inserir(funcionarioCargo);
        
        System.out.println("Funcionario alterado com sucesso!");
    }
}
