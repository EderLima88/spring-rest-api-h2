package br.com.eder.springrestapih2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Carro {

    @Id
    private Long registro;
    private String nome;
    private String cor;
    private String potencia;
    private Instant dataAquisicao;


}
