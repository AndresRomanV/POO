package Laboratorio1;

public abstract class Vehiculo {
    private String color;
    private String marca;
    private String modelo;
    private Radio radio;
   
    public Vehiculo(String color, String marca, String modelo, Radio radio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Vehiculo [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", radio=" + radio + "]";
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Radio getRadio() {
        return radio;
    }
    
    public void agregar_radio(String marca, double potencia){
        this.radio=new Radio(marca, potencia);
    }

}
