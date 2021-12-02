package com.profchoice.profchoicebackend.controllers;

import java.util.Optional;

import com.profchoice.profchoicebackend.dtos.CriarComentarioDTO;
import com.profchoice.profchoicebackend.models.Cadastro;
import com.profchoice.profchoicebackend.models.Thread;
import com.profchoice.profchoicebackend.models.Comentario;
import com.profchoice.profchoicebackend.repositories.CadastroRepository;
import com.profchoice.profchoicebackend.repositories.ComentarioRepository;
import com.profchoice.profchoicebackend.repositories.ThreadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComentarioController {
    @Autowired
    ComentarioRepository comentarioRepository;

    @Autowired
    CadastroRepository cadastroRepository;

    @Autowired
    ThreadRepository threadRepository;

    @PostMapping("/comentario")
    // Data Transfer Object
    public void postarComentario(@RequestBody CriarComentarioDTO dto) {
        Optional<Cadastro> cadastro = cadastroRepository.findById(dto.email_autor);
        Optional<Thread> thread = threadRepository.findById(dto.id_thread);
        if (cadastro.get() != null && thread.get() != null) {
            Comentario comentario = new Comentario(dto.comentario, cadastro.get(), thread.get());
            comentarioRepository.save(comentario);
        }
    }
}
