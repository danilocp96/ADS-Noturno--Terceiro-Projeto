/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;
import Entidades.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Danilo Cardoso
 */
public class PessoaRepositorio {
    public void inserir(Pessoa pessoa){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(pessoa);
        transacao.commit();
        sessao.close();
    }
public Pessoa buscarPorCodigo(Integer codigo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Pessoa resultado = (Pessoa) sessao.get(Pessoa.class, codigo);
        sessao.close();
        return resultado;
    }
public void excluir(Pessoa pessoa){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(pessoa);
        transacao.commit();
        sessao.close();
    }
public void editar(Pessoa pessoa){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(pessoa);
        transacao.commit();
        sessao.close();
    }
}
