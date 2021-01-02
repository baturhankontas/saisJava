
package Sources;

import GUI.GirisEkrani;
import GUI.StudentPage;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

    
    public static void main(String[] args) {
        
        ArrayList<User> kullaniciListesi = new ArrayList<>();
        ArrayList<Course> dersListesi = new ArrayList<>();
        ArrayList<Course2Admin>alinacakDersler = new ArrayList<>();
        VerileriDosyadanOku(kullaniciListesi,dersListesi);
        GirisEkrani g = new GirisEkrani(kullaniciListesi,dersListesi,alinacakDersler);
        //StudentPage sp = new StudentPage(kullaniciListesi, dersListesi, null);
        System.out.print("");
    }
    
    private static void VerileriDosyadanOku(ArrayList<User> kullaniciListesi, ArrayList<Course> dersListesi) // verileri dosyadan okuyarak gerekli nesnelere atama yapar
    { 
        try{
            FileInputStream fstream = new FileInputStream("veriler.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            StringTokenizer st;
            while ((strLine = br.readLine()) != null)   {
                st = new StringTokenizer(strLine,"~");
                String tur = st.nextToken();
                if (tur.equals("S")) //ogrenci tipiyse
                {
                    Student yeniOgrenci = new Student(st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken(),Integer.parseInt(st.nextToken()));
                    while (st.hasMoreElements()) {
                        Course yeniDers = new Course(st.nextToken(),st.nextToken(),true);
                        yeniOgrenci.dersEkle(yeniDers);
                        DersListesineDersEkle(dersListesi, yeniDers);
                    }
                    kullaniciListesi.add(yeniOgrenci);
                }
                else if (tur.equals("T")) // ogretmen tipiyse
                {
                    Teacher yeniOgretmen = new Teacher(st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken());
                    kullaniciListesi.add(yeniOgretmen);
                }
                else if(tur.equals("A")) // admin tipiyse
                {
                    Admin yeniAdmin = new Admin(st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken());
                    kullaniciListesi.add(yeniAdmin);
                }
                else //Course listesiyse
                {
                    while (st.hasMoreElements()) {
                        Course yeniDers = new Course(st.nextToken(), st.nextToken(), Boolean.parseBoolean(st.nextToken()));
                        DersListesineDersEkle(dersListesi, yeniDers);
                    }
                }
            }
            in.close();
        }catch (Exception e){
            System.err.println("\r\n" + 
            		"Data not found in file!");
        }
    }
    
   private static void DersListesineDersEkle(ArrayList<Course>dersListesi, Course yeniDers)
   {
       boolean dersEkliMi = false;
       for (int sayac = 0; sayac < dersListesi.size(); sayac++) {
           Course c = dersListesi.get(sayac);
           if (c.getName().equals(yeniDers.getName())) { //ders ekliyse
               dersEkliMi = true;
               return;
           }
       }
       if (!dersEkliMi) {
           dersListesi.add(yeniDers);
       }
   }
    
}
