/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucu;

import java.util.Scanner;

/**
 *
 * @author MERVE
 */
public class Sogutucu {
    
    
    public void basla(){
        
        
        Scanner reader = new Scanner(System.in);
        Scanner reader2 = new Scanner(System.in);
        System.out.print("Kullanci adi: ");
        String kullaniciAdi = reader.next();
        System.out.print("Sifre: ");
        String sifre = reader2.next();
        
        //Girilen bilgilere göre kullanıcı doğrulamak işlemi yapmak için döngü. Doğrulama yapılamazsa bilgiler tekrar alınır.
        while(!(VeritabaniIslemleri.getInstance().kullaniciDogrula(kullaniciAdi, sifre))){
            System.out.println("Hatali Giris!");
            System.out.print("Kullanci adi: ");
            kullaniciAdi = reader.next();
            System.out.print("Sifre: ");
            sifre = reader2.next();
        }  

        AgArayuzu menu = new AgArayuzu(); 
        
   
        
    
    }
    
    
    
    
}
