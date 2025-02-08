public class Employee {

        //region поля
        private static final int CURRENT_YEAR = 2025;
        String name;
        String midName;
        String surName;
        String position;
        String phone;
        int salary;
        int birth;

        // поле для прототипа компоратора
        int bMonth;
        // поле для прототипа компоратора
        int bDay;
        //endregion


        public Employee() {}

        public Employee(String name, String midName, String surName,
                        String phone, String position, int salary, int birth) {

                this.name = name;
                this.midName = midName;
                this.surName = surName;
                this.position = position;
                this.phone = phone;
                this.salary = salary;
                this.birth = birth;
        }

        /**
         * Повышение зарплаты одного сотрудника
         * @param amount сумма на которую поднимается зарплата сотрудника
         */
        public void increaseSalary(int amount) {
                if (this instanceof Manager) {
                        System.out.println("\nОшибка, подняли зарплату руководителю!!!!");}

                this.salary = this.salary + amount;
        }


        public int getAge() {
                return CURRENT_YEAR - birth;
        }

        @Override
        public String toString() {
                return String.format("Employee{" +
                                "name='%s', midName='%s', surName='%s'" +
                                ", position='%s', phone='%s'" +
                                ", salary=%d, age=%d}'",
                        name, midName, surName, position, phone, salary, getAge());
        }

        /**
         * прототип компаратора сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд
         * @param dd
         * @param mm
         * @param yyyy
         * @return отрицательно число значит дата из параметров больше и наоборот
         */
         public int compare(int dd, int mm, int yyyy) {
                //int empl = bDay + (bMonth << 6) + (birth << 11);
                int empl = 1 + (10 << 6) + (2024 << 11);
                int income = dd + (mm << 6) + (yyyy << 11);
                return empl - income;
        }

}
