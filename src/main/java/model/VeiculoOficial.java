/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author igor
 */


@Entity
@Table(name = "tb_veiculooficial")
public class VeiculoOficial extends Veiculo implements Serializable {
    private String renavam;
    private String chassi;
    
}
