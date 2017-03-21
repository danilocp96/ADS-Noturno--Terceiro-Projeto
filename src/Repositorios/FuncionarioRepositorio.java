/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Funcionario;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
}
