/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programa06cc1;

/**
 *
 * @author Elizabeth PG
 */
public class Programa06CC1 {

    public static void main(String[] args) {
DAOVenta dao =new DAOVenta();
        Venta venta = new Venta();
        
        DetalleVenta d1= new DetalleVenta();
    
        
        d1.setDescripcion("P1");
        d1.setCantidad(1.0);
        d1.setPrecio(20.0);
        d1.setSubtotal(40.0);
        d1.setVenta(venta);
        venta.getDetalle().add(d1);
        
       dao.update(venta, 3L);
        
        
        System.out.println("hola");
    }
}

