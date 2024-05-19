package com.example.demo.Repositorios;

import java.util.List;

import com.example.demo.Modelos.Libro;

public interface LibroRepositorio {
    Libro getLibro(int id);
    List<Libro> getLibros();
    Libro nuevLibro (Libro libro);






}

