package com.firebase.crud_productos.repository;

import com.firebase.crud_productos.model.Categoria;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICategoriaRepo extends MongoRepository<Categoria, String>{
  
}
