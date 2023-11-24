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
public class daoEstoque   extends BancoDeDadosMySql{
    private String sql;
    
    public Boolean inserir(int id, int idProduto, int quantidade){
        try{
            sql = "INSERT INTO PEDIDO (ID, ID_PRODUTO, QUANTIDADE) VALUES (?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, idProduto);
            getStatement().setInt(3, quantidade);
            
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
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " ;
                
            
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
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " +
                " JOIN PRODUTO PRO ON                 " +
                "   PRO.ID = P.ID_PRODUTO             " +
                " WHERE                               " +
                "   P.ID = ?                          " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
   
    public ResultSet listarPorNomeProduto(String nomeProduto){
        try{
            sql = 
                " SELECT                              " +
                "   P.ID AS ID,                       " +
                "   PRO.NOME AS PRODUTO,              " +
                "   P.QUANTIDADE AS QUANTIDADE,       " +
                " FROM                                " +
                "   PEDIDO P                          " +
                " JOIN CLIENTE C ON                   " +
                "   C.ID = P.ID_CLIENTE               " +
                " JOIN PRODUTO PRO ON                 " +
                "   PRO.ID = P.ID_PRODUTO             " +
                " WHERE                               " +
                "   PRO.NOME LIKE ?                   " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nomeProduto + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
   
    public int buscarProximoId(){
        int id = 0;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM PEDIDO";
            
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
