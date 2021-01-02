
package Sources;


public class User {
    private String name;
    private String surname;
    private String TC;
    private String ID;
    private String password;

    public User(String name, String surname,String TC, String ID,  String password) {
        this.ID = ID;
        this.name = name;
        this.TC = TC;
        this.surname = surname;
        this.password = password;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }
    
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
