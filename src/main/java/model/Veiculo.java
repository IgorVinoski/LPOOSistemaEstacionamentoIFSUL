/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author igor
 */

@Entity
@Table(name = "tb_veiculo")
public class Veiculo {
    private String placa;
    private String cor;
    private int id;
    private List<EntradaSaida> entradaSaida;
    
    private Modelo modelo;
    
    private TipoVeiculo tipoVeiculo;
}
