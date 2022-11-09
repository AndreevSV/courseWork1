public class Method {

    public static void printArray(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i]); // Вывод на печать списка всех сотрудников из массива
            }
        }
    }
    public static int getTotalSalary(Employee[] employee) { // Метод для подсчета суммы затрат на зарплату
        int totalSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() <= 0) {
                    System.out.println("Сотруднику " + employee[i].getFullName() + " не задана либо не верно задана зарплата, необходимо задать");
                } else {
                    totalSalary = totalSalary + employee[i].getSalary(); // Проходим по массиву и суммируем все значения поля salary
                }
            }
        }
        return totalSalary; // Возвращаем сумму всех значений поля salary
    }

    public static int getMaxSalary(Employee[] employee) { // Метод подсчета максимальной зарплаты
        int maxSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() > maxSalary) {
                    maxSalary = employee[i].getSalary();
                }
            }
        }
        return maxSalary;
    }

    public static String getFullNameMax(Employee[] employee) { // Метод получения ФИО сотрудника по его максимальной зарплате
        String fullName = employee[0].fullName;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() == getMaxSalary(employee)) {
                    fullName = employee[i].getFullName();
                }
            }
        }
        return fullName;
    }

    public static int getMinSalary (Employee [] employee) { // Метод подсчета минимальной зарплаты
        int minSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() < minSalary) {
                    minSalary = employee[i].getSalary();
                }
            }
        }
        return minSalary;
    }

    public static String getFullNameMin(Employee[] employee) { // Метод получения ФИО сотрудника по минимальной зарплате
        String fullName = employee[0].getFullName();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() == getMinSalary(employee)) {
                    fullName = employee[i].getFullName();
                }
            }
        }
        return fullName;
    }

    public static int getCounter(Employee[] employee) {
        int counter = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() != 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int getAverageSalary(Employee[] employee) { // Метод подсчета средней зарплаты
        double averageSalary = (double) getTotalSalary(employee) / getCounter(employee);
        return (int) averageSalary;
    }

    public static void printFullName(Employee[] employee) { // Метод печати всех полей fullName из массива
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                String fullName = employee[i].getFullName();
                System.out.println(fullName);
            }
        }
    }
}
