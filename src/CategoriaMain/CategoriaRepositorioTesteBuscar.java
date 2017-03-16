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
 * @author Danilo Cardoso
 */
public class CategoriaRepositorioTesteBuscar {
    public static void main(String[] args) {
     CategoriaRepositorio categoriaRepositorio = new CategoriaRepositorio();
     Categoria categoria = categoriaRepositorio.buscarPorCodigo(1);
     System.out.println("Categoria encontrada:");
     System.out.println("Codigo: "+categoria.getCodigo());
     System.out.println("Descrição: " +categoria.getDescricao());
    }
}