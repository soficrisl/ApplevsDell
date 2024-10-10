/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filereading;

/**
 *
 * @author Sofia
 */
public class functions {
    
    public static boolean positivenumber(String texto) {
        if (texto == null || texto.isEmpty()) {
            return false;
        }
        // Verificar si el texto contiene solo números
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (!Character.isDigit(caracter)) {
                return false;
            }
        }
        // Convertir el texto a un número entero
        int numero = Integer.parseInt(texto);
        // Verificar si el número es positivo
        return numero > 0;
    }
    
}
