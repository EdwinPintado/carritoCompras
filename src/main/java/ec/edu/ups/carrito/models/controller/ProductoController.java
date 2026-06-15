/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.carrito.models.controller;

import ec.edu.ups.carrito.models.Producto;
import ec.edu.ups.carrito.views.CrearProductoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LAB_04
 */
public class ProductoController {
    private Producto producto;
    private CrearProductoView crearProductoView;

    public ProductoController(CrearProductoView crearProductoView) {
        
        this.crearProductoView = crearProductoView;
        configurarProductoView();
    }
    
    public void crearProducto(){
        int codigo = Integer.parseInt(crearProductoView.getTxtCodigo().getText());
        String nombre = crearProductoView.getTxtNombre().getText();
        double precio = Double.parseDouble(crearProductoView.getTxtPrecio().getText());
        producto = new Producto(codigo,nombre,precio);
        System.out.println("se guardo");
    }
    
    public void configurarProductoView(){
        crearProductoView.getBtnAceptar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                crearProducto();
            }
        });
    }
}
