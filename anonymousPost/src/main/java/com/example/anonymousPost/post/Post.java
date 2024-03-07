package com.example.anonymousPost.post;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Table(name= "posts")
@Entity(name = "post")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nomedousuario;
    private String texto;
    private String urlimg;
    @Column(name = "datacriacao")
    private Date dataCriacao;
    @Column(name = "dataalteracao")
    private Date dataAlteracao;
    private boolean desativado;
    @Column(name = "datadesativacao")
    private Date dataDesativacao;

    public Post(PostRequestDTO data){
        this.nomedousuario = "Anônimo";
        this.texto = data.texto();
        this.urlimg = data.urlImg();
        this.dataCriacao = new Date();
    }

    public void updatePost(PostUpdateRequestDTO data) {
        if (data.texto() != null){
            this.texto = data.texto();
        }

        this.dataAlteracao = new Date();
    }

    public void desativaPost() {
        this.desativado = true;
        this.dataDesativacao = new Date();
    }



}
