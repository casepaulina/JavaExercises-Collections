package Ejer4.Servicio;

import Ejer4.Pelicula;



import java.util.Scanner;

public class PeliculaServicio {

    Scanner leer = new Scanner(System.in);



    //Metodo CrearPelicula
    public Pelicula CrearPelicula() {

        System.out.println("Ingrese el nombre de la pelicula");
        String titulo = leer.next();

        System.out.println("Ingrese el director de la pelicula");
        String director = leer.next();

        System.out.println("Ingrese la duracion de la pelicula");
        Integer duracion = leer.nextInt();

        //Crear objetos
        Pelicula p = new Pelicula(titulo, director, duracion);

        // el metodo me duevuelve el objeto con los datos
        return p;

    }
    
//Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    
   
   

    
    
    
    

}
