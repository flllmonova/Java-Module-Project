import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxSpeedOfCar = 250;
        int numberOfCars = 3;
        Winner winner = new Winner();
        System.out.println("Добро пожаловать на гонку 24 часа Ле-Мана!");

        // цикл для сбора данных о машинах
        for (int i = 0; i < numberOfCars; i++) {
            // запрос названия машины
            System.out.println("Введите название машины №" + (i + 1) +":");
            String name = scanner.next();

            // запрос скорости
            System.out.println("Введите скорость машины №" + (i + 1) +":");
            int speed = scanner.nextInt();

            // проверка скорости
            while (!(speed > 0 && speed <= maxSpeedOfCar)) {
                System.out.println("Неправильная скорость");
                System.out.println("Введите скорость машины №" + (i + 1) +":");
                speed = scanner.nextInt();
            }

            // создание объекта типа Automobile и передача данных
            Automobile car = new Automobile(name, speed);

            // расчет победителя
            Race racingCar = new Race(car);
            racingCar.calculateWinner(winner);
        }
        System.out.println("Самая быстрая машина: " + winner.name);
        scanner.close();
    }
}