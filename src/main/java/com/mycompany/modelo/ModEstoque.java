/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author alexandre.9930
 */
public class ModEstoque {
    private int id;
    private int id_produto;
    private int quantidade;

     public ModEstoque(int id,int id_produto , int quantidade) {
        this.id = id;
        this.id_produto = id_produto;
        this.quantidade = quantidade;
    }

    public ModEstoque() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ModEstoque{" + "id=" + id + ", id_produto=" + id_produto + ", quantidade=" + quantidade + '}';
    }
}
