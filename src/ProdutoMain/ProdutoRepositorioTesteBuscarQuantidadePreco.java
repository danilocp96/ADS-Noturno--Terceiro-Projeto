/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProdutoMain;

import Entidades.Produto;
import Repositorios.ProdutoRepositorio;
import java.util.List;

/**
 *
 * @author Danilo
 */
public class ProdutoRepositorioTesteBuscarQuantidadePreco {
    public static void main(String[] args) {
        ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
         List<Produto> produtos = produtoRepositorio.buscarPorQtdPreco("20", "5,99");
         for(Produto produto : produtos){
            System.out.println("Produto Encontrado");
            System.out.println("Codigo: " + produto.getCodigo());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("Fabricante: " + produto.getFabricante());
            System.out.println("Preco: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQuantidade());
           
            
            
           
        } 
    }
}
