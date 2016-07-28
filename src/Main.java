import java.util.ArrayList;

/**
 * Created by victor on 28/07/16.
 */
public class Main {

    private static ArrayList<Phonedata> contactlist;

    public static void main(String[] args){
        System.out.println("Hola");
        contactlist = new ArrayList<Phonedata>();
        saveNumber(6587521, "Jorge", "sadff@sfad.c");
        saveNumber(6586213, "ADSF", "dsfalkj@dfa.c");
        showNumber();
        System.out.println("\n");
        updateContact(6587521, "DDDDD", "safsdaf@ad.c");
        showNumber();
        System.out.println("\n");
        deleteNumber(6586213);
        showNumber();

    }

    public static void saveNumber(int number, String name, String mail){
        Phonedata contact = new Phonedata(number, name, mail);
        contactlist.add(contact);
    }

    public static void showNumber(){
        for(int i = 0; i < contactlist.size(); i++){
            System.out.println(contactlist.get(i).getNumber() + " " + contactlist.get(i).getName() + " " + contactlist.get(i).getMail());
        }
    }

    public static Phonedata searchContact(int number){
        for(int i = 0; i < contactlist.size(); i++){
            if(number == contactlist.get(i).getNumber()){
                return contactlist.get(i);
            }
        }
        return null;
    }

    public static void deleteNumber(int number){
        Phonedata del = searchContact(number);
        contactlist.remove(del);
    }

    public static void updateContact(int number, String name, String mail){
        Phonedata upd = searchContact(number);
        upd.setNumber(number);
        upd.setName(name);
        upd.setMail(mail);
    }
}
