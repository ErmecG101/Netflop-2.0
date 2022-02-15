package com.netflop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Objects;
import java.util.Set;

@Entity
public class Diretorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 512)
    private String diretorio;

    @Column
    private int ep;

    @Column(length = 32)
    private String temporada;

    @ManyToOne
    private Conteudo conteudo;

    public Diretorio(Long id, String diretorio, int ep, String temporada, Conteudo conteudo) {
        this.id = id;
        this.diretorio = diretorio;
        this.ep = ep;
        this.temporada = temporada;
        this.conteudo = conteudo;
    }

    public Diretorio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiretorio() {
        return diretorio;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public Conteudo getConteudo() {
        return conteudo;
    }

    public void setConteudo(Conteudo conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diretorio diretorio1 = (Diretorio) o;
        return ep == diretorio1.ep && Objects.equals(id, diretorio1.id) && Objects.equals(diretorio, diretorio1.diretorio) && Objects.equals(temporada, diretorio1.temporada) && Objects.equals(conteudo, diretorio1.conteudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, diretorio, ep, temporada, conteudo);
    }

    @Override
    public String toString() {
        return "Diretorio{" +
                "id=" + id +
                ", diretorio='" + diretorio + '\'' +
                ", ep=" + ep +
                ", temporada='" + temporada + '\'' +
                ", conteudo=" + conteudo +
                '}';
    }
}
