package com.firebase.crud_productos.services.implementation;

import java.util.List;

import com.firebase.crud_productos.model.Producto;
import com.firebase.crud_productos.repository.IProductoRepo;
import com.firebase.crud_productos.services.contracts.IProductoContract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoContract{

  @Autowired
  private IProductoRepo productoRepo;

  @Override
  public Producto guardar(Producto producto) {
    return productoRepo.save(producto);
  }

  @Override
  public List<Producto> listar() {
    return productoRepo.findAll();
  }

  @Override
  public Producto actualizar(Producto producto) {
    return productoRepo.save(producto);
  }

  @Override
  public void eliminar(String id) {
    productoRepo.deleteById(id);
  }

  @Override
  public Producto buscarUno(String id) {
    return productoRepo.findById(id).orElse(null);
  }
  
}
