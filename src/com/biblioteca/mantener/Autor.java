package com.biblioteca.mantener;

public class Autor extends General{
    private String observacion;
    private int librosPublicados;
    private Pais pais;

    //--------------------------Constructor--------------------------
    public Autor(String observacion, int librosPublicados, Pais pais){
        this.observacion = observacion;
        this.librosPublicados = librosPublicados;
        this.pais = pais;
    }

    public Autor(){
        
    }

    //--------------------------Setter y Getter--------------------------
    public void setObservacion(String observacion){
        this.observacion = observacion;
    }
    public void setLibrosPublicados(int librosPublicados){
        this.librosPublicados = librosPublicados;
    }
    public void setPais(Pais pais){
        this.pais = pais;
    }

    public String getObservacion(){
        return observacion;
    }

    public int getLibrosPublicados(){
        return librosPublicados;
    }

    public Pais getPais(){
        return pais;
    }

    public String toString(){
        //Usamos la super clase para llamar al metodo toString "super.toString"
        return "Prestatario ( " + super.toString() + " Observacion = " + observacion + " LibrosPublicados = " + librosPublicados + " Pais = " + pais  + " )";
    }
}
