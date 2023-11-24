/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import java.sql.ResultSet;

/**
 *
 * @author alexandre.9930
 */
public class daoProduto  extends BancoDeDadosMySql{
    private String sql;
    
    public Boolean inserir(int id, int idCategoria,  String nome, String descricao, Double preco){
        try{
            sql = "INSERT INTO PRODUTO (ID, ID_CATEGORIA,NOME, DESCRICAO, PRECO) VALUES (?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, idCategoria);
            getStatement().setString(3, nome);
            getStatement().setString(4, descricao);
            getStatement().setDouble(5, preco);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, int idCategoria,  String nome, String descricao, Double preco){
        try{
            sql = "UPDATE PRODUTO SET ID_CATEGORIA = ?, NOME = ?, DESCRICAO = ?, PRECO = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(6, id);
            getStatement().setInt(1, idCategoria);
            getStatement().setString(2, nome);
            getStatement().setString(3, descricao);
            getStatement().setDouble(4, preco);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM PRODUTO WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public ResultSet listarTodos(){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " ;
              
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorId(int id){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,        " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " ;
           
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorCategoria(String categoria){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " ;
              
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, categoria + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
   
    
    public ResultSet listarPorNome(String nome){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " WHERE P.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDescricao(String descricao){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " WHERE P.DESCRICAO LIKE ?          " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, descricao + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoMaiorQue(Double preco){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,        " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " WHERE P.PRECO > ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoMenorQue(Double preco){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,        " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " WHERE P.PRECO < ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoIgualA(Double preco){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,        " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " WHERE P.PRECO = ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = 0;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM PRODUTO";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next(); //Move para o primeiro registro.
            
            id = getResultado().getInt(1); //Pega o valor retornado na consulta
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;
    }
    
}
