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
import javax.persistence.ManyToOne;

/**
 *
 * @author Alan
 */
@Entity
public class ItemVenda {
    @Id
    @GeneratedValue
    private Integer codigo;
    @Column
    private Integer quantidade;
    @Column
    private Float valorParcial;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Venda venda;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Produto produto;

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
     * @return the quantidade
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorParcial
     */
    public Float getValorParcial() {
        return valorParcial;
    }

    /**
     * @param valorParcial the valorParcial to set
     */
    public void setValorParcial(Float valorParcial) {
        this.valorParcial = valorParcial;
    }

    /**
     * @return the venda
     */
    public Venda getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
