package com.netflop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Objects;
import java.util.Set;

@Entity
public class Conteudo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titulo;

    @Column
    private String duracao;

    @Column
    private int episodio;

    @Column
    private String sinopse;

    @Column
    private String autor;

    @Column
    private double connotimdb;

    @ManyToMany
    private Set<Genero> generos;


    public Conteudo(Long id, String titulo, String duracao, int episodio, String sinopse, String autor, double connotimdb, Set<Genero> generos) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
        this.episodio = episodio;
        this.sinopse = sinopse;
        this.autor = autor;
        this.connotimdb = connotimdb;
        this.generos = generos;
    }

    public Conteudo() {
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

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getConnotimdb() {
        return connotimdb;
    }

    public void setConnotimdb(double connotimdb) {
        this.connotimdb = connotimdb;
    }

    public Set<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(Set<Genero> generos) {
        this.generos = generos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conteudo conteudo = (Conteudo) o;
        return episodio == conteudo.episodio && Double.compare(conteudo.connotimdb, connotimdb) == 0 && Objects.equals(id, conteudo.id) && Objects.equals(titulo, conteudo.titulo) && Objects.equals(duracao, conteudo.duracao) && Objects.equals(sinopse, conteudo.sinopse) && Objects.equals(autor, conteudo.autor) && Objects.equals(generos, conteudo.generos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, duracao, episodio, sinopse, autor, connotimdb, generos);
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", duracao='" + duracao + '\'' +
                ", episodio=" + episodio +
                ", sinopse='" + sinopse + '\'' +
                ", autor='" + autor + '\'' +
                ", connotimdb=" + connotimdb +
                ", generos=" + generos +
                '}';
    }
}
