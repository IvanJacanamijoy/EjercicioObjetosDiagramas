import java.util.Scanner;

import com.biblioteca.mantener.*;

public class AppBiblioteca {
    private Libro libro;

    public static void main(String[] args) throws Exception {
        AppBiblioteca biblioteca = new AppBiblioteca();

        biblioteca.cargar();
        biblioteca.imprimir();
    }

    //--------------------------Metodo Cargar--------------------------

    public void cargar(){
        Scanner teclado = new Scanner(System.in);

        //--------------------------Instacia Libro--------------------------

        libro = new Libro();
        //-------------------Asignando atributos a Autor--------------------
        System.out.println("Digite el codigo del libro: ");
        libro.setCodigo(teclado.nextInt());

        teclado.nextLine();
        System.out.println("Digite el nombre del libro: ");
        libro.setNombre(teclado.nextLine());

        System.out.println("Digite la edicion del libro: ");
        libro.setEdicion(teclado.nextInt());

        System.out.println("Digite la año de publicacion del libro: ");
        libro.setAñoPublicacion(teclado.nextInt());


        //--------------------------Instacia Autor--------------------------

        Autor autor = new Autor();
        //-------------------Asignando atributos a Autor--------------------
        System.out.println("Digite el codigo del autor: ");
        autor.setCodigo(teclado.nextInt());

        System.out.println("Digite el nombre del autor: ");
        autor.setNombre(teclado.nextLine());

        
        //--------------------------Instacia Pais-------------------------

        Pais pais = new Pais();
        //------------------Asignando atributos a Autor-------------------
        System.out.println("Digite el codigo del Pais:");
        pais.setCodigo(teclado.nextInt());
        System.out.println("Digite el nombre del Pais:");
        pais.setNombre(teclado.nextLine());


    }

    public void imprimir(){
        System.out.println("Codigo del libro: " + libro.getCodigo() + "\nNombre del libro: " + libro.getNombre());
    }
}
