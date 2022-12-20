package lab11;

import java.util.Date;

public class StudentTest {
    public static void main(String[] args) {
        var stud = new Student("Student", 10, 100, new Date());
        System.out.println(stud.toString("yyyy MM dd"));
        System.out.println(stud.toString("dd MM"));
        System.out.println(stud.toString("dd"));
    }
}

/*    Доработайте класс Student предусмотрите поле для хранения даты
рождения, перепишите метод toString() таким образом, чтобы он разработайте
        метод, возвращал строковое представление даты рождения по вводимому в
        метод формату даты    */
