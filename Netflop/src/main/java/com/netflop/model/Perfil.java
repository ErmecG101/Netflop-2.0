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
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 128)
    private String nome;

    @Column
    private boolean infantil;

    @ManyToOne
    private Usuario usuario;

    @ManyToMany
    private Set<Genero> gostos;

    public Perfil(Long id, String nome, boolean infantil, Usuario usuario, Set<Genero> gostos) {
        this.id = id;
        this.nome = nome;
        this.infantil = infantil;
        this.usuario = usuario;
        this.gostos = gostos;
    }

    public Perfil() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isInfantil() {
        return infantil;
    }

    public void setInfantil(boolean infantil) {
        this.infantil = infantil;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<Genero> getGostos() {
        return gostos;
    }

    public void setGostos(Set<Genero> gostos) {
        this.gostos = gostos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perfil perfil = (Perfil) o;
        return infantil == perfil.infantil && Objects.equals(id, perfil.id) && Objects.equals(nome, perfil.nome) && Objects.equals(usuario, perfil.usuario) && Objects.equals(gostos, perfil.gostos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, infantil, usuario, gostos);
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", infantil=" + infantil +
                ", usuario=" + usuario +
                ", gostos=" + gostos +
                '}';
    }
}
