package com.firebase.crud_productos.model;

import java.io.Serializable;

import com.mongodb.lang.NonNull;
import com.mongodb.lang.Nullable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categorias")
public class Categoria implements Serializable{
  
  @Id
  @NonNull
  private String id;
  private String nombre;
  @Nullable
  private String descripcion;
  
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  
}
