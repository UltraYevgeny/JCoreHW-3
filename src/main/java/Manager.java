public class Manager extends Employee {

    public Manager(String name, String midName, String surName,
                        String phone, String position, int salary, int birth) {

        super(name, midName, surName, phone, position, salary, birth);
    }

    /**
     * Поднятие зарплаты всем сотрудникам кроме Manager
     * @param emp массив сотрудников
     * @param increment сумма на которую повышается зарплата
     */
    public static void increaser(Employee[] emp, int increment) {
        for (int i = 0; i < emp.length; i++) {
            if (!(emp[i] instanceof Manager))
                emp[i].increaseSalary(increment);
        }

    }



}