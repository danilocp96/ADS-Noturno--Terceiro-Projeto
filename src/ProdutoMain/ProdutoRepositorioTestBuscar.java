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
public class ProdutoRepositorioTestBuscar {
    public static void main(String[] args) {
        
    ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
        
        Produto produto = produtoRepositorio.buscarPorCodigo(1);
        
        System.out.println("Produto Encontrada");
        System.out.println("Codigo: " + produto.getCodigo());
        System.out.println("Descricao: " + produto.getDescricao());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Fabricante: " + produto.getFabricante().getDescricao());
        System.out.println("Categoria: " + produto.getCategoria().getDescricao());
        
    }
}
