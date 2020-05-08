/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucu;

/**
 *
 * @author MERVE
 */
public class Eyleyici {
    private int AcikMi = 0;
    private int KapaliMi = 0;
    
    public String SogutucuAc(){
        
        if(AcikMi == 0){ //Soğutucu açık değilse açıldığını yazdır
            AcikMi++;
            System.out.println("Sogutucu aciliyor...");
            
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Sogutucu acildi.";
        }
        else{ //Soğutucu açıksa zaten açık olduğunu yazdır
            return "Sogutucu zaten acik!";
        }  
    }
    
    public String SogutucuKapat(){
        
        if(KapaliMi == 0){ //Soğutucu kapalı değilse kapandığını yazdır
            KapaliMi++;
            
            System.out.println("Sogutucu kapatiliyor...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Sogutucu kapatildi.";
        }
        else{ //Soğutucu kapalıysa zaten kapalı olduğunu yazdır
            return "Sogutucu zaten kapali!";
        }  
    
    }
    
}
