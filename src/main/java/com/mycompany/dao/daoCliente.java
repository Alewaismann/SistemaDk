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
public class daoCliente extends BancoDeDadosMySql{
    String sql;
    
    public Boolean inserir(int id,  String nome, String sobrenome,  String telefone, String email, String cidade,  String usuario, String senha){
        try{
            sql = "INSERT INTO CLIENTES (ID, NOME, SOBRENOME, TELEFONE, EMAIL, CIDADE, USUARIO, SENHA) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setString(2, nome);
            getStatement().setString(3, sobrenome);
            getStatement().setString(4, telefone);
            getStatement().setString(5, email);
            getStatement().setString(6, cidade);
             getStatement().setString(7, usuario);
            getStatement().setString(8, senha);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, String nome, String sobrenome, String telefone, String email, String cidade){
        try{
            sql = "UPDATE CLIENTES SET CIDADE = ?, NOME = ?, SOBRENOME = ?, TELEFONE = ?, EMAIL = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(6, id);
            getStatement().setString(1, cidade);
            
            getStatement().setString(2, nome);
            getStatement().setString(3, sobrenome);
            
            getStatement().setString(4, telefone);
            getStatement().setString(5, email);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
   
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM CLIENTES WHERE ID = ?";
            
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
//                "   C.NOME AS CIDADE,               " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL                " +
                " FROM                              " +
                "   CLIENTES P                       " ;
//                " JOIN CIDADE C ON                  " +
//                "   C.ID = E.ID_CIDADE              " ;
              
            
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
                "   C.NOME AS CIDADE,               " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                " FROM                              " +
                "   CLIENTES P                        " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE P.ID = ?                    " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
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
                "   C.NOME AS CIDADE,               " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                " FROM                              " +
                "   CLIENTES P                        " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE P.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorSobrenome(String sobrenome){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   CLIENTES P                        " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE P.SOBRENOME LIKE ?          " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, sobrenome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
   
    
    public ResultSet listarPorTelefone(String telefone){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                " FROM                              " +
                "   CLIENTES P                        " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE P.TELEFONE LIKE ?           " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, telefone + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorEmail(String email){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                " FROM                              " +
                "   CLIENTES P                        " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE P.EMAIL LIKE ?              " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, email + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
   public ResultSet listarPorCidade(String cidade){
        try{
            sql = 
                " SELECT                    " +
                "   CID.ID AS ID,           " +
                "   CID.NOME AS CIDADE,     " +
                " FROM                      " +
                "   CIDADE CID              " +
                " WHERE                     " +
                "   CID.NOME LIKE ?         ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, cidade + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     public ResultSet recuperaSenha(String usuario){
        try{
            sql = 
                " SELECT                            " +
                "   ID,                             " +
                "   SENHA                           " +
                " FROM                              " +
                "   CLIENTES                         " +
                " WHERE USUARIO = ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, usuario);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
     }
      public ResultSet listarPorIdPessoa(int idPessoa){
        try{
            sql = 
                " SELECT                            " +
                "   ID AS ID                       " +
//                "   ID_PESSOA AS CIDADE             " +
                " FROM                              " +
                "   CLIENTES                         " +
                " WHERE ID = ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, idPessoa);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
      }
      
    public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM CLIENTES";
            
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
    

