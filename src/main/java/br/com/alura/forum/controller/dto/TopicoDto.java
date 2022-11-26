package br.com.alura.forum.controller.dto;

import br.com.alura.forum.modelo.Topico;

import java.time.LocalDateTime;

public class TopicosDto {

    private Long id;
    private String titulo;
    private String mensagem;

    public TopicosDto(Topico topico){
        this.id = topico.getId();
        
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    private LocalDateTime dataCriacao;

}
