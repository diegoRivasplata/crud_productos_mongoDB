package com.firebase.crud_productos.repository;

import com.firebase.crud_productos.model.Producto;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductoRepo extends MongoRepository<Producto, String> {
  
}
