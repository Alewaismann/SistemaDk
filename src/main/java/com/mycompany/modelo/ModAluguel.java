/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author alexandre.9930
 */
public class ModAluguel {
     private int id;
    private int id_clientes;
    private int id_produto;
    private String data_aluguel;
    private String data_devolucao;
    private double total;

    public ModAluguel() {
    }

     public ModAluguel(int id,int id_clientes , int id_produto, String data_aluguel, String data_devolucao, int total) {
        this.id = id;
        this.id_clientes = id_clientes;
        this.id_produto = id_produto;
        this.data_aluguel = data_aluguel;
        this.data_devolucao = data_devolucao;
        this.total = total;
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

    public String getData_aluguel() {
        return data_aluguel;
    }

    public void setData_aluguel(String data_aluguel) {
        this.data_aluguel = data_aluguel;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ModAluguel{" + "id=" + id + ", id_clientes=" + id_clientes + ", id_produto=" + id_produto + ", data_aluguel=" + data_aluguel + ", data_devolucao=" + data_devolucao + ", total=" + total + '}';
    }
}
