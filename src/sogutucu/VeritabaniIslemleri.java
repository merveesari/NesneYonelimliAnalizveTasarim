/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucu;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import org.postgresql.Driver;

/**
 *
 * @author MERVE
 */
public class VeritabaniIslemleri {
    
    ArrayList<String> Kisiler = new ArrayList<String>();
    ArrayList<String> Sifreler = new ArrayList<String>();
    ArrayList<String> KullaniciId = new ArrayList<String>();
    private static VeritabaniIslemleri instance;
    private PrintWriter out;
    private String kullaniciAdi= null;
    private String kullaniciId=null;
    private String sifre = null;
    
    private VeritabaniIslemleri(){
    
    try
        {   /***** Bağlantı kurulumu *****/
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Sogutucu", "postgres", "Duru2016");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");

   
            String sql = "SELECT \"kullaniciAdi\", \"kullaniciId\", \"sifre\"  FROM \"InternetKullanicisi\"";

            /***** Sorgu çalıştırma *****/
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            /***** Bağlantı sonlandırma *****/
            conn.close();

            while(rs.next())
            {
                /***** Kayda ait alan değerlerini değişkene ata *****/
                kullaniciAdi  = rs.getString("kullaniciAdi");
                kullaniciId = rs.getString("kullaniciId");
                sifre = rs.getString("sifre");

                /***** Listelere ekle *****/
                Kisiler.add(kullaniciAdi);
                Sifreler.add(sifre);
                KullaniciId.add(kullaniciId);
            }
            
            /***** Kaynakları serbest bırak *****/
            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static synchronized VeritabaniIslemleri getInstance(){ //Singleton ilkesi nesne kontrol fonksiyonu
        if(instance==null)
            instance = new VeritabaniIslemleri();
        return instance;
    }
    
    public boolean kullaniciDogrula(String kullaniciAdi, String sifre) { //Kullanıcı doğrulamak için fonksiyon
        
        System.out.println("Sogutucu bilgi sistemi kullanıcıyı doğruluyor...");
        
        try {
                Thread.sleep(2000);
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
        
        System.out.println("Veritabanına bağlandı ve kullanıcı bilgilerini aldı.");

        for (int i = 0; i < Kisiler.size(); i++) { //Kullanıcıdan alınan bilgilerin veritabanından kontrolü
            if (Kisiler.get(i).compareTo(kullaniciAdi) == 0 && Sifreler.get(i).compareTo((sifre)) == 0) {
                System.out.println("Kullanici Dogrulandi");
                return true;
            }
        }
        System.out.println("Kullanici Dogrulanamadi");
        return false;
    }  
}
