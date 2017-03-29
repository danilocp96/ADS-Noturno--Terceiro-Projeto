/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Cargo;
import Entidades.Cargo;
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
public class CargoRepositorio {
    public void inserir(Cargo cargo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(cargo);
        transacao.commit();
        sessao.close();
    }
public Cargo buscarPorCodigo(Integer codigo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Cargo resultado = (Cargo) sessao.get(Cargo.class, codigo);
        sessao.close();
        return resultado;
    }
public void excluir(Cargo cargo){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(cargo);
        transacao.commit();
        sessao.close();
    }
public void editar(Cargo cargo){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(cargo);
        transacao.commit();
        sessao.close();
    }

public List<Cargo> buscarTudoOrdenado(){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Cargo.class);
    
    criterio.addOrder(Order.asc("descricao"));
    
    List<Cargo> cargos = criterio.list();
    sessao.close();    
    return cargos;
    }
    
    public List<Cargo> buscarPorDescricao(String descricao){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Cargo.class);
    
    criterio.add(Restrictions.eq("descricao", descricao));
    
    criterio.addOrder(Order.asc("descricao"));
    
    List<Cargo> cargos = criterio.list();
    sessao.close();    
    return cargos; 
    }
    
    public List<Cargo> buscarPorDescricaoCod(String descricao, String codigo){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Cargo.class);
    
    criterio.add(Restrictions.eq("descricao", descricao));
    criterio.add(Restrictions.eq("codigo", codigo));
    
    criterio.addOrder(Order.asc("descricao"));
    
    List<Cargo> cargos = criterio.list();
    sessao.close();    
    return cargos; 
    }
}
