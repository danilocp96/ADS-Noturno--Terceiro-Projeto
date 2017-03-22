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
public class VendaRepositorioTestIncluir {
    public static void main(String[] args) {
        Venda venda = new Venda();
        VendaRepositorio vendaRepositorio = new VendaRepositorio();
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioRepositorio();
        Funcionario funcionario = funcionarioRepositorio.buscarPorCodigo(1);
        
        venda.setDatatempo(new Date());
        venda.setTotal(800f);
        venda.setFuncionario(funcionario);
        vendaRepositorio.inserir(venda);
        System.out.println("Venda inserida com sucesso!");
    }
}
