import Kursovaya.Employee;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        fill();
        printAllEmployees();
        System.out.println("Сумма зарплат " + sumSalary());
        findMaxSalary();
        findMinSalary();
        findAverageSalary();
        printFIO();
        salaryIndexing();
    }

    public static void fill() {
        employees[0] = new Employee("Давид ", " Даниилович ", "Черепанов", 1, 35700);
        employees[1] = new Employee("Игорь ", " Романович ", " Окулов ", 2, 35800);
        employees[2] = new Employee("Федор ", " Дамирович ", " Гончаров ", 3, 35850);
        employees[3] = new Employee("Владислав ", " Викторович ", " Федосеев ", 4, 36000);
        employees[4] = new Employee("Степан ", " Федорович ", " Макаров ", 5, 36500);
        employees[5] = new Employee("Вера ", " Артемовна ", " Козлова ", 1, 37000);
        employees[6] = new Employee("Вероника ", " Назаровна ", " Туманова ", 2, 37500);
        employees[7] = new Employee("Маргарита ", " Руслановна ", "Константинова", 3, 38000);
        employees[8] = new Employee("Елизавета ", " Богдановна ", " Кузнецова ", 4, 38500);
        employees[9] = new Employee("Илья ", " Максимович ", "Шульгин  ", 5, 39000);
    }

    //1. Получить список всех сотрудников со всеми имеющимися по ним данными (toString))
    //2. Посчитать сумму затрат на зарплаты в месяц.
    //3. Найти сотрудника с минимальной зарплатой.
    //4. Найти сотрудника с максимальной зарплатой.
    //5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    //6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
    private static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static double sumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static void findMinSalary() {
        Employee empWithMinSalary = null;
        for (Employee employee : employees) {
            if (empWithMinSalary == null || employee.getSalary() < empWithMinSalary.getSalary()) {
                empWithMinSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + empWithMinSalary);

    }

    private static void findMaxSalary() {
        Employee empWithMaxSalary = null;
        for (Employee employee : employees) {
            if (empWithMaxSalary == null || employee.getSalary() > empWithMaxSalary.getSalary()) {
                empWithMaxSalary = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + empWithMaxSalary);

    }

    private static void findAverageSalary() {
        var sum = sumSalary();
        var average = sum / employees.length;
        System.out.println("Средняя зарплата сотрудника составляет: " + average);

    }

    private static void printFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());

        }
    }

    private static double salaryIndexing() {
        double salaryIndexing = 0;
        for (Employee employee : employees) {
            salaryIndexing = (employee.getSalary() * 0.01) + employee.getSalary();
            System.out.println("Проиндексированная зарплата " + salaryIndexing);
        }
        return salaryIndexing;
    }


    }

