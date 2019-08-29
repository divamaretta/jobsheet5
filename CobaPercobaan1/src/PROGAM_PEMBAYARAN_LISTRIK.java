/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Diva Maretta
 */

public class PROGAM_PEMBAYARAN_LISTRIK {
    public static void main (String[] args) {
        System.out.println("===PEMBAYARAN LISTRIK===");
        int kwh;
        double Total;
        double Biaya;
        double pajak;
        
        //Scanner
        Scanner baca = new Scanner(System.in);
        
        //input
        System.out.print("berapa besaran kwh yang anda pakai?");
        kwh = baca.nextInt();
        
        if (kwh <=450){
            System.out.println("golongan C");
            Biaya = 20.000 + (kwh * 1000);
            System.out.println("Biaya :" + Biaya);
            
            Total = ((Biaya * 10 / 100) + Biaya);
            System.out.println("pajak : 10%");
            System.out.println("Total : " + Total);
           
            
            
        }else if  (kwh <= 900){
            System.out.println("golongan B");
            Biaya = 35.000 + (kwh * 2500);
            System.out.println("Biaya :" + Biaya);
            
            Total = ((Biaya * 15 / 100) + Biaya);
            System.out.println("pajak : 15%");
            System.out.println("Total : " + Total);
            
            
        }else if (kwh <= 1200){
            System.out.println("golongan A");
            Biaya = 20.000 + (kwh * 3000);
            System.out.println("Biaya :" + Biaya);
            
            Total = ((Biaya * 20 / 100) + Biaya);
            System.out.println("pajak : 20%");
            System.out.println("Total : " + Total);
            
            
         
            
            
            
            
            
            
        
        
    }}
        
       
        
        
        
        
        
        
        
    
    
   
    
}
