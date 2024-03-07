package com.example.anonymousPost.post;

import java.util.Date;

public record PostResponseDTO(
        java.util.UUID id,
        String nomeDoUsuario,
        String texto,
        String urlImg,
        Date dataCriacao,
        Date dataAlteracao,
        boolean desativado,
        Date dataDesativacao) {

    public PostResponseDTO(Post post){
        this(
                post.getId(),
                post.getNomedousuario(),
                post.getTexto(),
                post.getUrlimg(),
                post.getDataCriacao(),
                post.getDataAlteracao(),
                post.isDesativado(),
                post.getDataDesativacao());
    }

}
