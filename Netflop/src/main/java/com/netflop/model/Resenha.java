package com.netflop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Resenha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 64)
    private String titulo;

    @Column(length = 512)
    private String texto;

    @Column
    private double nota;

    @ManyToOne
    private Perfil perfil;

    @ManyToOne
    private Conteudo conteudo;

    public Resenha(Long id, String titulo, String texto, double nota, Perfil perfil, Conteudo conteudo) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.nota = nota;
        this.perfil = perfil;
        this.conteudo = conteudo;
    }

    public Resenha() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
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
        Resenha resenha = (Resenha) o;
        return Double.compare(resenha.nota, nota) == 0 && Objects.equals(id, resenha.id) && Objects.equals(titulo, resenha.titulo) && Objects.equals(texto, resenha.texto) && Objects.equals(perfil, resenha.perfil) && Objects.equals(conteudo, resenha.conteudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, texto, nota, perfil, conteudo);
    }

    @Override
    public String toString() {
        return "Resenha{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", texto='" + texto + '\'' +
                ", nota=" + nota +
                ", perfil=" + perfil +
                ", conteudo=" + conteudo +
                '}';
    }
}
