package com.profchoice.profchoicebackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "thread")
public class Thread {
  @Id
  @Column(name = "id_thread")
  private int id_thread;

  @Column(name = "conteudo")
  private String conteudo;

  @ManyToOne()
  @JoinColumn(name = "email_autor", referencedColumnName = "email")
  private Cadastro author;
  // private String authorThread;

  public Thread() {

  }

  public Thread(String conteudo, Cadastro autor) {
    this.conteudo = conteudo;
    this.author = autor;
  }

  public int getId_thread() {
    return id_thread;
  }

  public void setId_thread(int id_thread) {
    this.id_thread = id_thread;
  }

  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  public Cadastro getAuthor() {
    return author;
  }

  // public String getAuthorThread() {
  // return authorThread;
  // }

  // public void setAuthorThread(String authorThread) {
  // this.authorThread = authorThread;
  // }

}
