package com.netflop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 128)
    private String nome;

    @Column(length = 128)
    private String senha;

    @Column(length = 256)
    private String email;

    @Column(length = 64)
    private String celular;

    @Column
    private boolean adm;

    public Usuario(Long id, String nome, String senha, String email, String celular, boolean adm) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.celular = celular;
        this.adm = adm;
    }

    public Usuario() {
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return adm == usuario.adm && Objects.equals(id, usuario.id) && Objects.equals(nome, usuario.nome) && Objects.equals(senha, usuario.senha) && Objects.equals(email, usuario.email) && Objects.equals(celular, usuario.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, senha, email, celular, adm);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", adm=" + adm +
                '}';
    }
}


