/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author alexandre.9930
 */
public class ModVenda {
    private int id;
    private int id_clientes;
    private int id_produto;
    private double total;
    private String data_pedido;

    public ModVenda(int id, int id_clientes, int id_produto, double total, String data_pedido) {
        this.id = id;
        this.id_clientes = id_clientes;
        this.id_produto = id_produto;
        this.total = total;
        this.data_pedido = data_pedido;
    }

    public ModVenda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    @Override
    public String toString() {
        return "ModVenda{" + "id=" + id + ", id_clientes=" + id_clientes + ", id_produto=" + id_produto + ", total=" + total + ", data_pedido=" + data_pedido + '}';
    }

     
       
     }
