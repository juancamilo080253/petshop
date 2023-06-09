package com.desarrollo.petshop.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desarrollo.petshop.models.producto;
import com.desarrollo.petshop.repositories.productoRepository;
import com.desarrollo.petshop.services.productoService;


@Service
public class productoServiceImpl implements productoService {

    @Autowired
    productoRepository productoRepository;

    @Override
    public List<producto> listarProdutos() {
        return (List<producto>) productoRepository.findAll();
    }

    @Override
    @Transactional
    public void guardar(producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void eliminar(producto producto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }
    
    @Override
    public producto encontrarProducto(producto producto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encontrarProducto'");
    }
    
}
