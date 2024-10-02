/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj01102024;

/**
 *
 * @author Admin
 */
class testeException1 {
    public int i;
    public int r;
    
    testeException1(int i){
        this.i = i;
    }
    
    
    int exception1(int n){
        int i = 0, r;
        r = i / 0;
    
        return r;
    }
}
