
package Sources;

import java.util.ArrayList;


public class Student extends User {
    private int birthYear;
    private ArrayList<Course> dersler = new ArrayList<>();
    private String yoneticiMesaji;

    public int getBirthYear() {
        return birthYear;
    }

    public ArrayList<Course> getDersler() {
        return dersler;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setDersler(ArrayList<Course> dersler) {
        this.dersler = dersler;
    }

    public String getYoneticiMesaji() {
        return yoneticiMesaji;
    }

    public void setYoneticiMesaji(String yoneticiMesaji) {
        this.yoneticiMesaji = yoneticiMesaji;
    }

    public Student(String name, String surname, String TC, String ID, String password, int birthYear) 
    {
        super(name,surname,TC,ID,password);
        this.birthYear = birthYear;
    }
    
    public void dersEkle(Course yeniDers)
    {
        dersler.add(yeniDers);
    }
    public void dersCikar(int indeks)
    {
        dersler.remove(indeks);
    }
    public boolean dersAlinmisMi(Course ders)
    {
        for (int sayac = 0; sayac < dersler.size(); sayac++) {
            Course c = dersler.get(sayac);
            if (c.getCode().equals(ders.getCode())) {
                return true;
            }
        }
        return false;
    }
            
    
    
 
}
