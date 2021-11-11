package com.profchoice.profchoicebackend.models;

public class Thread {

  private int id_thread;
  private String conteudo;
  private String authorThread;

  public Thread() {

  }

  public Thread(int id_thread, String conteudo, String authorThread) {

    this.id_thread = id_thread;
    this.conteudo = conteudo;
    this.authorThread = authorThread;

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

  public String getAuthorThread() {
    return authorThread;
  }

  public void setAuthorThread(String authorThread) {
    this.authorThread = authorThread;
  }

}
