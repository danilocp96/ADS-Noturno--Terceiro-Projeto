/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnderecoMain;

import Entidades.Endereco;
import Entidades.Pessoa;
import Repositorios.EnderecoRepositorio;
import Repositorios.PessoaRepositorio;

/**
 *
 * @author Alan
 */
public class EnderecoRepositorioTestEditar {
    public static void main(String[] args) {
        EnderecoRepositorio enderecoRepositorio = new EnderecoRepositorio();
        
        Endereco endereco = enderecoRepositorio.buscarPorCodigo(1);
        
        System.out.println("Endereco Encontrado");
        PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
        Pessoa pessoa = pessoaRepositorio.buscarPorCodigo(1);
        
        endereco.setLogadouro("Rua Altino Arantes");
        endereco.setNumero(456);
        endereco.setBairro("Centro");
        endereco.setCidade("Ourinhos");
        endereco.setEstado("São Paulo");
        endereco.setPessoa(pessoa);
        endereco.setComplemento("Apartamento");
        enderecoRepositorio.editar(endereco);
        System.out.println("Endereco alterado com sucesso!");
    }
}
