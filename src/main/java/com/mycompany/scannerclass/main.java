package com.mycompany.scannerclass;

import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author suvar
 */
public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process run = new Process();
        clearConsole cls = new clearConsole();
        
        
        run.inputData(); // Menampilkan Input
        cls.clear(); // Membersihkan Console
        System.out.println("\n \nPOGRAM NILAI MAHASISWA");
        System.out.println("----------------------");
        run.displayData(); // Menampilkan Data yang sudah diinput
        System.out.println("----------------------");
        System.out.printf("Rata Rata : %.1f\t", run.rata2()); // Menampilkan Rata Rata
        
        
    } 
}
