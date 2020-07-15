package wipeout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class OnoTarihZaman {
    private final Date sistemZamani;
    private final File sayacDosyasi = new File("D:\\Programming\\java\\Java 8 kitabı ile kodlar"
            + "\\Projeler\\WipeOutV2\\WipeOutV2\\files\\sayac.txt");
    
    private int sistemZamaniSayaci;
    public OnoTarihZaman () {
        sistemZamani = new Date();
        sistemZamaniSayaci = getSayac();
        sistemZamaniSayaci++;
        setSayac(sistemZamaniSayaci);
    }
    public int getTamSayac() {
        return sistemZamaniSayaci;
    }
    private int getSayac() {
        int sayac = 0;
        // Sayac.txt içindeki integer sayıyı oku
        try {
            Scanner input = new Scanner(sayacDosyasi);
            sayac = input.nextInt();
            input.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı.");
        }
        return sayac;
    }
    private void setSayac(int sayac1) {
        try {
            PrintWriter output = new PrintWriter(sayacDosyasi);
            output.print(sayac1);
            output.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Dosya bulunamadı.");
        }
    }
    public String getTarih() {
        DateFormat bicim = DateFormat.getDateInstance(DateFormat.LONG);
        Object obj = bicim.format(sistemZamani);
        String tarih = obj.toString();
        return tarih;
    }
    public String getZaman() {
        DateFormat zamanBicim = DateFormat.getTimeInstance();
        Object obj2 = zamanBicim.format(sistemZamani);
        String zaman = obj2.toString();
        return zaman;
    }
    
    
}
