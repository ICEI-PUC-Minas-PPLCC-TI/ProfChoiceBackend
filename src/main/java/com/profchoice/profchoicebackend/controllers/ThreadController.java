package com.profchoice.profchoicebackend.controllers;

import com.profchoice.profchoicebackend.repositories.CadastroRepository;
import com.profchoice.profchoicebackend.repositories.ThreadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

import com.profchoice.profchoicebackend.dtos.CriarThreadDTO;
import com.profchoice.profchoicebackend.models.Cadastro;
import com.profchoice.profchoicebackend.models.Thread;

@RestController
public class ThreadController {
    @Autowired
    ThreadRepository threadRepository;

    @Autowired
    CadastroRepository cadastroRepository;

    @PostMapping("/threads")
    public void criarThread(@RequestBody CriarThreadDTO dto) {
        Optional<Cadastro> cadastro = cadastroRepository.findById(dto.email_autor);
        if (cadastro.get() != null) {
            Thread thread = new Thread(dto.conteudo, cadastro.get());
            threadRepository.save(thread);
        }
    }

    @GetMapping("/threads")
    public Iterable<Thread> listarThreads() {
        Iterable<Thread> threads = threadRepository.findAll();
        return threads;
    }
}
