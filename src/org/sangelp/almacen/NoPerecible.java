package org.sangelp.almacen;

public class NoPerecible extends Producto{

    private int contenido;
    private int calorias;

    public NoPerecible(String nombre, double precio, int calorias, int contenido){
        super(nombre,precio);
        this.calorias = calorias;
        this.contenido = contenido;
    }

    public int getContenido(){
        return contenido;
    }

    public int getCalorias(){
        return calorias;
    }



}
