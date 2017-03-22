/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ItemVendaMain;

import Entidades.ItemVenda;
import Repositorios.ItemVendaRepositorio;

/**
 *
 * @author Alan
 */
public class ItemVendaRepositorioTestBuscar {
    public static void main(String[] args) {
        
    ItemVendaRepositorio itemVendaRepositorio = new ItemVendaRepositorio();
        
        ItemVenda itemVenda = itemVendaRepositorio.buscarPorCodigo(1);
        
        System.out.println("ItemVenda Encontrada");
        System.out.println("Codigo: " + itemVenda.getCodigo());
        System.out.println("Produto: " + itemVenda.getProduto().getDescricao());
        System.out.println("Quantidade: " + itemVenda.getQuantidade());
        System.out.println("Valor Parcial: " + itemVenda.getValorParcial());
        System.out.println("Codigo Venda: " + itemVenda.getVenda().getCodigo());
    }
}
