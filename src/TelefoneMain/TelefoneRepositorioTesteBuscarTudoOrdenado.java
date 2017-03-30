/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelefoneMain;

import Entidades.Telefone;
import Repositorios.TelefoneRepositorio;
import java.util.List;

/**
 *
 * @author Danilo
 */
public class TelefoneRepositorioTesteBuscarTudoOrdenado {
    public static void main(String[] args) {
        TelefoneRepositorio telefoneRepositorio = new TelefoneRepositorio();
         List<Telefone> telefones = telefoneRepositorio.buscarTudoOrdenado();
         for(Telefone telefone : telefones){
            System.out.println("Telefone Encontrado");
            System.out.println("Codigo: " + telefone.getCodigo());
            System.out.println("DDD: " + telefone.getDdd());
            System.out.println("Numero: " + telefone.getNumero());
            System.out.println("Nome Pessoa: " + telefone.getPessoa());
            
            
           
            
            
           
        } 
    }
}
