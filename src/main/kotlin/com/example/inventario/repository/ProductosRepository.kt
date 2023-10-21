package com.example.inventario.repository

import com.example.inventario.model.Productos
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductosRepository : JpaRepository<Productos, Long?> {
    fun findById (id: Long?): Productos?

}

