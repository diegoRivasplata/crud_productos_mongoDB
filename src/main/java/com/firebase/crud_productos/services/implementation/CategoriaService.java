package com.firebase.crud_productos.services.implementation;

import java.util.List;

import com.firebase.crud_productos.model.Categoria;
import com.firebase.crud_productos.repository.ICategoriaRepo;
import com.firebase.crud_productos.services.contracts.ICategoriaContract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService implements ICategoriaContract{

  @Autowired
  private ICategoriaRepo categoriaRepo;

  @Override
  public Categoria guardar(Categoria categoria) {
    return categoriaRepo.save(categoria);
  }

  @Override
  public List<Categoria> listar() {
    return categoriaRepo.findAll();
  }

  @Override
  public Categoria actualizar(Categoria categoria) {
    return categoriaRepo.save(categoria);
  }

  @Override
  public void eliminar(String id) {
    categoriaRepo.deleteById(id);
  }

  @Override
  public Categoria buscarUno(String id) {
    return categoriaRepo.findById(id).orElse(null);
  }
  
}
