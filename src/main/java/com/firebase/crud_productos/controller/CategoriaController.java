package com.firebase.crud_productos.controller;

import java.util.List;

import com.firebase.crud_productos.model.Categoria;
import com.firebase.crud_productos.services.contracts.ICategoriaContract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
  
  @Autowired
  private ICategoriaContract categoriaService;

  @GetMapping("/todos")
  public ResponseEntity<List<Categoria>> listar(){
    List<Categoria> listaCategorias = categoriaService.listar();
    return new ResponseEntity<>(listaCategorias, HttpStatus.OK);
  }

  @PostMapping("/guardar")
  public ResponseEntity<Categoria> guardar(@RequestBody Categoria categoria){
    Categoria categoriaNueva = categoriaService.guardar(categoria);
    return new ResponseEntity<>(categoriaNueva,HttpStatus.OK);
  }

  @PutMapping("/actualizar")
  public ResponseEntity<Categoria> actualizar(@RequestBody Categoria categoria){
    Categoria categoriaActualizada = categoriaService.actualizar(categoria);
    return new ResponseEntity<>(categoriaActualizada,HttpStatus.OK);
  }

  @DeleteMapping("/eliminar/{id}")
  public ResponseEntity<?> eliminar(@PathVariable("id") String id){
    categoriaService.eliminar(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
