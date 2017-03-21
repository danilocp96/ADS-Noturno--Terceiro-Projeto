/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;
import Entidades.Telefone;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Danilo Cardoso
 */
public class TelefoneRepositorio {
    public void inserir(Telefone telefone){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(telefone);
        transacao.commit();
        sessao.close();
    }
public Telefone buscarPorCodigo(Integer codigo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Telefone resultado = (Telefone) sessao.get(Telefone.class, codigo);
        sessao.close();
        return resultado;
    }
public void excluir(Telefone telefone){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(telefone);
        transacao.commit();
        sessao.close();
    }
public void editar(Telefone telefone){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(telefone);
        transacao.commit();
        sessao.close();
    }
}
