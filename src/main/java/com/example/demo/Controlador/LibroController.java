package com.example.demo.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Servicios.LibroServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.Modelos.Libro;





@RestController

public class LibroController {

    @Autowired
    private LibroServicio libroServicio;

    @GetMapping("/Libro")
    public String Libro() {
        return"Libros";
    }
    
    @PostMapping("/libros")
    public Libro nuevaLibro(@RequestBody Libro libros) {
        libroServicio.nuevLibro(libros);
        return libros ;
    }

    @GetMapping("/libros/{id}")
    public Libro getLibro(@PathVariable int id) {
        Libro libros = libroServicio.getLibro(id);
        return libros;
    }
    
    @GetMapping("/libros")
    public List<Libro> getLibro () {
        return libroServicio.getLibros();
    }
    

}
