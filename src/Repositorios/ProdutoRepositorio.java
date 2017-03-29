/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;
import Entidades.Produto;
import Entidades.Produto;
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
public class ProdutoRepositorio {
    public void inserir(Produto produto){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(produto);
        transacao.commit();
        sessao.close();
    }
public Produto buscarPorCodigo(Integer codigo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Produto resultado = (Produto) sessao.get(Produto.class, codigo);
        sessao.close();
        return resultado;
    }
public void excluir(Produto produto){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(produto);
        transacao.commit();
        sessao.close();
    }
public void editar(Produto produto){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(produto);
        transacao.commit();
        sessao.close();
    }

public List<Produto> buscarTudoOrdenado(){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Produto.class);
    
    criterio.addOrder(Order.asc("descricao"));
    
    List<Produto> produtos = criterio.list();
    sessao.close();    
    return produtos;
    }
    
    public List<Produto> buscarPorQuantidade(String quantidade){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Produto.class);
    
    criterio.add(Restrictions.ge("quantidade", quantidade));
    
    criterio.addOrder(Order.asc("quantidade"));
    
    List<Produto> produtos = criterio.list();
    sessao.close();    
    return produtos; 
    }
    
    public List<Produto> buscarPorQtdPreco(String quantidade, String preco){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Produto.class);
    
    criterio.add(Restrictions.ge("quantidade", quantidade));
    criterio.add(Restrictions.ge("preco", preco));
    
    criterio.addOrder(Order.asc("quantidade"));
    
    List<Produto> produtos = criterio.list();
    sessao.close();    
    return produtos; 
    }
}
