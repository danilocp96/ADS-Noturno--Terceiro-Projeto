/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ItemVendaMain;

import Entidades.ItemVenda;
import Entidades.Produto;
import Entidades.Venda;
import Repositorios.ItemVendaRepositorio;
import Repositorios.ProdutoRepositorio;
import Repositorios.VendaRepositorio;
import java.util.Date;

/**
 *
 * @author Alan
 */
public class ItemVendaRepositorioTestIncluir {
    public static void main(String[] args) {
        ItemVenda itemVenda = new ItemVenda();
        ItemVendaRepositorio itemVendaRepositorio = new ItemVendaRepositorio();
        VendaRepositorio vendaRepositorio = new VendaRepositorio();
        Venda venda = vendaRepositorio.buscarPorCodigo(1);
        ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
        Produto produto = produtoRepositorio.buscarPorCodigo(1);
        
        itemVenda.setQuantidade(10);
        itemVenda.setValorParcial(112f);
        itemVenda.setVenda(venda);
        itemVenda.setProduto(produto);
        itemVendaRepositorio.inserir(itemVenda);
        System.out.println("ItemVenda inserida com sucesso!");
    }
}
