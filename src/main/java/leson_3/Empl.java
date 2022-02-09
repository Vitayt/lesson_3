package leson_3;

public class Empl {
    // Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    private String nameSurname;
    private String position;
    private String e_mail;
    private String phone;
    private String salary;
    private int age;
    //  Конструктор класса должен заполнять эти поля при создании объекта.

    public Empl(String nameSurname, String position, String e_mail, String phone, String salary, int age) {
        this.nameSurname = nameSurname;
        this.position = position;
        this.e_mail = e_mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

    public String getNameSurname() {
        return nameSurname;
    }

    public String getPosition() {
        return position;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
      public void printEmpl() {
        System.out.println("Ф.И.О. : "+Empl.this.getNameSurname());
        System.out.println("Должность : "+Empl.this.getPosition());
        System.out.println("e-mail : "+Empl.this.getE_mail());
        System.out.println("Телефон : "+Empl.this.getPhone());
        System.out.println("Зарплата : "+Empl.this.getSalary());
        System.out.println("Возраст : "+Empl.this.getAge());
          System.out.println();

      }

}