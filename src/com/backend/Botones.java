/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author marlo
 */
public class Botones {
    //[72,127,120]
    
    public void cambiarColorBotonLogin(JPanel boton, int caso){
        if (caso == 0) {
            boton.setBackground(new Color(72,140,120));
        }else{
            boton.setBackground(new Color(72,127,120));
        }
        
    };
    
}
