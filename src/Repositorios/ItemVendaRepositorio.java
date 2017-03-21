/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;
import Entidades.ItemVenda;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Danilo Cardoso
 */
public class ItemVendaRepositorio {
    public void inserir(ItemVenda itemVenda){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(itemVenda);
        transacao.commit();
        sessao.close();
    }
public ItemVenda buscarPorCodigo(Integer codigo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        ItemVenda resultado = (ItemVenda) sessao.get(ItemVenda.class, codigo);
        sessao.close();
        return resultado;
    }
public void excluir(ItemVenda itemVenda){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(itemVenda);
        transacao.commit();
        sessao.close();
    }
public void editar(ItemVenda itemVenda){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(itemVenda);
        transacao.commit();
        sessao.close();
    }
}
