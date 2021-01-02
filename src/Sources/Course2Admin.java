
package Sources;

import java.util.ArrayList;


public class Course2Admin {
    
    private Student ogrenci;
    private ArrayList<Course> dersler = new ArrayList<>();

    public Course2Admin(Student ogrenci) {
        this.ogrenci = ogrenci;
    }

    public Student getOgrenci() {
        return ogrenci;
    }

    public ArrayList<Course> getDersler() {
        return dersler;
    }

    public void setOgrenci(Student ogrenci) {
        this.ogrenci = ogrenci;
    }

    public void setDersler(ArrayList<Course> dersler) {
        this.dersler = dersler;
    }
    
    public void dersEkle (Course yeniDers)
    {
        dersler.add(yeniDers);
    }
    
    
    
}
