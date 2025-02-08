/**
 * Смотри скриншот
 */
public class App {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Ivan", "Igorevich",
                        "Ovchinnikov", "8(495)000-11-22",
                        "developer", 50000, 1985),
                new Employee("Andrey", "Viktorovich",
                        "Bezrukov", "8(495)111-22-33",
                        "fitter", 52000, 1973),
                new Manager("Rupert", "Pavlovich",
                        "Gold", "8(495)123-22-33",
                        "manager", 70000, 1981),
                new Employee("Evgeniy", "Viktorovich",
                        "Delfinov", "8(495)222-33-44",
                        "project manager", 40000, 1963),
                new Employee("Natalia", "Pavlovna",
                        "Keks", "8(495)333-44-55",
                        "senior developer", 90000, 1990),
                new Employee("Tatiana", "Sergeevna",
                        "Krasotkina", "8(495)444-55-66",
                        "accountant", 50000, 1983)
        };

        System.out.println("\nСлужащие до поднятия зарплаты");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        //поднятие зарплаты служащим
        Manager.increaser(employees, 10000);


        System.out.println("\nСлужащие после поднятия зарплаты");
        for (Employee emp : employees) {
            System.out.println(emp);
        }


        //Employee prototype = new Employee();
        //System.out.println(prototype.compare(20, 8, 2025));


    }



}
