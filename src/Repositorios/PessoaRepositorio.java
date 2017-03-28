/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;
import Entidades.Pessoa;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

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

public List<Pessoa> buscarTudoOrdenado(){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Pessoa.class);
    
    criterio.addOrder(Order.asc("nome"));
    
    List<Pessoa> pessoas = criterio.list();
    sessao.close();    
    return pessoas;
    }
    
    public List<Pessoa> buscarPorNome(String nome){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Pessoa.class);
    
    criterio.add(Restrictions.eq("nome", nome));
    
    criterio.addOrder(Order.asc("nome"));
    
    List<Pessoa> pessoas = criterio.list();
    sessao.close();    
    return pessoas; 
    }
    
    public List<Pessoa> buscarPorNomeCPF(String nome, String cpf){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Pessoa.class);
    
    criterio.add(Restrictions.eq("nome", nome));
    criterio.add(Restrictions.eq("cpf", cpf));
    
    criterio.addOrder(Order.asc("nome"));
    
    List<Pessoa> pessoas = criterio.list();
    sessao.close();    
    return pessoas; 
    }
}
