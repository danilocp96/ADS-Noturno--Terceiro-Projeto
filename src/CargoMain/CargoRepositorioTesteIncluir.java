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
public class CargoRepositorioTesteIncluir {
    public static void main(String[] args) {
        Cargo cargo = new Cargo();
        cargo.setDescricao("Vendedor");
        CargoRepositorio cargoRepositorio = new CargoRepositorio();
        cargoRepositorio.inserir(cargo);
        System.out.println("Cargo inserido com sucesso!");
    }
}
