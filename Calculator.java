/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author sasmob
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    static int date;
    int balance;
    
//    static int i;
//    static float f;
//    static double d;
//    static boolean b;
//    static char c;
//    static short s;
//    static long l;
//    static byte by;
    
    public static void main(String[] args) {
//        int i = 10;
//        float fl = 12.3f;
//        int t;
//        //System.out.println(t); cannot use without inisialize
//        System.out.println(j); // you can use without inisialize
//        
//        int result = JOptionPane.showConfirmDialog(null, "Do you agree that "+i+
//                " > "+fl,"confirm",JOptionPane.YES_NO_OPTION);
//        
//        if(result == JOptionPane.OK_OPTION){
//            JOptionPane.showMessageDialog(null, "you press ok button");
//        }else{
//             JOptionPane.showMessageDialog(null, "you press No button");
//        } 

//             
//             System.out.println(Math.PI);
//             System.out.println(Integer.MAX_VALUE);
//             System.out.println(Integer.MIN_VALUE);
//             System.out.println("=========================");
//             System.out.println(Byte.SIZE/8);
//             System.out.println(Short.SIZE/8);
//             System.out.println(Long.SIZE/8);
//             
//             System.out.println(Integer.SIZE/8);
//             System.out.println(Float.SIZE/8);
//             System.out.println(Double.SIZE/8);
//             System.out.println("=========================");
//             System.out.println(Calculator.i);
//             System.out.println(Calculator.f);
//             System.out.println(Calculator.d);
//             System.out.println(Calculator.l);
//             System.out.println(Calculator.c);
//             System.out.println(Calculator.by);
//             System.out.println(Calculator.s);
             
      Calculator a = new Calculator();
      a.balance = 80;
      Calculator b = a;
      b.balance = 60;
      a.balance = 90;
      Calculator c = b;
      c.balance = 50;      
      System.out.println(a.balance);
        
       
    }
    
}
