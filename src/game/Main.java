package game;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        ui.printGameName();
        ui.playPlayerOne();
        ui.playPlayerTwo();
        ui.result();
        ui.printEndGame();
    }
}
