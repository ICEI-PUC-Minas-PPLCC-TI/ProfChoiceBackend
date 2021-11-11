package com.profchoice.profchoicebackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity(name = "cadastro")
public class Cadastro {
  @Id
  @Column(name = "Email")
  private String email;

  @Column(name = "Nome", nullable = false)
  private String nome;

  @Column(name = "Senha", nullable = false)
  private String senha;

  @ManyToMany(mappedBy = "avaliadores")
  private List<Cursos> cursos;

  public Cadastro(String email, String nome, String senha) {
    this.email = email;
    this.nome = nome;
    this.senha = senha;
  }

  public Cadastro() {

  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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
}