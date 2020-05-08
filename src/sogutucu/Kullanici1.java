/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucu;
import java.util.ArrayList;

/**
 *
 * @author MERVE
 */
public class Kullanici1 implements IObserver{
    
    @Override
    public void update(String mesaj) {
        System.out.println("Kullanici1 e gelen mesaj->" + mesaj);
    }
    
}
