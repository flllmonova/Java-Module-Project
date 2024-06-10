public class Race {
    int timeOfRace = 24;
    String nameOfRacingCar;
    int distanceOfRacingCar;

    Race(Automobile car) {
        nameOfRacingCar = car.name;
        distanceOfRacingCar = car.speed * timeOfRace;
    }

    void calculateWinner(Winner newWinner) {
        if (distanceOfRacingCar > newWinner.distance) {
            newWinner.name = nameOfRacingCar;
            newWinner.distance = distanceOfRacingCar;
        }
    }
}