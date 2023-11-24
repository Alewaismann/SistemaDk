/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visaoOutros;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author alexandre.9930
 */
public class Utilitarios extends JFrame {
    
    public void InserirIcone (JFrame frm){
        try{
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("Icon//DKImage.png"));
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
}
