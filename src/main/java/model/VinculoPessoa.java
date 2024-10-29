/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author igor
 */

@Entity
@Table(name = "tb_vinculopessoa")
public enum VinculoPessoa {
    Servidor, Aluno, Tercerizado, Visitante
}
