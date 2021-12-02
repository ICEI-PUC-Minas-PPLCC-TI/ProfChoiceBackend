package com.profchoice.profchoicebackend.dtos;

public class CriarComentarioDTO {
  public String comentario;
  public String email_autor;
  public Integer id_thread;

  public CriarComentarioDTO(String comentario, String email_autor, Integer id_thread) {
    this.comentario = comentario;
    this.email_autor = email_autor;
    this.id_thread = id_thread;
  }
}
