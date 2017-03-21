/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;
import Entidades.Produto;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Danilo Cardoso
 */
public class ProdutoRepositorio {
    public void inserir(Produto produto){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(produto);
        transacao.commit();
        sessao.close();
    }
public Produto buscarPorCodigo(Integer codigo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Produto resultado = (Produto) sessao.get(Produto.class, codigo);
        sessao.close();
        return resultado;
    }
public void excluir(Produto produto){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(produto);
        transacao.commit();
        sessao.close();
    }
public void editar(Produto produto){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(produto);
        transacao.commit();
        sessao.close();
    }
}
