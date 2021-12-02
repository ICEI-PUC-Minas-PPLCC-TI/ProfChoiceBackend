package com.profchoice.profchoicebackend.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "comentario")
public class Comentario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_comentario")
  private int id_comentario;
  @Column(name = "comentario")
  private String comentario;

  @ManyToOne()
  @JoinColumn(name = "email_autor", referencedColumnName = "email")
  private Cadastro autor;

  @ManyToOne()
  @JoinColumn(name = "id_thread", referencedColumnName = "id_thread")
  private Thread thread;

  public Comentario() {

  }

  public Comentario(int id_comentario, String comentario) {
    this.id_comentario = id_comentario;
    this.comentario = comentario;
    // this.autorComentario = autorComentario;
    // this.comentario = comentario;
  }

  public Comentario(String comentario, Cadastro autor, Thread thread2) {
    this.comentario = comentario;
    this.autor = autor;
    this.thread = thread2;
  }

  // public int getId_thread() {
  // return id_thread;
  // }

  // public void setId_thread(int id_thread) {
  // this.id_thread = id_thread;
  // }

  public int getId_comentario() {
    return id_comentario;
  }

  public void setId_comentario(int id_comentario) {
    this.id_comentario = id_comentario;
  }

  // public String getAutorComentario() {
  // return autorComentario;
  // }

  // public void setAutorComentario(String autorComentario) {
  // this.autorComentario = autorComentario;
  // }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

}
