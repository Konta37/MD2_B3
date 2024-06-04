package TT.TTB5;

public class main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Carter", 22, true);
        Person person2 = new Person("May", "Leona", 19, false);
        //Truy cap gian tiep phuong thuc getter/setter
        System.out.println(person1.getFirstName()); //John
        System.out.println("Name person 2: " + person2.getFirstName() + " " + person2.getLastName()); //May leona
    }
}
