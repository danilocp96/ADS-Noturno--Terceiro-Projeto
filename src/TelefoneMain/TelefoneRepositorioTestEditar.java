/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelefoneMain;

import Entidades.Telefone;
import Entidades.Pessoa;
import Repositorios.TelefoneRepositorio;
import Repositorios.PessoaRepositorio;

/**
 *
 * @author Alan
 */
public class TelefoneRepositorioTestEditar {
    public static void main(String[] args) {
        TelefoneRepositorio telefoneRepositorio = new TelefoneRepositorio();
        
        Telefone telefone = telefoneRepositorio.buscarPorCodigo(1);
        
        System.out.println("Telefone Encontrado");
        PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
        Pessoa pessoa = pessoaRepositorio.buscarPorCodigo(1);
        
        telefone.setDdd(18);
        telefone.setNumero(45612398);
        telefone.setPessoa(pessoa);
        telefoneRepositorio.editar(telefone);
        System.out.println("Telefone alterado com sucesso!");
    }
}
