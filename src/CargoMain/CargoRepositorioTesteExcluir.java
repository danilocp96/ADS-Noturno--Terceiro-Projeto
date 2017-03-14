/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargoMain;

import Entidades.Cargo;
import Repositorios.CargoRepositorio;

/**
 *
 * @author Danilo Cardoso
 */
public class CargoRepositorioTesteExcluir {
    public static void main(String[] args) {
     CargoRepositorio cargoRepositorio = new CargoRepositorio();
     Cargo cargo = cargoRepositorio.buscarPorCodigo(1);
     System.out.println("Cargo encontrado:");
     System.out.println("Codigo: "+cargo.getCodigo());
     System.out.println("Descrição: " +cargo.getDescricao());
     
     cargoRepositorio.excluir(cargo);
     System.out.println("Cargo excluido");
    }
}
