package com.biblioteca.mantener;

public class Libro extends General{
    private int edicion;
    private int añoPublicacion;
    //Relacion de compocision
    private Autor autor;
    
    //--------------------------Constructor--------------------------
    public Libro(int edicion, int añoPublicacion, Autor autor){
        this.edicion = edicion;
        this.añoPublicacion = añoPublicacion;
        //relacion de composicion
        this.autor = autor;
    }

    public Libro(){
        
    }

    //--------------------------Setter y Getter--------------------------
    public void setEdicion(int edicion){
        this.edicion = edicion;
    }

    public void setAñoPublicacion(int añoPublicacion){
        this.añoPublicacion = añoPublicacion;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public int getEdicion(){
        return edicion;
    }

    public int getAñoPublicacion(){
        return añoPublicacion;
    }

    public Autor getAutor(){
        return autor;
    }

    public String toString(){
        //Usamos la super clase para llamar al metodo toString "super.toString"
        return "Libro ( " + super.toString() + " Edicion = " + edicion + " Año Publicacion = " + añoPublicacion + " Autor = " + autor  + " )";
    }

}
