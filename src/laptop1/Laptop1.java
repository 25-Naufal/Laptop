/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptop1;

import java.util.Scanner;

/**
 *
 * @author ASUS X450JN
 */
public class Laptop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] laptop = {"bla","Asus ROG","Acer","Dell","Lenovo","Samsung","MSI"};
      int[] harga =  {100,15000000, 8000000, 9000000, 7000000, 10000000, 12000000};
      int pilih,bayar;
        
      Scanner input = new Scanner(System.in);
      
      System.out.println("--LapMu--");
      System.out.println("Jual Laptop");
      System.out.println("Ada 25% diskon !!!");
      for (int i=1; i<harga.length;i++){
          System.out.println(i+". "+laptop[i]+" Seharga : Rp."+harga[i]);
      }
        
      System.out.println("Pilih laptop sesuai keinginan");
        pilih = input.nextInt();
    
        System.out.println("-----------------");
        System.out.println("Yang anda pilih : "+laptop[pilih]);
        
        System.out.println("Masukkan jumlah uang anda");
        System.out.print("Rp.");
        bayar = input.nextInt();
        
        
        if(bayar > harga[pilih]){
             System.out.println("-----------------");
            System.out.println("Kembalian Rp."+(bayar - (harga[pilih]*75)/100));
            System.out.println("Terima kasih telah berbelanja"); 
            System.out.println("-----------------");
        }else if (bayar == (harga[pilih]*75)/100){
             System.out.println("-----------------");
             System.out.println("Selamat menikmati !!");
             System.out.println("-----------------");
        }else{
            System.out.println("-----------------");
            System.out.println("Saldo anda kurang");
            System.out.println("-----------------");
        }
                
    }
    
    
    
      
    
}
