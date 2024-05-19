package com.example.demo.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modelos.Libro;
import com.example.demo.Repositorios.LibroRepositorio;

@Service

public class LibroServicioImpl  implements LibroServicio{

    @Autowired
    private LibroRepositorio libroRepositorio;

    @Override
    public Libro getLibro (int id ){

        return libroRepositorio.getLibro(id);
    }    

    @Override
    public List<Libro> getLibros(){

        return libroRepositorio.getLibros();
    }    
    @Override
    public Libro nuevLibro( Libro libro){

        return libroRepositorio.nuevLibro(libro);
    }    



}
