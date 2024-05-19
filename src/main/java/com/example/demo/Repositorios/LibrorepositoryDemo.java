package com.example.demo.Repositorios;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Modelos.Libro;

public class LibrorepositoryDemo  implements LibroRepositorio{

    private List<Libro> libros = new ArrayList<>();


    public LibrorepositoryDemo(){

        libros.add(new Libro(1, "Cien años de soledad", "Gabriel García Márquez", " Editorial Sudamericana", "1967"));
        libros.add(new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes", "Francisco de Robles", "1615"));
        libros.add(new Libro(3, "Rayuela", "Julio Cortázar", " Editorial Sudamericana", "1963"));
        libros.add(new Libro(4, "Crimen y castigo", "Fiódor Dostoyevski", "  The Russian Messenger (Serializada)", "1866"));

        
    }

    public Libro getLibro(int id){
        System.out.println("Conectando a la Biblioteca");
        for(Libro libro: libros){
            if(id == libro.getId())

                return libro;


        }
        return null; 


    }

    public List <Libro> getLibros (){
        System.out.println("Conectando a la Biblioteca");
        return libros;


    }
    @Override
    public Libro nuevLibro (Libro libro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nuevLibro'");
    }



}
