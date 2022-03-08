package day_2.ticTacToe;

public class Player {
    private String name;
    private char cell;

    public char getCell() {
        return cell;
    }

    public void setCell(char cell) {
        this.cell = cell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }
}
