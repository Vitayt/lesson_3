package leson_3;

public class Runner {
    public static void main(String[] args) {
       Empl person_1  = new Empl("Иванов И.И.","Директор","ivanov@mail.com","+123","2000$", 40);
      person_1.printEmpl();
        Empl[] persArray = new Empl[5];

        persArray[0] = new Empl("Петров П.П", "специалист", "petrov@mail.com", "+124", "500$", 25);
        persArray[1] = new Empl("Котов П.П", "специалист", "petrov@mail.com", "+124", "500$", 45);
        persArray[2] = new Empl("Павлов П.П", "специалист", "petrov@mail.com", "+124", "500$", 30);
        persArray[3] = new Empl("Сидоров П.П", "специалист", "petrov@mail.com", "+124", "500$", 25);
        persArray[4] = new Empl("Лукашенко П.П", "специалист", "petrov@mail.com", "+124", "500$", 60);

        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].getAge()>40) persArray[i].printEmpl();
                    }

    }
}
