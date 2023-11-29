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
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private String cidade;
    
    
    
//    private int id;
//    private int idClientes;
//
//    public ModCliente(int id, int idClientes) {
//        this.id = id;
//        this.idClientes = idClientes;   
//    }
//
//    public ModCliente() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getIdClientes() {
//        return idClientes;
//    }
//
//    public void setIdClientes(int idClientes) {
//        this.idClientes = idClientes;
//    }
//
//    @Override
//    public String toString() {
//        return "ModCliente{" + "id=" + id + ", idClientes=" + idClientes + '}';
//    }

    public ModCliente() {
    }

    public ModCliente(int id, String nome, String sobrenome, String email, String telefone, String cidade) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "ModCliente{" + "id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", telefone=" + telefone + ", cidade=" + cidade + '}';
    }
}