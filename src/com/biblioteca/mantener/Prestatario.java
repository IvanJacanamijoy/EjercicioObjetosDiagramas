package com.biblioteca.mantener;


public class Prestatario extends General{
    private String direccion;
    private String telefono;
    private String ruc;
    private Ciudad ciudad;

    //--------------------------Constructor--------------------------

    public Prestatario(String direccion, String telefono, String ruc, Ciudad ciudad){
        this.telefono = telefono;
        this.telefono = direccion;
        this.telefono = ruc;
        this.ciudad = ciudad;
    }
    public Prestatario(){};

    //--------------------------Setter y Getter--------------------------

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public void setRuc(String ruc){
        this.ruc = ruc;
    }

    public void setCiudad(Ciudad ciudad){
        this.ciudad = ciudad;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getTelefono(){
        return telefono;
    }
    
    public String getRuc(){
        return ruc;
    }
    public Ciudad getCiudad(){
        return ciudad;
    }

    public String toString(){
        //Usamos la super clase para llamar al metodo toString "super.toString"
        return "Prestatario ( " + super.toString() + " Telefono = " + telefono + " Direccion = " + direccion + " Ruc = " + ruc  + " )";
    }
}
