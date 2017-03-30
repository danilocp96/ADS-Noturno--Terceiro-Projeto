/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnderecoMain;

import Entidades.Endereco;
import Repositorios.EnderecoRepositorio;
import java.util.List;

/**
 *
 * @author Danilo
 */
public class EnderecoRepositorioTesteBuscarPessoaCodigo {
      public static void main(String[] args) {
        EnderecoRepositorio enderecoRepositorio = new EnderecoRepositorio();
         List<Endereco> enderecos = enderecoRepositorio.buscarPorPessoaCod("1");
         for(Endereco endereco : enderecos){
            System.out.println("Endereco Encontrada");
            System.out.println("Codigo: " + endereco.getCodigo());
            System.out.println("Logradouro: " + endereco.getLogadouro());
            System.out.println("Bairro: " + endereco.getBairro());
            System.out.println("Complemento: " + endereco.getComplemento());
            System.out.println("Cidade: " + endereco.getCidade());
            System.out.println("Estaado: " + endereco.getEstado());
       
           
        }
    }
}
