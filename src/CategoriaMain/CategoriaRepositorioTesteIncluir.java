/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CategoriaMain;

import Entidades.Categoria;
import Repositorios.CategoriaRepositorio;

/**
 *
 * @author Alan
 */
public class CategoriaRepositorioTesteIncluir {
   public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setDescricao("Produto");
        CategoriaRepositorio categoriaRepositorio = new CategoriaRepositorio();
        categoriaRepositorio.inserir(categoria);
        System.out.println("Categoria inserido com sucesso!");
    } 
}
