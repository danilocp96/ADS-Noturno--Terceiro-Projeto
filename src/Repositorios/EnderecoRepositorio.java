/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;
import Entidades.Endereco;
import Entidades.Endereco;
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
public class EnderecoRepositorio {
    public void inserir(Endereco endereco){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(endereco);
        transacao.commit();
        sessao.close();
    }
public Endereco buscarPorCodigo(Integer codigo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Endereco resultado = (Endereco) sessao.get(Endereco.class, codigo);
        sessao.close();
        return resultado;
    }
public void excluir(Endereco endereco){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(endereco);
        transacao.commit();
        sessao.close();
    }
public void editar(Endereco endereco){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(endereco);
        transacao.commit();
        sessao.close();
    }

public List<Endereco> buscarTudoOrdenado(){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Endereco.class);
    
    criterio.addOrder(Order.asc("estado"));
    
    List<Endereco> enderecos = criterio.list();
    sessao.close();    
    return enderecos;
    }
    
    public List<Endereco> buscarPorPessoaCod(String pessoaCod){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Endereco.class);
    
    criterio.add(Restrictions.eq("pessoa_codigo", pessoaCod));
    
    criterio.addOrder(Order.asc("estado"));
    
    List<Endereco> enderecos = criterio.list();
    sessao.close();    
    return enderecos; 
    }
    
    public List<Endereco> buscarPorEstadoCidade(String estado, String cidade){
    Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
    
    Criteria criterio = sessao.createCriteria(Endereco.class);
    
    criterio.add(Restrictions.eq("estado", estado));
    criterio.add(Restrictions.eq("cidade", cidade));
    
    criterio.addOrder(Order.asc("bairro"));
    
    List<Endereco> enderecos = criterio.list();
    sessao.close();    
    return enderecos; 
    }
}
