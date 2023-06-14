package com.backend;

import javax.swing.JTextField;

public class CamposTexto {
    public void textoDefecto(JTextField textoUsuario){
        if (textoUsuario.getText().equals("INGRESE SU USUARIO")) {
            textoUsuario.setText("");
        }
    }
}
