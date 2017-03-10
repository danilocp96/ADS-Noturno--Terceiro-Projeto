/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Alan
 */
@Entity
public class Funcionario {
   @Id
   @GeneratedValue
   private Integer codigo;
   @Column(length = 15, nullable = false, unique = true)
   private String pis;
   @Column(length = 15, nullable = false, unique = true)
   private String carteiraDeTrabalho;
   @OneToOne
   @JoinColumn(nullable = false)
   private Pessoa pessoa;

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the pis
     */
    public String getPis() {
        return pis;
    }

    /**
     * @param pis the pis to set
     */
    public void setPis(String pis) {
        this.pis = pis;
    }

    /**
     * @return the carteiraDeTrabalho
     */
    public String getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    /**
     * @param carteiraDeTrabalho the carteiraDeTrabalho to set
     */
    public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    /**
     * @return the pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
   
}
