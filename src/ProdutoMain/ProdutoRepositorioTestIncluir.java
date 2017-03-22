/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProdutoMain;

import Entidades.Categoria;
import Entidades.Produto;
import Entidades.Fabricante;
import Repositorios.CategoriaRepositorio;
import Repositorios.ProdutoRepositorio;
import Repositorios.FabricanteRepositorio;
import java.util.Date;

/**
 *
 * @author Alan
 */
public class ProdutoRepositorioTestIncluir {
    public static void main(String[] args) {
        Produto produto = new Produto();
        ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
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
        System.out.println("Produto inserida com sucesso!");
    }
}
