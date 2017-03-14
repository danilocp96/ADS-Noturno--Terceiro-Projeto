/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Categoria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Alan
 */
public class CategoriaRepositorio {
        public void inserir(Categoria categoria){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(categoria);
        transacao.commit();
        sessao.close();
    }
public Categoria buscarPorCodigo(Integer codigo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Categoria resultado = (Categoria) sessao.get(Categoria.class, codigo);
        sessao.close();
        return resultado;
    }
public void excluir(Categoria categoria){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(categoria);
        transacao.commit();
        sessao.close();
    }
public void editar(Categoria categoria){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(categoria);
        transacao.commit();
        sessao.close();
    }
}
