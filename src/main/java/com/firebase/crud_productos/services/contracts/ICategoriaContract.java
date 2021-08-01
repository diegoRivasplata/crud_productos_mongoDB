package com.firebase.crud_productos.services.contracts;

import java.util.List;

import com.firebase.crud_productos.model.Categoria;

public interface ICategoriaContract {
  public Categoria guardar(Categoria categoria);
  public List<Categoria> listar();
  public Categoria actualizar(Categoria categoria);
  public void eliminar(String id);
  public Categoria buscarUno(String id);
}
