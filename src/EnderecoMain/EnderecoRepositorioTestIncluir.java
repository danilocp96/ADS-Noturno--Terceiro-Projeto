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
public class EnderecoRepositorioTestIncluir {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        
        PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
        Pessoa pessoa = pessoaRepositorio.buscarPorCodigo(1);
        
        endereco.setLogadouro("Rua Benjamin Constant");
        endereco.setNumero(371);
        endereco.setBairro("Centro");
        endereco.setCidade("Ourinhos");
        endereco.setEstado("São Paulo");
        endereco.setPessoa(pessoa);
        endereco.setComplemento("Apartamento");
        EnderecoRepositorio enderecoRepositorio = new EnderecoRepositorio();
        enderecoRepositorio.inserir(endereco);
        System.out.println("Endereco inserida com sucesso!");
    }
}
