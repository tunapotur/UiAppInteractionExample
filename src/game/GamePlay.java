package game;

public class GamePlay {
    private final IUserInteraction ui;
    private final Dice dice;

    private String namePlayerOne;
    private String namePlayerTwo;
    private int valuePlayerOne;
    private int valuePlayerTwo;

    public GamePlay(IUserInteraction ui) {
        this.ui = ui;
        this.dice = new Dice();
    }

    private int playDice(String playerName) {
        int dice1 = this.dice.getNumber();
        int dice2 = this.dice.getNumber();

        this.ui.sendInfo("* " + playerName + " Play Dices: " + dice1 + "+" + dice2 + " = " + (dice1 + dice2));

        return dice1 + dice2;
    }

    public void result() {
        if (this.valuePlayerOne > this.valuePlayerTwo)
            this.ui.sendInfo("* Player One (" + this.namePlayerOne + ") Wins");
        else if (this.valuePlayerTwo > this.valuePlayerOne)
            this.ui.sendInfo("* Player Two (" + this.namePlayerTwo + ") Wins");
        else
            this.ui.sendInfo("* Equality");
    }

    public void playPlayerOne() {
        this.namePlayerOne = this.ui.getUserCommand("Player One Name");
        this.valuePlayerOne = this.playDice(this.namePlayerOne);
    }

    public void playPlayerTwo() {
        this.namePlayerTwo = this.ui.getUserCommand("Player Two Name");
        this.valuePlayerTwo = this.playDice(this.namePlayerTwo);
    }
}
