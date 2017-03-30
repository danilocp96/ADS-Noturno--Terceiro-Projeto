/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricanteMain;

import Entidades.Fabricante;
import Repositorios.FabricanteRepositorio;
import java.util.List;

/**
 *
 * @author Danilo
 */
public class FabricanteRepositorioTesteBuscarDescricaoCodigo {
    public static void main(String[] args) {
        FabricanteRepositorio fabricanteRepositorio = new FabricanteRepositorio();
         List<Fabricante> fabricantes = fabricanteRepositorio.buscarPorDescricaoCod("OMO", "1");
         for(Fabricante fabricante : fabricantes){
            System.out.println("Fabricante Encontrado");
            System.out.println("Codigo: " + fabricante.getCodigo());
            System.out.println("Descriçao: " + fabricante.getDescricao());
            
           
        } 
    }
}
