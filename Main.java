public class Main {
    public static void main(String[] args) {
        Race race = new Race(30); // 30 "metres"
        Horse horse1 = new Horse('♘', "Apollo", 0.9);
        Horse horse2 = new Horse('♖', "Bolt", 0.85);
        Horse horse3 = new Horse('♗', "Comet", 0.8);

        race.addHorse(horse1, 1);
        race.addHorse(horse2, 2);
        race.addHorse(horse3, 3);

        race.startRace();
    }
}