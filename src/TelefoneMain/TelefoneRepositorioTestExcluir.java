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
public class TelefoneRepositorioTestExcluir {
    public static void main(String[] args){
        TelefoneRepositorio telefoneRepositorio = new TelefoneRepositorio();
        Telefone telefone = telefoneRepositorio.buscarPorCodigo(1);
        System.out.println("Telefone Encontrada");
        telefoneRepositorio.excluir(telefone);
        System.out.println("Excluido");
    }
}
