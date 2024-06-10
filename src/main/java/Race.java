public class Race {
    String winner = "";
    int distance = 0;

    void calculateWinner(Automobile racingCar) {
        int newDistance = racingCar.speed * 24;

        if (newDistance > distance) {
            winner = racingCar.name;
            distance = newDistance;
        }
    }
}