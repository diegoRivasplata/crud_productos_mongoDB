package com.firebase.crud_productos.services.contracts;

import java.util.List;

import com.firebase.crud_productos.model.Producto;

public interface IProductoContract {
  public Producto guardar(Producto producto);
  public List<Producto> listar();
  public Producto actualizar(Producto producto);
  public void eliminar(String id);
  public Producto buscarUno(String id);
}
