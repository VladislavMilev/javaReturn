import java.util.ArrayList;

public class Figure implements Student{

    public void setStudents(String name, String surname, int age) {

        ArrayList <String> Name  = new ArrayList();
        ArrayList <String> Surname  = new ArrayList();
        ArrayList <Integer> Age = new ArrayList();

        if(age <= 18){
            System.out.println("Подрасти и приходи!");
        }else {
            Name.add(name);
            Surname.add(surname);
            Age.add(age);

            System.out.printf(Name.toString() + "\t");
            System.out.printf(Surname.toString() + "\t");
            System.out.println(Age.toString() + "\t");
        }

    }

}