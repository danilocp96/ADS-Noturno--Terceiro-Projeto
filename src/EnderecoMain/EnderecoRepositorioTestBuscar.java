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
public class EnderecoRepositorioTestBuscar {
    public static void main(String[] args) {
        
    EnderecoRepositorio enderecoRepositorio = new EnderecoRepositorio();
        
        Endereco endereco = enderecoRepositorio.buscarPorCodigo(1);
        
        System.out.println("Endereco Encontrada");
        System.out.println("Codigo: " + endereco.getCodigo());
        System.out.println("Logradouro: " + endereco.getLogadouro());
        System.out.println("Numero: " + endereco.getNumero());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("Estado: " + endereco.getEstado());
        System.out.println("Pessoa: " + endereco.getPessoa().getNome());
        
    }
}
