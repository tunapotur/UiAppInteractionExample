package game;

import java.util.Scanner;

public class UI implements IUserInteraction {
    private final GamePlay gamePlay;

    public UI() {
        this.gamePlay = new GamePlay(this);
    }

    @Override
    public void sendInfo(String info) {
        System.out.println(info);
    }

    @Override
    public String getUserCommand(String userCommand) {
        Scanner sc = new Scanner(System.in);

        if (userCommand == null)
            System.out.print("Enter command: ");
        else
            System.out.print(userCommand + ": ");

        return sc.nextLine();
    }

    public void printGameName() {
        System.out.println("********* Dice Game *********");
    }

    public void printEndGame() {
        System.out.println("********* End Game **********");
    }

    public void playPlayerOne() {
        this.gamePlay.playPlayerOne();
    }

    public void playPlayerTwo() {
        this.gamePlay.playPlayerTwo();
    }

    public void result() {
        this.gamePlay.result();
    }
}
