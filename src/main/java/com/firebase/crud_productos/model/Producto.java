package com.firebase.crud_productos.model;

import java.io.Serializable;

import com.mongodb.lang.NonNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
public class Producto implements Serializable{
  
  @Id
  private String id;
  @NonNull
  private String nombre;
  private float precio;
  private Categoria categoria;

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
  public float getPrecio() {
    return precio;
  }
  public void setPrecio(float precio) {
    this.precio = precio;
  }
  public Categoria getCategoria() {
    return categoria;
  }
  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

}
