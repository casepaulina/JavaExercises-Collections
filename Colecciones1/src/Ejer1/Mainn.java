/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.*/
package Ejer1;

import java.util.*;

public class Mainn {

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

        razas.forEach(r->{System.out.println(r);});

    }

}
