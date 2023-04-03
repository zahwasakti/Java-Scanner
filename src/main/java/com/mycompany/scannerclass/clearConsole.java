/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.scannerclass;

import java.io.IOException;

/**
 *
 * @author suvar
 */
public class clearConsole {
    public void clear(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E){
            System.out.println(E);
        }
    }

}
    
