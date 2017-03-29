/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;
import Entidades.Telefone;
import Entidades.Telefone;
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

public List<Telefone> buscarTudoOrdenado(){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Telefone.class);
    
    criterio.addOrder(Order.asc("ddd"));
    
    List<Telefone> telefones = criterio.list();
    sessao.close();    
    return telefones;
    }
    
    public List<Telefone> buscarPorPessoaCod(String pessoaCod){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Telefone.class);
    
    criterio.add(Restrictions.eq("pessoa_codigo", pessoaCod));
    
    criterio.addOrder(Order.asc("pessoa_codigo"));
    
    List<Telefone> telefones = criterio.list();
    sessao.close();    
    return telefones; 
    }
    
    public List<Telefone> buscarPorDddPcod(String ddd, String pessoaCod){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Telefone.class);
    
    criterio.add(Restrictions.eq("pessoa_codigo", pessoaCod));
    criterio.add(Restrictions.eq("ddd", ddd));
    
    criterio.addOrder(Order.asc("descricao"));
    
    List<Telefone> telefones = criterio.list();
    sessao.close();    
    return telefones; 
    }
}
