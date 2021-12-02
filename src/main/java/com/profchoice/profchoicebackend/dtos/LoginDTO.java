package com.profchoice.profchoicebackend.dtos;

public class LoginDTO {
    public String email;
    public String senha;

    public LoginDTO(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

}