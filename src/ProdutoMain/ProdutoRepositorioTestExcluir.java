/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProdutoMain;

import Entidades.Produto;
import Repositorios.ProdutoRepositorio;

/**
 *
 * @author Alan
 */
public class ProdutoRepositorioTestExcluir {
    public static void main(String[] args){
        ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
        Produto produto = produtoRepositorio.buscarPorCodigo(1);
        System.out.println("Produto Encontrada");
        produtoRepositorio.excluir(produto);
        System.out.println("Excluido");
    }
}
