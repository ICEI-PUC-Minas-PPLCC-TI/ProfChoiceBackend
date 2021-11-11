package com.profchoice.profchoicebackend.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;

@Entity(name = "cursos")
public class Cursos {
    @Id
    @Column(name = "Nome")
    private String nome;

    @Column(name = "Posição")
    private Integer posicao;

    @Column(name = "Avaliação")
    private Float avaliacao;

    @Column(name = "Descrição")
    private String descricao;

    @Column(name = "Remuneração")
    private Float remuneracao;

    @Column(name = "imagem")
    private String imagem;

    @ManyToMany
    @JoinTable(name = "cursos_avaliacao", joinColumns = @JoinColumn(name = "Nome"), inverseJoinColumns = @JoinColumn(name = "Email"))
    private List<Cadastro> avaliadores;

    public Cursos(String nome, Integer posicao, Float avaliacao, String descricao, Float remuneracao,
            List<Cadastro> avaliadores, String imagem) {
        this.nome = nome;
        this.posicao = posicao;
        this.avaliacao = avaliacao;
        this.descricao = descricao;
        this.remuneracao = remuneracao;
        this.avaliadores = avaliadores;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public Float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(Float remuneracao) {
        this.remuneracao = remuneracao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public List<Cadastro> getAvaliadores() {
        return avaliadores;
    }

    public void setAvaliadores(List<Cadastro> avaliadores) {
        this.avaliadores = avaliadores;
    }
}
