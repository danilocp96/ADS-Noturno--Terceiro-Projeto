/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricanteMain;

import Entidades.Fabricante;
import Repositorios.FabricanteRepositorio;

/**
 *
 * @author Alan
 */
public class FabricanteRepositorioTesteIncluir {
     public static void main(String[] args) {
        Fabricante fabricante = new Fabricante();
        fabricante.setDescricao("Conquista");
        FabricanteRepositorio fabricanteRepositorio = new FabricanteRepositorio();
        fabricanteRepositorio.inserir(fabricante);
        System.out.println("Fabricante inserido com sucesso!");
    }
}
