/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.*/
package Ejer2;

import java.util.*;
import static java.util.Spliterators.iterator;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<String> razas = new ArrayList();

        String respuesta = null;

        do {
            System.out.println("Ingrese una raza de perro");
            String r = leer.nextLine();
            razas.add(r);

            System.out.println("¿Desea introducir otra raza? s/n");
            respuesta = leer.nextLine();

        } while (!respuesta.equals("n") && !respuesta.equals("N"));

        razas.forEach(r -> {
            System.out.println(r);
        });

        System.out.println("Ingrese la raza de perro que desea eliminar");
        String buscar = leer.nextLine();

        Iterator<String> r = razas.iterator();
        
        razas.remove(buscar);
        
         razas.forEach(a-> {
            System.out.println("Queda: "+a);
        });

       
        
        
        }
      
    }


