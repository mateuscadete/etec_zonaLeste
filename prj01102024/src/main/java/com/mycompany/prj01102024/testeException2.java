/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj01102024;

/**
 *
 * @author Admin
 */
public class testeException2 {
    public int v[] = new int [2];
    public int i;
    
    
    public int[] exception2(){
        int [] numeros = v;
        for(int i = 0; i < 4; i++){
            numeros[i] =  i + numeros[i];
        
        }        
        
        return numeros;
    }
}
