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
public class VendaRepositorioTestBuscar {
    public static void main(String[] args) {
        
    VendaRepositorio vendaRepositorio = new VendaRepositorio();
        
        Venda venda = vendaRepositorio.buscarPorCodigo(1);
        
        System.out.println("Venda Encontrada");
        System.out.println("Codigo: " + venda.getCodigo());
        System.out.println("Data: " + venda.getDatatempo());
        System.out.println("Total: " + venda.getTotal());
        System.out.println("Funcionario: " + venda.getFuncionario().getPessoa().getNome());
    }
}
