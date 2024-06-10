import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать на гонку 24 часа Ле-Мана!");

        Race winner = new Race();

        // цикл для сбора данных о машинах
        for (int i = 0; i < 3; i++) {
            // запрос названия машины
            System.out.println("Введите название машины №" + (i + 1) +":");
            String name = scanner.next();

            // запрос скорости
            System.out.println("Введите скорость машины №" + (i + 1) +":");
            int speed = scanner.nextInt();

            // проверка скорости
            while (!(speed > 0 && speed <= 250)) {
                System.out.println("Неправильная скорость");
                System.out.println("Введите скорость машины №" + (i + 1) +":");
                speed = scanner.nextInt();
            }

            // создание объекта типа Automobile и передача данных
            Automobile car = new Automobile(name, speed);

            // расчет победителя
            winner.calculateWinner(car);
        }

        scanner.close();
        System.out.println("Самая быстрая машина: " + winner.winner);
    }
}