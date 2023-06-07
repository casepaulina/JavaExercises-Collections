
package Ejer4;
public class Pelicula {
    
  
    //Atributos  titulo, director y duración de la película (en horas)
    
    private String titulo;
    private String director;
    private int duracion;

    //metodo vacio
    
    public Pelicula(){
    }
    
    //metodo con parametros
    
    public Pelicula(String titulo, String director, Integer duracion){
    
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
      
    }
    
    //get y set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    //to String

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
  
    }
    
    
    
   
