
package com.mycompany.werner;


public class Auto {
  private String modelo;
 private String marca;
 private String color;
 private String precio;
 private String año;

    public Auto(String modelo, String marca, String color, String precio, String año) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    

    
  

    
 
}
