/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saranbahan2resep;
import java.util.Scanner;
/**
 *
 * @author Diva Maretta
 */
public class SaranBahan2Resep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String identitas = "diva maretta / X RPL2 / 06";
        System.out.println("identitas : "+ identitas);
        
        System.out.print("\nSaran Resep dari Bahan Milik Anda\n");
        
        //Initial commit 
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Bahan Pertama: ");
        System.out.println("1. pisang");
        System.out.println("2. telur");
        System.out.println("Masukkan no pilihan Anda :");
        int bahan1 = scanner.nextInt();
        
        //input bahan 1
        if(bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("Bahan kedua");
            if (bahan1 == 1){
                System.out.println("1. Susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. tidak ada");
            }else{
                System.out.println("1. minyak goreng");
                System.out.println("2. roti");
                System.out.println("3. tidak ada");
            }
            System.out.println("Masukkan no pilihan Anda :");
            int bahan2 = scanner.nextInt();
        }else
            System.out.println("Mohon Maaf,Pilihan tidak ditemukan," 
                    +"tidak dapat memberikan saran resep");
        
        //input bahan 2
        int bahan2 = scanner.nextInt();
                
        if (bahan2 >= 1 && bahan2 <= 3)
        {  
            if (bahan1 ==1)
                switch (bahan2)
                {
                    case 1 : System.out.println(
                            "Anda dapat membuat milk shake banana "); break;
                    case 2 : System.out.println(
                            "Anda dapat membuat pisang goreng "); break; 
                    case 3 : System.out.println(
                            "Anda dapat membuat pisang rebus "); 
                }   
                else
                switch (bahan2)
                {
                    case 1 : System.out.println(
                            "Anda dapat membuat telur mata sapi "); break;
                    case 2 : System.out.println(
                            "Anda dapat membuat sanwich telur"); break; 
                    case 3 : System.out.println(
                            "Anda dapat membuat telur rebus "); 
                }
        }else
            System.out.println("Mohon Maaf,Pilihan tidak ditemukan," 
                    +"tidak dapat memberikan saran resep");
        
        //tambah tampil resep
                {   
                
                }     
                        
        
        
            
        
            
                
                
                
                
            
        }
        }
        
                
                
        
    }
    
}
