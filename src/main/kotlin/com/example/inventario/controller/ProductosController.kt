package com.example.inventario.controller

import com.example.inventario.model.Productos
import com.example.inventario.service.ProductosService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/productos")   //endpoint
class ProductosController {
    @Autowired
    lateinit var productosService: ProductosService

    @GetMapping
    fun list ():List <Productos>{
        return productosService.list()
    }
    @PostMapping
    fun save (@RequestBody productos: Productos):ResponseEntity<Productos>{
        return ResponseEntity(productosService.save(productos), HttpStatus.OK)
    }
}

