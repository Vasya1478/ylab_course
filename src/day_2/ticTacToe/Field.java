package day_2.ticTacToe;


public class Field {
    private char[][] field = new char[3][3];

    public char[][] getField() {
        return field;
    }

    public void setField(char[][] field) {
        this.field = field;
    }

    public void initializeField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = '-';
            }
        }
    }

    public void showField(char[][] field) {
        System.out.println("Поле");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != 1) {
                    System.out.print("|" + field[i][j] + "|");
                } else System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    public void move(Player player, int h, int w) {

        if (h > 2 || w > 2) {
            System.out.println("Вводите числа от 0 до 2");
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == h && j == w) {
                        if (field[i][j] == '-') {
                            field[i][j] = player.getCell();
                        } else {
                            System.out.println("Уже занято");
                        }

                    }
                }
            }
        }


    }

    boolean checkWinner(char sign) {
        for (int i = 0; i < 3; i++)
            if ((field[i][0] == sign && field[i][1] == sign &&
                    field[i][2] == sign) ||
                    (field[0][i] == sign && field[1][i] == sign &&
                            field[2][i] == sign))
                return true;
        if ((field[0][0] == sign && field[1][1] == sign &&
                field[2][2] == sign) ||
                (field[2][0] == sign && field[1][1] == sign &&
                        field[0][2] == sign))
            return true;
        return false;
    }

    boolean isTableFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (field[i][j] == '-')
                    return false;
        return true;
    }
}
