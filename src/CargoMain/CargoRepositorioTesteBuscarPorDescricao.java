/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargoMain;

import Entidades.Cargo;
import Repositorios.CargoRepositorio;
import java.util.List;

/**
 *
 * @author Danilo
 */
public class CargoRepositorioTesteBuscarPorDescricao {
    public static void main(String[] args) {
        CargoRepositorio cargoRepositorio = new CargoRepositorio();
         List<Cargo> cargos = cargoRepositorio.buscarPorDescricao("Sabao em po");
         for(Cargo cargo : cargos){
            System.out.println("Cargo Encontrado");
            System.out.println("Codigo: " + cargo.getCodigo());
            System.out.println("Descriçao: " + cargo.getDescricao());
           
        }
    }
}