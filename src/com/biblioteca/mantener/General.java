package com.biblioteca.mantener;

public class General{
    private int codigo;
    private String nombre;

    //--------------------------Constructor--------------------------
    public General(int codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public General(){

    }

    //--------------------------Metodos--------------------------
    public boolean validarDatos(){
        return true;
    }

    public String toString(){
        return "General ( codigo = " + codigo + " Nombre = " + nombre + ")";
    }

    //--------------------------Setter y Getter--------------------------
    public void setCodigo(int codigo){
        this.codigo = codigo;
    } 
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    } 

    public int getCodigo(){
        return codigo;
    } 

    public String getNombre(){
        return nombre;
    } 
}
