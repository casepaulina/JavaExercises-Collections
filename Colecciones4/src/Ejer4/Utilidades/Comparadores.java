
package Ejer4.Utilidades;

import Ejer4.Pelicula;
import java.util.Comparator;



public class Comparadores {
    
 
    public static Comparator<Pelicula> ordenarDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
           return t1.getDuracion() .compareTo(t.getDuracion());
           
        }
  
    };
      
    public static Comparator<Pelicula> ordenarTituloAlfa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
           return t.getTitulo() .compareTo(t1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarDirectorAlfa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
           return t.getDirector() .compareTo(t1.getDirector());
        }
    };
    
    
       
}
