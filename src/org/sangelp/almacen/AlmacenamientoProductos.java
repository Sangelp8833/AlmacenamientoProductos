package org.sangelp.almacen;

import java.util.Scanner;

public class AlmacenamientoProductos {
    public static void main(String[] args) {

        Producto[] productos = new Producto[2];
        Scanner s = new Scanner(System.in);
        int a;
        int count = 1;

        for(int i = 0; i < productos.length; i++){
            System.out.println("SELECCIONE EL TIPO DE PRODUCTO QUE DESEA REGISTRAR" +
                    "\n" + "1- Limpieza" + "\n" + "2- Lacteo" + "\n" + "3- Fruta" + "\n"
                    + "4- NoPerecible");
            a = s.nextInt();
            s.nextLine();
            switch (a){
                case 1: {
                    System.out.println("Ingrese el Nombre: ");
                    String nombre = s.nextLine();
                    System.out.println("Ingrese el Precio: ");
                    double precio = s.nextDouble();
                    s.nextLine();
                    System.out.println("Ingrese los Componentes: ");
                    String componentes = s.nextLine();
                    System.out.println("Ingrese los Litros: ");
                    double litros = s.nextDouble();
                    s.nextLine();
                    productos[i] = new Limpieza(nombre,precio,componentes,litros);
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el Nombre: ");
                    String nombre = s.nextLine();
                    System.out.println("Ingrese el Precio: ");
                    double precio = s.nextDouble();
                    s.nextLine();
                    System.out.println("Ingrese la Cantidad: ");
                    int cantidad = s.nextInt();
                    s.nextLine();
                    System.out.println("Ingrese las Proteinas: ");
                    int proteinas = s.nextInt();
                    s.nextLine();
                    productos[i] = new Lacteo(nombre,precio,cantidad,proteinas);
                    break;
                }
                case 3:{
                    System.out.println("Ingrese el Nombre: ");
                    String nombre = s.nextLine();
                    System.out.println("Ingrese el Precio: ");
                    double precio = s.nextDouble();
                    s.nextLine();
                    System.out.println("Ingrese el Peso: ");
                    double peso = s.nextDouble();
                    s.nextLine();
                    System.out.println("Ingrese el Color: ");
                    String color = s.nextLine();
                    productos[i] = new Fruta(nombre,precio,peso,color);
                    break;
                }
                case 4:{
                    System.out.println("Ingrese el Nombre: ");
                    String nombre = s.nextLine();
                    System.out.println("Ingrese el Precio: ");
                    double precio = s.nextDouble();
                    s.nextLine();
                    System.out.println("Ingrese el Contenido: ");
                    int contenido = s.nextInt();
                    s.nextLine();
                    System.out.println("Ingrese las Calorías: ");
                    int calorias = s.nextInt();
                    s.nextLine();
                    productos[i] = new NoPerecible(nombre,precio,contenido,calorias);
                    break;
                }
            }

        }


        for(Producto p: productos){
            System.out.println("\n**** PRODUCTO " + count +" ****");
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Precio: "+p.getPrecio());
            if (p instanceof Limpieza){
                System.out.println("Compoenentes: " + ((Limpieza) p).getComponentes());
                System.out.println("Litros: " + ((Limpieza) p).getLitros());
            } else if (p instanceof Lacteo){
                System.out.println("Cantidad: " + ((Lacteo) p).getCantidad());
                System.out.println("Proteinas: " + ((Lacteo) p).getProteinas());
            } else if (p instanceof Fruta){
                System.out.println("Peso: " + ((Fruta) p).getPeso());
                System.out.println("Color: " + ((Fruta) p).getColor());
            } else if (p instanceof NoPerecible){
                System.out.println("Contenido: " + ((NoPerecible) p).getContenido());
                System.out.println("Calorias: " + ((NoPerecible) p).getCalorias());
            }
            count++;

        }

    }
}
