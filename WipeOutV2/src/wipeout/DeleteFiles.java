package wipeout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

/**
 * @author Ono
 * @company CapsCode
 */
public class DeleteFiles extends WipeOut{
    // test
    private String klasor;
    //private String silinecekDosyaAdi;
    
    public DeleteFiles () {
        this.klasor = super.klasor;
    }
    
    // This is a function for deleting same files...
    public void dosyalariSil(String silinecekDosyaAdi, String tamYolu) {
        
        try {
            File silinecekDosya = new File(tamYolu);
            boolean sonuc = silinecekDosya.delete();
        
        
            // Mac ve Linuxta Dosya izini sorunu var dosyayı silemiyoruz
            if(sonuc) {
                exactTime = new OnoTarihZaman();
                date = exactTime.getTarih();
                time = exactTime.getZaman();

                hicDosyaSilindiMi++;
                if (hicDosyaSilindiMi == 1) {
                    silinenler = "Silinen Dosyalar\n________________\n";
                }
                silinenler += silinecekDosyaAdi + " (" + date + "-" + time + ")" + "\n";
                System.out.println(silinecekDosyaAdi + " isimli Dosya Silindi ...");
            }
            else
                System.out.println(silinecekDosyaAdi + " isimli Dosya Silinemedi (zaten silinmiş olabilir)!!!");
        
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
           
           // Silinen dosyaların ikinci kez silinme denemesini engelleme amaçlı yazılan kod.
           // halen biraz sorunlu
        /*try {           
            int varMi = dosyaVarMi(txt);
            if(varMi == 1) {
                FileOutputStream akis = new FileOutputStream(txt , true);
                OutputStreamWriter yazici = new OutputStreamWriter(akis);
                BufferedWriter buffer = new BufferedWriter(yazici);
                buffer.write(silinecekDosyaAdi + "\n");
                buffer.flush();
                akis.close();
            }
            else
                System.out.println("Dosya bulunamadı yada izniniz yok" );
        }
        catch (IOException e){
            System.out.println("Hata meydana geldi: " + e.getMessage());
            //JOptionPane.showMessageDialog(null, "Hata meydana geldi: " + e.getMessage().toString());
        }
        
        File silinecekDosya = new File(tamYolu);
        boolean sonuc = silinecekDosya.delete();
        
        boolean sonuc = false;
        
        for (int i = 0 ; i < dizi.length ; i++) {
            if (!silinecekDosyaAdi.equals(dizi[i])) {
                File silinecekDosya = new File(tamYolu);
                sonuc = silinecekDosya.delete();
            }
            else
                sonuc = false;
        }
        
        if(sonuc) {
            silinenler += silinecekDosyaAdi + " - ";
            //JOptionPane.showMessageDialog(null, silinecekDosyaAdi + " isimli Dosya Silindi ...");
            //this.silinecekDosyaAdi = silinecekDosyaAdi;            
        }
        else{
            System.out.println(silinecekDosyaAdi + " isimli Dosya Silinemedi !!!\n" 
                    + "Klasör Yolu: " + klasor);
            JOptionPane.showMessageDialog(null, silinecekDosyaAdi + " isimli Dosya Silinemedi !!!\n" 
                    + "Klasör Yolu: " + klasor);
        }*/
    }
        
    public static int dosyaVarMi (String dosyaAdi) throws IOException {
        File dosya = new File(dosyaAdi);
        txt = dosya.getAbsolutePath();
        if (!dosya.exists()) {
            dosya.createNewFile();
            //System.out.println("Dosya mevcut değildi ancak oluşturuldu.");
            //JOptionPane.showMessageDialog(null, "Dosya mevcut değildi ancak oluşturuldu.");
            return 1;
        }
        else if(dosya.exists()){
            //System.out.println("Dosya Mevcut..");
            //JOptionPane.showMessageDialog(null, "Dosya Mevcut..");
            return 1;
        }
        else {
            //System.out.println("Hata Alındı..");
            //JOptionPane.showMessageDialog(null, "Hata Alındı...");
            return 0;
        }
    }
    public static String dizi[] = test.resimKontrol();
    public static String silinenler = "Silinen Dosyalar\n________________\n";
    public static String txt = "SilinenDosyaKayit.txt";
    public static int hicDosyaSilindiMi = 0;
    public static OnoTarihZaman exactTime;
    public static String date = "";
    public static String time = "";
}
