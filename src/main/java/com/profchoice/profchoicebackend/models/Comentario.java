package com.profchoice.profchoicebackend.models;

public class Comentario {

  private int id_thread;
  private int id_comentario;
  private String autorComentario;
  private String comentario;

  public Comentario() {

  }

  public Comentario(int id_thread, int id_comentario, String autorComentario, String comentario) {
    this.id_comentario = id_comentario;
    this.id_comentario = id_comentario;
    this.autorComentario = autorComentario;
    this.comentario = comentario;

  }

  public int getId_thread() {
    return id_thread;
  }

  public void setId_thread(int id_thread) {
    this.id_thread = id_thread;
  }

  public int getId_comentario() {
    return id_comentario;
  }

  public void setId_comentario(int id_comentario) {
    this.id_comentario = id_comentario;
  }

  public String getAutorComentario() {
    return autorComentario;
  }

  public void setAutorComentario(String autorComentario) {
    this.autorComentario = autorComentario;
  }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

}
