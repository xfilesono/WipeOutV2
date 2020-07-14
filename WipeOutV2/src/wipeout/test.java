/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wipeout;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author Ono
 */
public class test extends DeleteFiles {
    
    public static String[] resimKontrol() {
        try {
            FileInputStream akis2 = new FileInputStream("SilinenDosyaKayit.txt");
            InputStreamReader okuyucu2 = new InputStreamReader(akis2);
            BufferedReader buffer2 = new BufferedReader(okuyucu2);
            
            // Dosyanın içinde kaç satır var aldık ve dizi oluşturduk
            Path path = Paths.get("SilinenDosyaKayit.txt");
            int satirSayisi = (int)Files.lines(path).count();
            dizi = new String[satirSayisi];
            //System.out.println(dizi.length);
                            
            for (int i = 0 ; i < dizi.length ; i++) {
                satir = buffer2.readLine();
                dizi[i] = satir;
            }
            
            akis2.close();
        }
        catch (IOException e) {
            System.out.println("Hata meydana geldi: " + e.getMessage());
            // JOptionPane.showMessageDialog(null, "Hata meydana geldi: " + e.getMessage());
        }
        return dizi;
    }
    
    private static String dizi[];
    private static String satir;
    
}
