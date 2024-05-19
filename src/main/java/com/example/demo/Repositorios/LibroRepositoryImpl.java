package com.example.demo.Repositorios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.Modelos.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepositorio {
    
    private List<Libro> libros = new ArrayList<>();


    public LibroRepositoryImpl(){

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
    public Libro nuevLibro(Libro libro){
        libros.add(libro);
        return libro;
      
    }
    


}
