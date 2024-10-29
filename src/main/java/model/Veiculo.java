/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 *
 * @author igor
 */
@Entity
@Table(name = "tb_veiculo")
public class Veiculo implements Serializable {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    
    @Column(nullable = false, length = 7)
    private String placa;
    
    @Column(length = 20)
    private String cor;
    
    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;
    
    
    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;
//    private List<EntradaSaida> listaMovimentacoes;
//    private Pessoa proprietario;
    
    

    public Veiculo() {
//        listaMovimentacoes = new ArrayList<>();
    }

    public Veiculo(String placa, TipoVeiculo tipoVeiculo) {
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
//        listaMovimentacoes = new ArrayList<>();
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    
//    public void addMovimentacao(EntradaSaida movimentacao){
//        listaMovimentacoes.add(movimentacao);
//    }
//
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

//    public Pessoa getProprietario() {
//        return proprietario;
//    }
//
//    public void setProprietario(Pessoa proprietario) {
//        this.proprietario = proprietario;
//    }
//
//    public List<EntradaSaida> getListaMovimentacoes() {
//        return listaMovimentacoes;
//    }
//    
    
    
}