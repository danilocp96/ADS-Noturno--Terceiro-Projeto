/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CategoriaMain;

import Entidades.Categoria;
import Repositorios.CategoriaRepositorio;
import java.util.List;

/**
 *
 * @author Danilo
 */
public class CategoriaRepositorioTesteBuscarTudoOrdenado {
      public static void main(String[] args) {
        CategoriaRepositorio categoriaRepositorio = new CategoriaRepositorio();
         List<Categoria> categorias = categoriaRepositorio.buscarTudoOrdenado();
         for(Categoria categoria : categorias){
            System.out.println("Categoria Encontrada");
            System.out.println("Codigo: " + categoria.getCodigo());
            System.out.println("Descriçao: " + categoria.getDescricao());
           
        }
    }
}
