/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticSolution implements QuadraticEquation{

    private double x1,x2;
    private String a_out="";
    private String b_out = "";
    private String c_out = "";
    private String result = "";
    
    
    
    public QuadraticSolution(double A, double B, double C){
        
        
        calculateSolution(A, B, C);
        
    }
    
    
    @Override
    public boolean hasSolution(double coeffA, double coeffB, double constantC) {
        double a = coeffA;
        double b = coeffB;
        double c = constantC;
        
        double condition;
        
        condition = Math.pow(b, 2) - (4*a*c);
        
        if ((condition >= 0) & (a != 0))
            return true;
        else 
            return false;
        
    }

    @Override
    public void calculateSolution(double coeffOfXsquared, double coeffOfX, double constant) {
        DecimalFormat decimals = new DecimalFormat("0.0");
                
        
        double a = coeffOfXsquared;
        double b = coeffOfX;
        double c = constant;
        
        if(hasSolution(a, b, c) == true){
            double square_root = Math.sqrt( Math.pow(b, 2) - (4*a*c) );
        
            x1 = (((-1*b) + square_root))/(2*a); 
            x2 = (((-1*b) - square_root))/(2*a);

            //--------------------------------------------------------
            if(a < 0)
                a_out = String.valueOf(decimals.format(a));
            else 
                a_out = String.valueOf(decimals.format(a));
            //--------------------------------------------------------
            if(b < 0)
                b_out = String.valueOf(decimals.format(b));
            else 
                b_out = "+" + String.valueOf(decimals.format(b));
            //--------------------------------------------------------
            if(c < 0)
                c_out = String.valueOf(decimals.format(c));
            else 
                c_out = "+" + String.valueOf(decimals.format(c));
            //--------------------------------------------------------


            
        }
        if(hasSolution(a, b, c) == false){
            
            //--------------------------------------------------------
            if(a < 0)
                a_out = String.valueOf(decimals.format(a));
            else 
                a_out = String.valueOf(decimals.format(a));
            //--------------------------------------------------------
            if(b < 0)
                b_out = String.valueOf(decimals.format(b));
            else 
                b_out = "+" + String.valueOf(decimals.format(b));
            //--------------------------------------------------------
            if(c < 0)
                c_out = String.valueOf(decimals.format(c));
            else 
                c_out = "+" + String.valueOf(decimals.format(c));
            //--------------------------------------------------------
            
            result = ("There are no real roots to the equation " + a_out + "x^2" + b_out + "x" + c_out);
        }
            


        
        
            
        
    }
    
    public String toString(){
        DecimalFormat decimals = new DecimalFormat("0.0");
        
        if (result.length() > 1)
            return result;
        if(x1 != x2){
            result = ("The roots to the equation " + a_out + "x^2" + b_out + "x" + c_out +" are:") + '\n';
            result += ("x1 = " + decimals.format(x1)+ '\n');
            result += ("x2 = " + decimals.format(x2) + '\n');
        }
        if(x1 == x2){
            result = ("The equation " + a_out + "x^2" + b_out + "x" + c_out + " has one root:") + '\n';
            result += ("x = " + decimals.format(x1));
        }
        
        return result;
    }
    
    
    
}
