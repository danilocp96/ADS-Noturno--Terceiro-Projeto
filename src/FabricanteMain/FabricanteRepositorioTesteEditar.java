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
 * @author Danilo Cardoso
 */
public class FabricanteRepositorioTesteEditar {
    public static void main(String[] args) {
     FabricanteRepositorio fabricanteRepositorio = new FabricanteRepositorio();
     Fabricante fabricante = fabricanteRepositorio.buscarPorCodigo(1);
     System.out.println("Fabricante encontrado:");
     System.out.println("Codigo: "+fabricante.getCodigo());
     System.out.println("Descrição: " +fabricante.getDescricao());
     fabricante.setDescricao("Garoto");
     fabricanteRepositorio.editar(fabricante);
        System.out.println("Editado com sucesso");
     }
}
