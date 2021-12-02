package com.profchoice.profchoicebackend.dtos;

public class CriarThreadDTO {
    public String conteudo;
    public String email_autor;

    public CriarThreadDTO(String conteuro, String email_autor) {
        this.conteudo = conteuro;
        this.email_autor = email_autor;
    }
}
