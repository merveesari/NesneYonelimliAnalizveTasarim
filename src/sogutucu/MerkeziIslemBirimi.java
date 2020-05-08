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
public class MerkeziIslemBirimi {
    Eyleyici nesne1 = new Eyleyici();
    Eyleyici nesne2 = new Eyleyici();
    
    public MerkeziIslemBirimi(){
        
    
    }
    
    public String AcmaIstegiGonder(){ //Eyleyici açma isteği gönderme
        
        return nesne1.SogutucuAc();
    }
    public String KapatmaIstegiGonder(){ //Eyleyici kapatma isteği gönderme
     
        return nesne2.SogutucuKapat();
    }

}
