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
public class ItemVendaRepositorioTestExcluir {
    public static void main(String[] args){
        ItemVendaRepositorio itemItemVendaRepositorio = new ItemVendaRepositorio();
        ItemVenda itemItemVenda = itemItemVendaRepositorio.buscarPorCodigo(1);
        System.out.println("ItemVenda Encontrada");
        itemItemVendaRepositorio.excluir(itemItemVenda);
        System.out.println("Excluido");
    }
}
