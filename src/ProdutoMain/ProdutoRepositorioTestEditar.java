/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProdutoMain;

import Entidades.Categoria;
import Entidades.Fabricante;

import Entidades.Produto;

import Repositorios.CategoriaRepositorio;
import Repositorios.FabricanteRepositorio;

import Repositorios.ProdutoRepositorio;
import Repositorios.ProdutoRepositorio;

/**
 *
 * @author Alan
 */
public class ProdutoRepositorioTestEditar {
    public static void main(String[] args) {
       ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
       Produto produto = produtoRepositorio.buscarPorCodigo(1);
        
        System.out.println("ItemProduto Encontrado");
        FabricanteRepositorio fabricanteRepositorio = new FabricanteRepositorio();
        Fabricante fabricante = fabricanteRepositorio.buscarPorCodigo(1);
        CategoriaRepositorio categoriaRepositorio = new CategoriaRepositorio();
        Categoria categoria = categoriaRepositorio.buscarPorCodigo(1);
        
        produto.setQuantidade(10);
        produto.setDescricao("Nescau");
        produto.setPreco(10f);
        produto.setFabricante(fabricante);
        produto.setCategoria(categoria);
        produtoRepositorio.inserir(produto);
        produtoRepositorio.editar(produto);
        System.out.println("Produto alterada com sucesso!");
    }
}
