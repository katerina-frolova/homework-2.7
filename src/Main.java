public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();
        book.addEmployee(new Employee("Иванов Иван Иванович", 4,32_000));
        book.addEmployee(new Employee("Петрова Нина Сергеевна", 1,50_000));
        book.addEmployee(new Employee("Сидоров Поликарп Поликарпович", 4,45_000));
        book.addEmployee(new Employee("Панкратов Виталий Петрович", 4,41_000));

        System.out.println(book.findEmployee("Петрова Нина Сергеевна"));
        System.out.println();

        book.printStaff();
        System.out.println();

        book.removeEmployee("Сидоров Поликарп Поликарпович");

        book.printStaff();



    }
}