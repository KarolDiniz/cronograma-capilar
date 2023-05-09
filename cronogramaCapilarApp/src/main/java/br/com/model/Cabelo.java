package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.enums.*;

@Document(collection = "cabelo")
public class Cabelo {
	
	@Id
	private String id;
	private Comprimento comprimento;
	private Curvatura curvatura;
    private Oleosidade oleosidade;
    private Estado estado;
    private Boolean isElastico;
    private Boolean isForte;
    private Boolean danosTermicos;
    private Porosidade porosidade;

    public Cabelo(Comprimento comprimento, Curvatura curvatura, Oleosidade oleosidade, Estado estado, Boolean isElastico, Boolean isForte, Boolean danosTermicos, Porosidade porosidade) {
        this.comprimento = comprimento;
        this.curvatura = curvatura;
        this.oleosidade = oleosidade;
        this.estado = estado;
        this.isElastico = isElastico;
        this.isForte = isForte;
        this.danosTermicos = danosTermicos;
        this.porosidade = porosidade;
    }

    public Comprimento getComprimento() {
        return comprimento;
    }

    public Curvatura getCurvatura() {
        return curvatura;
    }

    public Oleosidade getOleosidade() {
        return oleosidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public Boolean getElastico() {
        return isElastico;
    }

    public Boolean getForte() {
        return isForte;
    }

    public Boolean getDanosTermicos() {
        return danosTermicos;
    }

    public Porosidade getPorosidade() {
        return porosidade;
    }
}
