/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Categoria;
import Entidades.Categoria;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

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

public List<Categoria> buscarTudoOrdenado(){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Categoria.class);
    
    criterio.addOrder(Order.asc("descricao"));
    
    List<Categoria> categorias = criterio.list();
    sessao.close();    
    return categorias;
    }
    
    public List<Categoria> buscarPorDescricao(String descricao){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Categoria.class);
    
    criterio.add(Restrictions.eq("descricao", descricao));
    
    criterio.addOrder(Order.asc("descricao"));
    
    List<Categoria> categorias = criterio.list();
    sessao.close();    
    return categorias; 
    }
    
    public List<Categoria> buscarPorDescricaoCod(String descricao, String codigo){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Categoria.class);
    
    criterio.add(Restrictions.eq("descricao", descricao));
    criterio.add(Restrictions.eq("codigo", codigo));
    
    criterio.addOrder(Order.asc("descricao"));
    
    List<Categoria> categorias = criterio.list();
    sessao.close();    
    return categorias; 
    }
}
