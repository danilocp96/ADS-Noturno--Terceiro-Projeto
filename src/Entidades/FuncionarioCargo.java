/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Alan
 */
@Entity
public class FuncionarioCargo {
    @Id
    @GeneratedValue
    private Integer codigo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date admissao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date demissao;
    @Column(nullable = false)
    private Float salario;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Funcionario funcionario;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Cargo cargo;

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
     * @return the admissao
     */
    public Date getAdmissao() {
        return admissao;
    }

    /**
     * @param admissao the admissao to set
     */
    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    /**
     * @return the demissao
     */
    public Date getDemissao() {
        return demissao;
    }

    /**
     * @param demissao the demissao to set
     */
    public void setDemissao(Date demissao) {
        this.demissao = demissao;
    }

    /**
     * @return the salario
     */
    public Float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Float salario) {
        this.salario = salario;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
