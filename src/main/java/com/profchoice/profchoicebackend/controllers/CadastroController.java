package com.profchoice.profchoicebackend.controllers;

import java.util.Optional;

import com.profchoice.profchoicebackend.dtos.LoginDTO;
import com.profchoice.profchoicebackend.models.Cadastro;
import com.profchoice.profchoicebackend.repositories.CadastroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroController {
    @Autowired
    CadastroRepository cadastroRepository;

    @PostMapping("/cadastro")
    public Cadastro criarCadastro(@RequestBody Cadastro cadastro) {
        Cadastro novoCadastro = new Cadastro(cadastro.getEmail(), cadastro.getNome(), cadastro.getSenha());
        cadastroRepository.save(novoCadastro);
        return novoCadastro;
    }

    @GetMapping("/cadastro")
    public Iterable<Cadastro> listarUsuarios(Cadastro cadastro) {
        Iterable<Cadastro> cadastros = cadastroRepository.findAll();
        return cadastros;

    }

}
