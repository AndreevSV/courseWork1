public class Main {

   public static void main(String[] args) {

       // Создаем объекты типа Employee, вводим данные работников
       Employee employee1 = new Employee("Сергей", "Владимирович", "Андреев", 90_000, 1);
       Employee employee2 = new Employee("Иван", "Сергеевич", "Колдунов", 120_000, 1);
       Employee employee3 = new Employee("Дмитрий", "Владимирович", "Ребенок", 100_000, 1);
       Employee employee4 = new Employee("Аркадий", "Савельевич", "Курбатов", 100_000, 2);
       Employee employee5 = new Employee("Владимир", "Кириллович", "Уваров", 100_000, 2);
       Employee employee6 = new Employee("Павел", "Иосифович", "Пастухов", 100_000, 3);
       Employee employee7 = new Employee("Савелий", "Викторович", "Краморов", 100_000, 4);
       Employee employee8 = new Employee("Илья", "Сергеевич", "Говоров", 100_000, 5);
       Employee employee9 = new Employee("Василий", "Васильевич", "Пономарев", 100_000, 5);
       Employee employee10 = new Employee("Тимур", "Ахметович", "Коробов", 100_000, 5);

       Employee[] employee = new Employee[10]; //Создаем массив с данными работников (массив из объектов)

       // Заполняем массив элементами типа Employee
       employee[0] = employee1;
       employee[1] = employee2;
       employee[2] = employee3;
//       employee[3] = employee4;
       employee[4] = employee5;
       employee[5] = employee6;
       employee[6] = employee7;
       employee[7] = employee8;
       employee[8] = employee9;
       employee[9] = employee10;

       Method.printArray(employee);

       System.out.println(); //Вставляем пустую строку для разделения смысловых блоков

       System.out.println("Сумма всех затрат на зарплату = " + Method.getTotalSalary(employee)); // Вывод на печать всех затрат на зарплату
       System.out.println("Сотрудник с максимальной зарплатой - " + Method.getFullNameMax(employee) + ". Его зарплата = " + Method.getMaxSalary(employee)); // Вывод на печать сотрудника с максимальной зарплатой и его зарплату
       System.out.println("Сотрудник с минимальной зарплатой - " + Method.getFullNameMin(employee) + ". Его зарплата = " + Method.getMinSalary(employee)); // Вывод на печать сотрудника с минимальной зарплатой и его зарплату
       System.out.println("Средняя зарплата = " + Method.getAverageSalary(employee)); // Вывод на печать средней зарплаты по всем сотрудникам

       System.out.println(); //Вставляем пустую строку для разделения смысловых блоков

       Method.printFullName(employee); // Печатаем массив только с именами

   }


}




