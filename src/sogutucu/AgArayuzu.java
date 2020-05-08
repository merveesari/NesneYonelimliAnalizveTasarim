/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucu;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author MERVE
 */
public class AgArayuzu {
    
    public AgArayuzu(){
        
        MerkeziIslemBirimi sogutucuAc = new MerkeziIslemBirimi();
        MerkeziIslemBirimi sogutucuKapat = new MerkeziIslemBirimi();
        
        Kullanici1 s1 = new Kullanici1();
        Kullanici2 s2 = new Kullanici2();

        Publisher p = new Publisher();

        p.attach(s1);
        p.attach(s2);
        
        int sec = 1;
        do{ //Çıkış işlemi seçilene kadar seçim yaptırmak için döngü
            Scanner reader = new Scanner(System.in);

            System.out.println("[1] Sogutucuyu Ac");
            System.out.println("[2] Sogutucuyu Kapat");
            System.out.println("[3] Sicaklik Goruntule");
            System.out.println("[4] Cikis");
            System.out.print("Secim:");
            sec = reader.nextInt();
            
            switch(sec){
                case 1:
 
                    System.out.println(sogutucuAc.AcmaIstegiGonder());
                break;
                case 2:
                    System.out.println(sogutucuKapat.KapatmaIstegiGonder());
       
                break;
                case 3:
                    SicaklikAlgilayiciModul sicaklik = new SicaklikAlgilayiciModul();
                    System.out.println("Sicaklik Olculuyor...");
                 
                    try {
                            Thread.sleep(1500);
                    } catch (InterruptedException e) {
                            e.printStackTrace();
                    }

                    System.out.println("Sicaklik " + sicaklik.SicaklikDondur() + "°C");
                break;
                case 4:
                    
                break;
                default:
                    System.out.println("Yanlis tercih!");
                break;

            }
        }while(sec != 4); 
    }
}
