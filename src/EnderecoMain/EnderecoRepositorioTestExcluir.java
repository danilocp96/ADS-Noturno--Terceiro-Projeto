/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnderecoMain;

import Entidades.Endereco;
import Repositorios.EnderecoRepositorio;

/**
 *
 * @author Alan
 */
public class EnderecoRepositorioTestExcluir {
    public static void main(String[] args){
        EnderecoRepositorio enderecoRepositorio = new EnderecoRepositorio();
        Endereco endereco = enderecoRepositorio.buscarPorCodigo(1);
        System.out.println("Endereco Encontrada");
        enderecoRepositorio.excluir(endereco);
        System.out.println("Excluido");
    }
}
