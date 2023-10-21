package com.example.inventario.service

import com.example.inventario.controller.ProductosController
import com.example.inventario.model.Productos
import com.example.inventario.repository.ProductosRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class ProductosService {
    @Autowired
    lateinit var productosRepository: ProductosRepository

    fun list ():List<Productos>{
        return productosRepository.findAll()
    }
    fun save(productos: Productos): Productos{
        try{
            return productosRepository.save(productos)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}