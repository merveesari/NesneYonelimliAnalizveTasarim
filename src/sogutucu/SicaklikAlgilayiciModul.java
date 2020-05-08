/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucu;
import java.util.*;

/**
 *
 * @author MERVE
 */
public class SicaklikAlgilayiciModul implements ISicaklikAlgilayiciModul{
    
    private int sicaklik;
    //private double fsicaklik;
    
    public SicaklikAlgilayiciModul(){
        
        Random rastgele = new Random();
        sicaklik = rastgele.nextInt(51);
    }
    
    public int SicaklikDondur(){
        return sicaklik;
    }
    /*
    public double SicaklikFahrenheitDondur(){
        fsicaklik = sicaklik * (1.8) + 32;
        return fsicaklik;
    }
    */
}
