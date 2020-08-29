/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csi_t;

/**
 *
 * @author Shivangi
 */
public class prog3 {
     void m1()
       {
           System.out.println("m1 method");
       }
     prog3 ()
     {
         System.out.println("default constructor");
     }
    
     prog3(int a)
     {
         System.out.println("parametrised constructor");
     }
   
    public static void main(String[] args) {
      prog3 o1 = new prog3();
      o1.m1();;
      prog3 o2 = new prog3(20);
      o2.m1();
    }
   
}

