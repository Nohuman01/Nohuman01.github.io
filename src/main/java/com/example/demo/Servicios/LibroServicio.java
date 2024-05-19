package com.example.demo.Servicios;

import java.util.List;

import com.example.demo.Modelos.Libro;

public interface LibroServicio {

    Libro getLibro(int id);
    List <Libro> getLibros();
    Libro nuevLibro(Libro libro);
}
