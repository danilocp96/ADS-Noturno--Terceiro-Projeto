/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;
import Entidades.Fabricante;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Danilo Cardoso
 */
public class FabricanteRepositorio {
    public void inserir(Fabricante fabricante){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(fabricante);
        transacao.commit();
        sessao.close();
    }
public Fabricante buscarPorCodigo(Integer codigo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Fabricante resultado = (Fabricante) sessao.get(Fabricante.class, codigo);
        sessao.close();
        return resultado;
    }
public void excluir(Fabricante fabricante){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(fabricante);
        transacao.commit();
        sessao.close();
    }
public void editar(Fabricante fabricante){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(fabricante);
        transacao.commit();
        sessao.close();
    }
}
