package com.mycompany.scannerclass;
import java.util.Scanner;
import java.io.IOException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author suvar
 */
public class Process {
    public String nim, nama;
    public double na, nt, nuts, nuas;
    
    // membuat object scanner
    Scanner input = new Scanner (System.in);
    
    void displayData(){
        System.out.println("Nim \t \t: " + this.nim);
        System.out.println("Nama \t \t: " + this.nama);          
        System.out.println("Nilai Absen \t: " + this.na);          
        System.out.println("Nilai Tugas \t: " + this.nt);          
        System.out.println("Nilai UTS \t: " + this.nuts);          
        System.out.println("Nilai UAS \t: " + this.nuas);          
    }
    
    void inputData(){
        System.out.print("Masukan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukan Nilai Absen : ");
        na = input.nextDouble();
        System.out.print("Masukan Nilai Tugas : ");
        nt = input.nextDouble();
        System.out.print("Masukan Nilai UTS : ");
        nuts = input.nextDouble();
        System.out.print("Masukan Nilai UAS : ");
        nuas = input.nextDouble();
        
    }
    
    public double rata2(){
        return (((0.10*na)+(0.20*nt)+(0.30*nuts)+(0.40*nuas))/4);
    }
    
    
}
