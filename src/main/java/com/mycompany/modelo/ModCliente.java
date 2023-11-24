/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author alexandre.9930
 */
public class ModCliente {
    
     private int id;
    private int idClientes;

    public ModCliente(int id, int idClientes) {
        this.id = id;
        this.idClientes = idClientes;
        
}

    public ModCliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    @Override
    public String toString() {
        return "ModCliente{" + "id=" + id + ", idClientes=" + idClientes + '}';
    }
    
}