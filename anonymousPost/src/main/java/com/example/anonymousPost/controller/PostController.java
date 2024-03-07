package com.example.anonymousPost.controller;

import com.example.anonymousPost.post.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<PostResponseDTO> getAll(){
        return repository.findAll().stream().map(PostResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void savePost(@RequestBody @Valid PostRequestDTO data){
        repository.save(new Post(data));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/update")
    @Transactional
    public void updatePost(@RequestBody @Valid PostUpdateRequestDTO data){
         var post = repository.getReferenceById(data.id());
         post.updatePost(data);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/desativa/{id}")
    @Transactional
    public void desativaPost(@PathVariable UUID id){
        var post = repository.getReferenceById(id);
        post.desativaPost();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/delete/{id}")
    @Transactional
    public void deletePost(@PathVariable UUID id){
        repository.deleteById(id);
    }

}
