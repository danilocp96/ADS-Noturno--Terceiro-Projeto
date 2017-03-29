/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Funcionario;
import Entidades.Funcionario;
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
public class FuncionarioRepositorio {
    public void inserir(Funcionario funcionario){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(funcionario);
        transacao.commit();
        sessao.close();
    }
public Funcionario buscarPorCodigo(Integer codigo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Funcionario resultado = (Funcionario) sessao.get(Funcionario.class, codigo);
        sessao.close();
        return resultado;
    }
public void excluir(Funcionario funcionario){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(funcionario);
        transacao.commit();
        sessao.close();
    }
public void editar(Funcionario funcionario){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(funcionario);
        transacao.commit();
        sessao.close();
    }

public List<Funcionario> buscarTudoOrdenado(){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Funcionario.class);
    
    criterio.addOrder(Order.asc("pis"));
    
    List<Funcionario> funcionarios = criterio.list();
    sessao.close();    
    return funcionarios;
    }
    
    public List<Funcionario> buscarPorPis(String pis){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Funcionario.class);
    
    criterio.add(Restrictions.eq("pis", pis));
    
    criterio.addOrder(Order.asc("pis"));
    
    List<Funcionario> funcionarios = criterio.list();
    sessao.close();    
    return funcionarios; 
    }
    
    public List<Funcionario> buscarPorPisCt(String pis, String ct){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Funcionario.class);
    
    criterio.add(Restrictions.eq("pis", pis));
    criterio.add(Restrictions.eq("carteiraDeTrabalho", ct));
    
    criterio.addOrder(Order.asc("descricao"));
    
    List<Funcionario> funcionarios = criterio.list();
    sessao.close();    
    return funcionarios; 
    }
}
