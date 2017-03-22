/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendaMain;

import Entidades.Venda;
import Entidades.Funcionario;
import Repositorios.VendaRepositorio;
import Repositorios.FuncionarioRepositorio;
import java.util.Date;

/**
 *
 * @author Alan
 */
public class VendaRepositorioTestEditar {
    public static void main(String[] args) {
        VendaRepositorio vendaRepositorio = new VendaRepositorio();
        
        Venda venda = vendaRepositorio.buscarPorCodigo(1);
        
        System.out.println("Venda Encontrado");
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioRepositorio();
        Funcionario funcionario = funcionarioRepositorio.buscarPorCodigo(1);
        
        venda.setDatatempo(new Date());
        venda.setTotal(900f);
        venda.setFuncionario(funcionario);
        vendaRepositorio.editar(venda);
        System.out.println("Venda alterada com sucesso!");
    }
}
