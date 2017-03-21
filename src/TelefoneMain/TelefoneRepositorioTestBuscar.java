/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelefoneMain;

import Entidades.Telefone;
import Repositorios.TelefoneRepositorio;

/**
 *
 * @author Alan
 */
public class TelefoneRepositorioTestBuscar {
    public static void main(String[] args) {
        TelefoneRepositorio telefoneRepositorio = new TelefoneRepositorio();
        
        Telefone telefone = telefoneRepositorio.buscarPorCodigo(1);
        
        System.out.println("Telefone Encontrado");
        System.out.println("DDD: " + telefone.getDdd());
        System.out.println("Telefone: " + telefone.getNumero());
        System.out.println("Pessoa: " + telefone.getPessoa().getNome());
    }
}
