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
            System.out.println("Введите название машины №" + (i + 1) + ":");
            String name = scanner.nextLine();

            // запрос скорости
            int speed;
            while (true) {
                System.out.println("Введите скорость для машины №" + (i + 1) + ":");
                Scanner scannerForInt = new Scanner(System.in);

                if (scannerForInt.hasNextInt()) {
                    speed = scannerForInt.nextInt();

                    if (speed > 0 && speed <= maxSpeedOfCar) {
                        break;
                    }
                }

                System.out.println("Скорость введена неверно");
            }

            // передача данных и создание машины
            Automobile car = new Automobile(name, speed);
            System.out.println("Машина " + name + " со скоростью "+ speed + " км/ч успешно зарегистрирована!");
            // превращение в гоночную машину
            Race racingCar = new Race(car);
            // расчет победителя
            racingCar.calculateWinner(winner);
        }

        // выведение результата
        System.out.println("Самая быстрая машина: " + winner.name);
        scanner.close();
    }
}