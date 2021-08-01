package com.firebase.crud_productos.controller;

import java.util.List;

import com.firebase.crud_productos.model.Producto;
import com.firebase.crud_productos.services.contracts.IProductoContract;

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
@RequestMapping("/productos")
public class ProductoController {
  
  @Autowired
  private IProductoContract productoService;

  @GetMapping("/todos")
  public ResponseEntity<List<Producto>> listar(){
    List<Producto> listaProductos = productoService.listar();
    return new ResponseEntity<>(listaProductos, HttpStatus.OK);
  }

  @PostMapping("/guardar")
  public ResponseEntity<Producto> guardar(@RequestBody Producto producto){
    Producto productoNuevo = productoService.guardar(producto);
    return new ResponseEntity<>(productoNuevo,HttpStatus.OK);
  }

  @PutMapping("/actualizar")
  public ResponseEntity<Producto> actualizar(@RequestBody Producto producto){
    Producto productoActualizado = productoService.actualizar(producto);
    return new ResponseEntity<>(productoActualizado,HttpStatus.OK);
  }

  @DeleteMapping("/eliminar/{id}")
  public ResponseEntity<?> eliminar(@PathVariable("id") String id){
    productoService.eliminar(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
