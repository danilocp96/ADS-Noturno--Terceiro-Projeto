/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendaMain;

import Entidades.Venda;
import Repositorios.VendaRepositorio;

/**
 *
 * @author Alan
 */
public class VendaRepositorioTestExcluir {
    public static void main(String[] args){
        VendaRepositorio vendaRepositorio = new VendaRepositorio();
        Venda venda = vendaRepositorio.buscarPorCodigo(1);
        System.out.println("Venda Encontrada");
        vendaRepositorio.excluir(venda);
        System.out.println("Excluido");
    }
}
