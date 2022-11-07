public class Main {

   public static void main(String[] args) {

       // Создаем объекты типа Employee, вводим данные работников
       Employee employee1 = new Employee("Сергей", "Владимирович", "Андреев", 100_006, 1);
       Employee employee2 = new Employee("Иван", "Сергеевич", "Колдунов", 100_001, 1);
       Employee employee3 = new Employee("Дмитрий", "Владимирович", "Ребенок", 100_002, 1);
       Employee employee4 = new Employee("Аркадий", "Савельевич", "Курбатов", 100_003, 2);
       Employee employee5 = new Employee("Владимир", "Кириллович", "Уваров", 100_010, 2);
       Employee employee6 = new Employee("Павел", "Иосифович", "Пастухов", 100_004, 3);
       Employee employee7 = new Employee("Савелий", "Викторович", "Краморов", 100_005, 4);
       Employee employee8 = new Employee("Илья", "Сергеевич", "Говоров", 100_999, 5);
       Employee employee9 = new Employee("Василий", "Васильевич", "Пономарев", 100_900, 5);
       Employee employee10 = new Employee("Тимур", "Ахметович", "Коробов", 100_008, 5);

       Employee[] employee = new Employee[10]; //Создаем массив с данными работников (массив из объектов)

       // Заполняем массив элементами типа Employee
       employee[0] = employee1;
       employee[1] = employee2;
       employee[2] = employee3;
       employee[3] = employee4;
       employee[4] = employee5;
       employee[5] = employee6;
       employee[6] = employee7;
       employee[7] = employee8;
       employee[8] = employee9;
       employee[9] = employee10;

       for (int i = 0; i < employee.length; i++) {
           System.out.println(employee[i]); // Вывод на печать списка всех сотрудников из массив
       }

       System.out.println(); //Вставляем пустую строку для разделения смысловых блоков

       System.out.println("Сумма всех затрат на зарплату = " + getTotalSalary(employee)); // Вывод на печать всех затрат на зарплату
       System.out.println("Сотрудник с максимальной зарплатой - " + getFullNameMax(employee) + ". Его зарплата = " + getMaxSalary(employee)); // Вывод на печать сотрудника с максимальной зарплатой и его зарплату
       System.out.println("Сотрудник с минимальной зарплатой - " + getFullNameMin(employee) + ". Его зарплата = " + getMinSalary(employee)); // Вывод на печать сотрудника с минимальной зарплатой и его зарплату
       System.out.println("Средняя зарплата = " + getAverageSalary(employee)); // Вывод на печать средней зарплаты по всем сотрудникам

       System.out.println(); //Вставляем пустую строку для разделения смысловых блоков

       printFullName(employee); // Печатаем массив только с именами

   }
       public static int getTotalSalary(Employee[] employee) { // Метод для подсчета суммы затрат на зарплату
           int totalSalary = 0;
           for (int i = 0; i < employee.length; i++) {
               totalSalary = totalSalary + employee[i].getSalary(); // Проходим по массиву и суммируем все значения поля salary
           }
           return totalSalary; // Возвращаем сумму всех значений поля salary
       }

    public static int getMaxSalary(Employee[] employee) { // Метод подсчета максимальной зарплаты
        int maxSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static String getFullNameMax(Employee[] employee) {
       String fullName = employee[0].fullName;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() == getMaxSalary(employee)) {
                fullName = employee[i].getFullName();
            }
        }
        return fullName;
    }

    public static int getMinSalary (Employee [] employee) { // Метод подсчета минимальной зарплаты
        int minSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
            }
        }
        return minSalary;
    }

    public static String getFullNameMin(Employee[] employee) {
       String fullName = employee[0].getFullName();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() == getMinSalary(employee)) {
                fullName = employee[i].getFullName();
            }
        }
        return fullName;
    }

    public static int getAverageSalary(Employee[] employee) { // Метод подсчета средней зарплаты
        double averageSalary = (double) getTotalSalary(employee) / employee.length;
    return (int) averageSalary;
    }

    public static void printFullName(Employee[] employee) { // Метод печати всех полей fullNme из массива
        for (int i = 0; i < employee.length; i++) {
            String fullName = employee[i].getFullName();
            System.out.println(fullName);
        }
    }

}




