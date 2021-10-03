package HomeWorks.HW5;

public class ClassWorker {
    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public ClassWorker(String name, String surname, String patronymic, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        System.out.print(name + " " + surname + " " + patronymic + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age + ".");

    }
//    String getSurname() {
//        return surname;
//    }
//    String getName() {
//        return name;
//    }
//    String getPatronymic() {
//        return patronymic;
//    }
//    String getEmail() {
//        return email;
//    }
//    String getPhone() {
//        return phone;
//    }
//    int getSalary() {
//        return salary;
//    }
    int getAge() {
        return age;
    }

    String getAll() {
        return this.name + " " +
                this.patronymic + " " +
                this.patronymic + ", " +
        this.position + ", " +
        this.email + ", " +
        this.phone + ", " +
        this.salary + ", " +
        this.age + ".";

    }

}

