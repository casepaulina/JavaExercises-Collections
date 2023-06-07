/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.

Para esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). 

Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:

Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Ejer4;

import Ejer4.Servicio.PeliculaServicio;
import Ejer4.Utilidades.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        //Lista inicializada
        ArrayList<Pelicula> ListaPeliculas = new ArrayList();

        //Crear un nuevo Objeto
        PeliculaServicio ps = new PeliculaServicio();
        
        //Variable respuesta
        String respuesta;

        //Bucle para guardar el objeto en ArrayList 
        do {

            ListaPeliculas.add(ps.CrearPelicula());

            System.out.println("Desea agregar otra pelicula? s/n ");
            respuesta = leer.next();

        } while (!respuesta.equals("n") && !respuesta.equals("N"));
        

        //Mostrar en pantalla 
        
       for (Pelicula aux : ListaPeliculas) {
       System.out.println("Las peliculas son " +aux);
       }
       
       //Llamar metodo duracion mayor a 1
       
      // ps.DuracionMayora1(Integer.SIZE, respuesta);

        //   Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
        
          Collections.sort(ListaPeliculas, Comparadores.ordenarDuracionDesc);
          
          for (Pelicula a: ListaPeliculas) {
              System.out.println("Peliculas de acuerdo a su duracion, de mayor a menor: " +a);
        }
          
          
        //Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
        
         Collections.sort(ListaPeliculas, Comparadores.ordenarTituloAlfa);
          
          for (Pelicula b: ListaPeliculas) {
              System.out.println("Titulos Ordenados Alfabeticamente: " +b);
        }
          
        //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
        
        
        Collections.sort(ListaPeliculas, Comparadores.ordenarDirectorAlfa);
          
          for (Pelicula c: ListaPeliculas) {
              System.out.println("Directores Ordenados Alfabeticamente: " +c);
        }
       
  
    }
    
    public void DuracionMayora1(ArrayList<Pelicula> ListaPeliculas, Integer duracion, String titulo){
   
   if(duracion>1){
   
       System.out.println("Estas son las peliculas con duracion mayor a 1 hora: "+titulo);
   
   
   }
    }

}
