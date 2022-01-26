/**
 *  Java 1. HomeWork 5
 *
 * @author PrikhodchenkoDO
 * @version 26.01.2022
 */

package lesson05;

public class Lesson5HomeWork {
    public static void main(String[] args){

        Person[] collegue = new Person[5];

        collegue[0] = new Person(" Valeriy Krij ", " manager ",
                                 " krijv@mail.ru ", " 89153645231 ", 30000 , 39 );
        collegue[1] = new Person(" Din Joe ", " Operations manager ",
                                 " jo@mail.ru ", " 89153645231 ", 40000 , 41 );
        collegue[2] = new Person(" Glin Ra ", " Receptionist ",
                                 " rec@mail.ru ", " 89153565231 ", 60000 , 37 );
        collegue[3] = new Person(" Gvan Dion ", " Marketing manager ",
                                 " marketm@mail.ru ", " 84654545231 ", 45000 , 59 );
        collegue[4] = new Person(" James Bond ", " Purchasing manager ",
                                 " purch@mail.ru ", " 89913555231 ", 25000 , 47 );

        for (Person person : collegue)
            if ( person.getAge() > 40 ) {
                System.out.println(person);
            }
    }
}

class Person {
    private String fullname;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person( String fullname, String position, String email, String phone, int salary, int age ) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullname) {
        this.fullname = fullname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + fullname + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }
}

