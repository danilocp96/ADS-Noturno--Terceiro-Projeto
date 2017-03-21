/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.FuncionarioCargo;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Danilo Cardoso
 */
public class FuncionarioCargoRepositorio {
    public void inserir(FuncionarioCargo funcionarioFuncionarioCargo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(funcionarioFuncionarioCargo);
        transacao.commit();
        sessao.close();
    }
public FuncionarioCargo buscarPorCodigo(Integer codigo){
        Session sessao =  Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        FuncionarioCargo resultado = (FuncionarioCargo) sessao.get(FuncionarioCargo.class, codigo);
        sessao.close();
        return resultado;
    }
public void excluir(FuncionarioCargo funcionarioFuncionarioCargo){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.delete(funcionarioFuncionarioCargo);
        transacao.commit();
        sessao.close();
    }
public void editar(FuncionarioCargo funcionarioFuncionarioCargo){
        Session sessao = Hibernate.NewHibernateUtil.getSessionFactory().openSession();        
        Transaction transacao = sessao.beginTransaction();
        sessao.update(funcionarioFuncionarioCargo);
        transacao.commit();
        sessao.close();
    }
}
