/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;
import Entidades.Endereco;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Danilo Cardoso
 */
public class EnderecoRepositorio {
    public void inserir(Endereco endereco){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(endereco);
        transacao.commit();
        sessao.close();
    }
public Endereco buscarPorCodigo(Integer codigo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Endereco resultado = (Endereco) sessao.get(Endereco.class, codigo);
        sessao.close();
        return resultado;
    }
public void excluir(Endereco endereco){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(endereco);
        transacao.commit();
        sessao.close();
    }
public void editar(Endereco endereco){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(endereco);
        transacao.commit();
        sessao.close();
    }
}
