/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;
import Entidades.Venda;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Danilo Cardoso
 */
public class VendaRepositorio {
    public void inserir(Venda venda){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(venda);
        transacao.commit();
        sessao.close();
    }
public Venda buscarPorCodigo(Integer codigo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Venda resultado = (Venda) sessao.get(Venda.class, codigo);
        sessao.close();
        return resultado;
    }
public void excluir(Venda venda){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(venda);
        transacao.commit();
        sessao.close();
    }
public void editar(Venda venda){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(venda);
        transacao.commit();
        sessao.close();
    }
}
