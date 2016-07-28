/**
 * Created by victor on 28/07/16.
 */
public class Phonedata {

    private int number;
    private String name;
    private String mail;

    public Phonedata(int number, String name, String mail){
        this.number = number;
        this.name = name;
        this.mail = mail;
    }

    public int getNumber(){
        return this.number;
    }

    public String getName(){
        return this.name;
    }

    public String getMail(){
        return this.mail;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMail(String mail){
        this.mail = mail;
    }
}
