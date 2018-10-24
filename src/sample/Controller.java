package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Controller {


    private int move = 0;
    private int player = 0;
    private int numberOfCheckersWhite = 12;
    private int numberOfCheckersBlack = 12;


    private Clicking clicking = new Clicking();

    private URL url = getClass().getResource("MoonlightSonata.wav");
    private AudioClip clip = Applet.newAudioClip(url);

    @FXML
    Pane gridPane;

    @FXML
    ImageView black, white;

    @FXML
    ImageView b01, b03, b05, b07, b10, b12, b14, b16, b21, b23, b25, b27, b30, b32, b34, b36, b41, b43, b45, b47, b50, b52, b54, b56, b61, b63, b65,
            b67, b70, b72, b74, b76;
    @FXML
    ImageView w01, w03, w05, w07, w10, w12, w14, w16, w21, w23, w25, w27, w30, w32, w34, w36, w41, w43, w45, w47, w50, w52, w54, w56, w61, w63, w65,
            w67, w70, w72, w74, w76;
    @FXML
    Pane pane01, pane03, pane05, pane07, pane10, pane12, pane14, pane16, pane21, pane23, pane25, pane27, pane30, pane32,
            pane34, pane36, pane41, pane43, pane45, pane47, pane50, pane52, pane54, pane56, pane61, pane63, pane65, pane67, pane70, pane72, pane74, pane76;

    @FXML
    Label displayText;

    @FXML
    Button resetButton, testButton;

    @FXML
    ImageView micro, microMuted;


    private static String table[][] = {{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", "X", " ", "X", " ", "X", " ", "X", " ", " "},
            {" ", " ", "X", " ", "X", " ", "X", " ", "X", " ", " ", " "},
            {" ", " ", " ", "X", " ", "X", " ", "X", " ", "X", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", "O", " ", "O", " ", "O", " ", "O", " ", " ", " "},
            {" ", " ", " ", "O", " ", "O", " ", "O", " ", "O", " ", " "},
            {" ", " ", "O", " ", "O", " ", "O", " ", "O", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}};


    private void printBoard() {
        System.out.println("    0 1 2 3 4 5 6 7");
        System.out.println();
        //1
        System.out.println("0   " + table[2][2] + "|" + table[2][3] + "|" + table[2][4] + "|" + table[2][5] + "|" +
                table[2][6] + "|" + table[2][7] + "|" + table[2][8] + "|" + table[2][9] + "   0");
        //2
        System.out.println("1   " + table[3][2] + "|" + table[3][3] + "|" + table[3][4] + "|" + table[3][5] + "|" +
                table[3][6] +
                "|" + table[3][7] + "|" + table[3][8] + "|" + table[3][9] + "   1");
        //3
        System.out.println("2   " + table[4][2] + "|" + table[4][3] + "|" + table[4][4] + "|" + table[4][5] + "|" +
                table[4][6] +
                "|" + table[4][7] + "|" + table[4][8] + "|" + table[4][9] + "   2");
        //4
        System.out.println("3   " + table[5][2] + "|" + table[5][3] + "|" + table[5][4] + "|" + table[5][5] + "|" +
                table[5][6] +
                "|" + table[5][7] + "|" + table[5][8] + "|" + table[5][9] + "   3");
        //5
        System.out.println("4   " + table[6][2] + "|" + table[6][3] + "|" + table[6][4] + "|" + table[6][5] + "|" +
                table[6][6] +
                "|" + table[6][7] + "|" + table[6][8] + "|" + table[6][9] + "   4");
        //6
        System.out.println("5   " + table[7][2] + "|" + table[7][3] + "|" + table[7][4] + "|" + table[7][5] + "|" +
                table[7][6] +
                "|" + table[7][7] + "|" + table[7][8] + "|" + table[7][9] + "   5");
        //7
        System.out.println("6   " + table[8][2] + "|" + table[8][3] + "|" + table[8][4] + "|" + table[8][5] + "|" +
                table[8][6] +
                "|" + table[8][7] + "|" + table[8][8] + "|" + table[8][9] + "   6");
        //8
        System.out.println("7   " + table[9][2] + "|" + table[9][3] + "|" + table[9][4] + "|" + table[9][5] + "|" +
                table[9][6] +
                "|" + table[9][7] + "|" + table[9][8] + "|" + table[9][9] + "   7");
        System.out.println();
        System.out.println("    0 1 2 3 4 5 6 7");

    }

    public void onMouseClick05() {

        if (player % 2 == 0)
            choicePlayerWhite(pane05, w05, 7, 2);
        if (player % 2 != 0)
            choicePlayerBlack(pane05, b05, 7, 2);
    }

    public void onMouseClick21() {

        if (player % 2 == 0)
            choicePlayerWhite(pane21, w21, 3, 4);
        if (player % 2 != 0)
            choicePlayerBlack(pane21, b21, 3, 4);
    }

    public void onMouseClick32() {

        if (player % 2 == 0)
            choicePlayerWhite(pane32, w32, 4, 5);
        if (player % 2 != 0)
            choicePlayerBlack(pane32, b32, 4, 5);
    }

    public void onMouseClick36() {

        if (player % 2 == 0)
            choicePlayerWhite(pane36, w36, 8, 5);
        if (player % 2 != 0)
            choicePlayerBlack(pane36, b36, 8, 5);
    }

    public void onMouseClick41() {

        if (player % 2 == 0)
            choicePlayerWhite(pane41, w41, 3, 6);
        if (player % 2 != 0)
            choicePlayerBlack(pane41, b41, 3, 6);
    }

    public void onMouseClick47() {

        if (player % 2 == 0)
            choicePlayerWhite(pane47, w47, 9, 6);
        if (player % 2 != 0)
            choicePlayerBlack(pane47, b47, 9, 6);
    }

    public void onMouseClick50() {

        if (player % 2 == 0)
            choicePlayerWhite(pane50, w50, 2, 7);
        if (player % 2 != 0)
            choicePlayerBlack(pane50, b50, 2, 7);
    }

    public void onMouseClick52() {

        if (player % 2 == 0)
            choicePlayerWhite(pane52, w52, 4, 7);
        if (player % 2 != 0)
            choicePlayerBlack(pane52, b52, 4, 7);
    }

    public void onMouseClick54() {

        if (player % 2 == 0)
            choicePlayerWhite(pane54, w54, 6, 7);
        if (player % 2 != 0)
            choicePlayerBlack(pane54, b54, 6, 7);
    }

    public void onMouseClick56() {

        if (player % 2 == 0)
            choicePlayerWhite(pane56, w56, 8, 7);
        if (player % 2 != 0)
            choicePlayerBlack(pane56, b56, 8, 7);
    }

    public void onMouseClick61() {

        if (player % 2 == 0)
            choicePlayerWhite(pane61, w61, 3, 8);
        if (player % 2 != 0)
            choicePlayerBlack(pane61, b61, 3, 8);
    }

    public void onMouseClick63() {

        if (player % 2 == 0)
            choicePlayerWhite(pane63, w63, 5, 8);
        if (player % 2 != 0)
            choicePlayerBlack(pane63, b63, 5, 8);
    }

    public void onMouseClick65() {

        if (player % 2 == 0)
            choicePlayerWhite(pane65, w65, 7, 8);
        if (player % 2 != 0)
            choicePlayerBlack(pane65, b65, 7, 8);
    }

    public void onMouseClick45() {

        if (player % 2 == 0)
            choicePlayerWhite(pane45, w45, 7, 6);
        if (player % 2 != 0)
            choicePlayerBlack(pane45, b45, 7, 6);
    }

    public void onMouseClick67() {

        if (player % 2 == 0)
            choicePlayerWhite(pane67, w67, 9, 8);
        if (player % 2 != 0)
            choicePlayerBlack(pane67, b67, 9, 8);
    }

    public void onMouseClick70() {

        if (player % 2 == 0)
            choicePlayerWhite(pane70, w70, 2, 9);
        if (player % 2 != 0)
            choicePlayerBlack(pane70, b70, 2, 9);
    }

    public void onMouseClick72() {

        if (player % 2 == 0)
            choicePlayerWhite(pane72, w72, 4, 9);
        if (player % 2 != 0)
            choicePlayerBlack(pane72, b72, 4, 9);
    }

    public void onMouseClick74() {

        if (player % 2 == 0)
            choicePlayerWhite(pane74, w74, 6, 9);
        if (player % 2 != 0)
            choicePlayerBlack(pane74, b74, 6, 9);
    }

    public void onMouseClick76() {

        if (player % 2 == 0)
            choicePlayerWhite(pane76, w76, 8, 9);
        if (player % 2 != 0)
            choicePlayerBlack(pane76, b76, 8, 9);
    }

    public void onMouseClick01() {

        if (player % 2 == 0)
            choicePlayerWhite(pane01, w01, 3, 2);
        if (player % 2 != 0)
            choicePlayerBlack(pane01, b01, 3, 2);
    }

    public void onMouseClick43() {

        if (player % 2 == 0)
            choicePlayerWhite(pane43, w43, 5, 6);
        if (player % 2 != 0)
            choicePlayerBlack(pane43, b43, 5, 6);
    }

    public void onMouseClick10() {

        if (player % 2 == 0)
            choicePlayerWhite(pane10, w10, 2, 3);
        if (player % 2 != 0)
            choicePlayerBlack(pane10, b10, 2, 3);
    }

    public void onMouseClick25() {

        if (player % 2 == 0)
            choicePlayerWhite(pane25, w25, 7, 4);
        if (player % 2 != 0)
            choicePlayerBlack(pane25, b25, 7, 4);
    }

    public void onMouseClick23() {

        if (player % 2 == 0)
            choicePlayerWhite(pane23, w23, 5, 4);
        if (player % 2 != 0)
            choicePlayerBlack(pane23, b23, 5, 4);

    }

    public void onMouseClick12() {

        if (player % 2 == 0)
            choicePlayerWhite(pane12, w12, 4, 3);
        if (player % 2 != 0)
            choicePlayerBlack(pane12, b12, 4, 3);

    }

    public void onMouseClick34() {

        if (player % 2 == 0)
            choicePlayerWhite(pane34, w34, 6, 5);
        if (player % 2 != 0)
            choicePlayerBlack(pane34, b34, 6, 5);

    }

    public void onMouseClick03() {

        if (player % 2 == 0)
            choicePlayerWhite(pane03, w03, 5, 2);
        if (player % 2 != 0)
            choicePlayerBlack(pane03, b03, 5, 2);


    }

    public void onMouseClick14() {

        if (player % 2 == 0)
            choicePlayerWhite(pane14, w14, 6, 3);
        if (player % 2 != 0)
            choicePlayerBlack(pane14, b14, 6, 3);


    }

    public void onMouseClick16() {

        if (player % 2 == 0)
            choicePlayerWhite(pane16, w16, 8, 3);
        if (player % 2 != 0)
            choicePlayerBlack(pane16, b16, 8, 3);

    }

    public void onMouseClick27() {

        if (player % 2 == 0)
            choicePlayerWhite(pane27, w27, 9, 4);
        if (player % 2 != 0)
            choicePlayerBlack(pane27, b27, 9, 4);

    }

    public void onMouseClick07() {

        if (player % 2 == 0)
            choicePlayerWhite(pane07, w07, 9, 2);
        if (player % 2 != 0)
            choicePlayerBlack(pane07, b07, 9, 2);

    }

    public void onMouseClick30() {

        if (player % 2 == 0)
            choicePlayerWhite(pane30, w30, 2, 5);
        if (player % 2 != 0)
            choicePlayerBlack(pane30, b30, 2, 5);

    }

    private void choicePlayerWhite(Pane pane, ImageView imageView, int indexRow, int indexColumn) {

        if (move % 2 == 0 && table[indexRow][indexColumn].equals("O")) {

            clicking.setImageView(imageView);
            clicking.setPane(pane);
            clicking.setIndexRow(indexRow);
            clicking.setIndexColumn(indexColumn);
            move++;
            pane.setBorder(new Border(new BorderStroke(Color.RED,
                    BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            displayText.setText(" ");
            printBoard();

        } else if (move % 2 != 0) {
            ////moveWhiteL
            if ((indexColumn - 1 == clicking.getIndexColumn() && indexRow == clicking.getIndexRow() - 1 &&
                    table[indexRow][indexColumn].equals(" "))) {

                Pane chosenPane = clicking.getPane();
                ImageView chosenImage = clicking.getImageView();
                chosenPane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                move++;
                chosenImage.setVisible(false);
                imageView.setVisible(true);
                table[clicking.getIndexRow()][clicking.getIndexColumn()] = " ";
                table[indexRow][indexColumn] = "O";
                printBoard();
                player++;
                blackTurn();

            }
            //moveWhiteR
            else if (indexColumn + 1 == clicking.getIndexColumn() && indexRow == clicking.getIndexRow() - 1 &&
                    table[indexRow][indexColumn].equals(" ")) {
                Pane chosenPane = clicking.getPane();
                ImageView chosenImage = clicking.getImageView();
                chosenPane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                move++;
                chosenImage.setVisible(false);
                imageView.setVisible(true);
                table[clicking.getIndexRow()][clicking.getIndexColumn()] = " ";
                table[indexRow][indexColumn] = "O";
                printBoard();
                player++;
                blackTurn();

            }
            //attackWhiteL
            else if ((clicking.getIndexColumn() == indexColumn + 2) && clicking.getIndexRow() == indexRow + 2 &&
                    (table[clicking.getIndexRow() - 1][clicking.getIndexColumn() - 1].equals("X")) && !(table[indexRow][indexColumn].equals("O"))
                    && !(table[indexRow][indexColumn].equals("X"))) {

                Pane chosenPane = clicking.getPane();
                ImageView chosenImage = clicking.getImageView();
                chosenPane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                move++;
                chosenImage.setVisible(false);
                imageView.setVisible(true);
                table[clicking.getIndexRow()][clicking.getIndexColumn()] = " ";
                table[indexRow][indexColumn] = "O";
                table[clicking.getIndexRow() - 1][clicking.getIndexColumn() - 1] = " ";
                removeCheckerBlackLeft();
                printBoard();
                player++;
                blackTurn();
            }
            //attackWhiteR
            else if ((clicking.getIndexColumn() == indexColumn - 2) && clicking.getIndexRow() == indexRow + 2 &&
                    (table[clicking.getIndexRow() - 1][clicking.getIndexColumn() + 1].equals("X")) && !(table[indexRow][indexColumn].equals("O"))
                    && !(table[indexRow][indexColumn].equals("X"))) {
                Pane chosenPane = clicking.getPane();
                ImageView chosenImage = clicking.getImageView();
                chosenPane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                move++;
                chosenImage.setVisible(false);
                imageView.setVisible(true);
                table[clicking.getIndexRow()][clicking.getIndexColumn()] = " ";
                table[indexRow][indexColumn] = "O";
                table[clicking.getIndexRow() - 1][clicking.getIndexColumn() + 1] = " ";

                removeCheckerBlackRight();
                printBoard();
                player++;
                blackTurn();

            }
            //attackWhiteLBackward
            else if ((indexColumn == clicking.getIndexColumn() - 2) && indexRow == clicking.getIndexRow() + 2 &&
                    (table[clicking.getIndexRow() + 1][clicking.getIndexColumn() - 1].equals("X")) && !(table[indexRow][indexColumn].equals("O"))
                    && !(table[indexRow][indexColumn].equals("X"))) {
                Pane chosenPane = clicking.getPane();
                ImageView chosenImage = clicking.getImageView();
                chosenPane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                move++;
                chosenImage.setVisible(false);
                imageView.setVisible(true);
                table[clicking.getIndexRow()][clicking.getIndexColumn()] = " ";
                table[indexRow][indexColumn] = "O";
                table[clicking.getIndexRow() + 1][clicking.getIndexColumn() - 1] = " ";
                removeCheckerBlackLeftBackward();
                printBoard();
                player++;
                blackTurn();


            }
            //attackWhiteRBackward
            else if ((indexColumn == clicking.getIndexColumn() + 2) && indexRow == clicking.getIndexRow() + 2 &&
                    (table[clicking.getIndexRow() + 1][clicking.getIndexColumn() + 1].equals("X")) && !(table[indexRow][indexColumn].equals("X"))
                    && !(table[indexRow][indexColumn].equals("O"))) {
                Pane chosenPane = clicking.getPane();
                ImageView chosenImage = clicking.getImageView();
                chosenPane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                move++;
                chosenImage.setVisible(false);
                imageView.setVisible(true);
                table[clicking.getIndexRow()][clicking.getIndexColumn()] = " ";
                table[indexRow][indexColumn] = "O";
                table[clicking.getIndexRow() + 1][clicking.getIndexColumn() + 1] = " ";
                removeCheckerBlackRightBackward();
                printBoard();
                player++;
                blackTurn();


            } else {
                clicking.setImageView(imageView);
                clicking.setPane(pane);
                clicking.setIndexRow(indexRow);
                clicking.setIndexColumn(indexColumn);
                move++;
                pane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                displayText.setText(" ");
                printBoard();

            }
        }
    }

    private void choicePlayerBlack(Pane pane, ImageView imageView, int indexRow, int indexColumn) {

        if (move % 2 == 0 && table[indexRow][indexColumn].equals("X")) {

            clicking.setImageView(imageView);
            clicking.setPane(pane);
            clicking.setIndexRow(indexRow);
            clicking.setIndexColumn(indexColumn);
            move++;

            pane.setBorder(new Border(new BorderStroke(Color.RED,
                    BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            displayText.setText(" ");
            printBoard();

        } else if (move % 2 != 0) {
            //moveBlackL
            if ((indexColumn - 1 == clicking.getIndexColumn() && indexRow == clicking.getIndexRow() + 1 &&
                    table[indexRow][indexColumn].equals(" "))) {
                Pane chosenPane = clicking.getPane();
                ImageView chosenImage = clicking.getImageView();
                chosenPane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                move++;
                chosenImage.setVisible(false);
                imageView.setVisible(true);
                table[clicking.getIndexRow()][clicking.getIndexColumn()] = " ";
                table[indexRow][indexColumn] = "X";
                printBoard();
                player++;
                whiteTurn();

            }
            //moveBlackR
            else if (indexColumn + 1 == clicking.getIndexColumn() && indexRow == clicking.getIndexRow() + 1 &&
                    table[indexRow][indexColumn].equals(" ")) {
                Pane chosenPane = clicking.getPane();
                ImageView chosenImage = clicking.getImageView();
                chosenPane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                move++;
                chosenImage.setVisible(false);
                imageView.setVisible(true);
                table[clicking.getIndexRow()][clicking.getIndexColumn()] = " ";
                table[indexRow][indexColumn] = "X";
                printBoard();
                player++;
                whiteTurn();

            }
            //attackBlackL
            else if ((indexColumn == clicking.getIndexColumn() - 2) && indexRow == clicking.getIndexRow() + 2 &&
                    (table[clicking.getIndexRow() + 1][clicking.getIndexColumn() - 1].equals("O")) && !(table[indexRow][indexColumn].equals("O"))
                    && !(table[indexRow][indexColumn].equals("X"))) {
                Pane chosenPane = clicking.getPane();
                ImageView chosenImage = clicking.getImageView();
                chosenPane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                move++;
                chosenImage.setVisible(false);
                imageView.setVisible(true);
                table[clicking.getIndexRow()][clicking.getIndexColumn()] = " ";
                table[indexRow][indexColumn] = "X";
                table[clicking.getIndexRow() + 1][clicking.getIndexColumn() - 1] = " ";
                removeCheckerWhiteLeft();
                printBoard();
                player++;
                whiteTurn();

            }
            //attackBlackR
            else if ((indexColumn == clicking.getIndexColumn() + 2) && indexRow == clicking.getIndexRow() + 2 &&
                    (table[clicking.getIndexRow() + 1][clicking.getIndexColumn() + 1].equals("O")) && !(table[indexRow][indexColumn].equals("X"))
                    && !(table[indexRow][indexColumn].equals("O"))) {
                Pane chosenPane = clicking.getPane();
                ImageView chosenImage = clicking.getImageView();
                chosenPane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                move++;
                chosenImage.setVisible(false);
                imageView.setVisible(true);
                table[clicking.getIndexRow()][clicking.getIndexColumn()] = " ";
                table[indexRow][indexColumn] = "X";
                table[clicking.getIndexRow() + 1][clicking.getIndexColumn() + 1] = " ";
                removeCheckerWhiteRight();
                printBoard();
                player++;
                whiteTurn();
            }
            //blackAttackLeftBackward
            else if ((clicking.getIndexColumn() == indexColumn + 2) && clicking.getIndexRow() == indexRow + 2 &&
                    (table[clicking.getIndexRow() - 1][clicking.getIndexColumn() - 1].equals("O")) && !(table[indexRow][indexColumn].equals("O"))
                    && !(table[indexRow][indexColumn].equals("X"))) {
                Pane chosenPane = clicking.getPane();
                ImageView chosenImage = clicking.getImageView();
                chosenPane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                move++;
                chosenImage.setVisible(false);
                imageView.setVisible(true);
                table[clicking.getIndexRow()][clicking.getIndexColumn()] = " ";
                table[indexRow][indexColumn] = "X";
                table[clicking.getIndexRow() - 1][clicking.getIndexColumn() - 1] = " ";
                removeCheckerWhiteLeftBackward();
                printBoard();
                player++;
                whiteTurn();

            }
            //blackAttackRightBackward
            else if ((clicking.getIndexColumn() == indexColumn - 2) && clicking.getIndexRow() == indexRow + 2 &&
                    (table[clicking.getIndexRow() - 1][clicking.getIndexColumn() + 1].equals("O")) && !(table[indexRow][indexColumn].equals("O"))
                    && !(table[indexRow][indexColumn].equals("X"))) {
                Pane chosenPane = clicking.getPane();
                ImageView chosenImage = clicking.getImageView();
                chosenPane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                move++;
                chosenImage.setVisible(false);
                imageView.setVisible(true);
                table[clicking.getIndexRow()][clicking.getIndexColumn()] = " ";
                table[indexRow][indexColumn] = "X";
                table[clicking.getIndexRow() - 1][clicking.getIndexColumn() + 1] = " ";
                System.out.println("blackAttackRightBackward");
                removeCheckerWhiteRightBackward();
                printBoard();
                player++;
                whiteTurn();
            } else {
                clicking.setImageView(imageView);
                clicking.setPane(pane);
                clicking.setIndexRow(indexRow);
                clicking.setIndexColumn(indexColumn);
                move++;
                pane.setBorder(new Border(new BorderStroke(Color.WHITE,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                displayText.setText(" ");
                printBoard();
            }
        }
    }

    public void onClickButton() {
        gridPane.setDisable(false);
        makeABoardBlack();
        makeABoardWhite();
        testButton.setDisable(true);


    }

    public void onClickPassTurn() {

        if (player % 2 == 0) {
            white.setVisible(false);
            black.setVisible(true);
        }
        if (player % 2 != 0) {
            white.setVisible(true);
            black.setVisible(false);
        }
        player++;
    }

    private void makeABoardBlack() {
        ImageView tableBlack[][] = {{null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, b10, null, b30, null, b50, null, b70, null, null},
                {null, null, b01, null, b21, null, b41, null, b61, null, null, null},
                {null, null, null, b12, null, b32, null, b52, null, b72, null, null},
                {null, null, b03, null, b23, null, b43, null, b63, null, null, null},
                {null, null, null, b14, null, b34, null, b54, null, b74, null, null},
                {null, null, b05, null, b25, null, b45, null, b65, null, null, null},
                {null, null, null, b16, null, b36, null, b56, null, b76, null, null},
                {null, null, b07, null, b27, null, b47, null, b67, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}};
        clicking.setTableBlack(tableBlack);
    }

    private void makeABoardWhite() {
        ImageView tableWhite[][] = {{null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, w10, null, w30, null, w50, null, w70, null, null},
                {null, null, w01, null, w21, null, w41, null, w61, null, null, null},
                {null, null, null, w12, null, w32, null, w52, null, w72, null, null},
                {null, null, w03, null, w23, null, w43, null, w63, null, null, null},
                {null, null, null, w14, null, w34, null, w54, null, w74, null, null},
                {null, null, w05, null, w25, null, w45, null, w65, null, null, null},
                {null, null, null, w16, null, w36, null, w56, null, w76, null, null},
                {null, null, w07, null, w27, null, w47, null, w67, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}};
        clicking.setTableWhite(tableWhite);
    }

    private void removeCheckerBlackRight() {

        ImageView removeBlack = clicking.getTableBlack()[clicking.getIndexRow() - 1][clicking.getIndexColumn() + 1];
        removeBlack.setVisible(false);
        numberOfCheckersBlack = numberOfCheckersBlack - 1;
        checkWinner();
    }

    private void removeCheckerBlackLeft() {
        ImageView removeBlack = clicking.getTableBlack()[clicking.getIndexRow() - 1][clicking.getIndexColumn() - 1];
        removeBlack.setVisible(false);
        numberOfCheckersBlack = numberOfCheckersBlack - 1;
        checkWinner();
    }

    private void removeCheckerBlackRightBackward() {

        ImageView removeBlack = clicking.getTableBlack()[clicking.getIndexRow() + 1][clicking.getIndexColumn() + 1];
        removeBlack.setVisible(false);
        numberOfCheckersBlack = numberOfCheckersBlack - 1;
        checkWinner();
    }

    private void removeCheckerBlackLeftBackward() {
        ImageView removeBlack = clicking.getTableBlack()[clicking.getIndexRow() + 1][clicking.getIndexColumn() - 1];
        removeBlack.setVisible(false);
        numberOfCheckersBlack = numberOfCheckersBlack - 1;
        checkWinner();
    }

    private void removeCheckerWhiteRight() {

        ImageView removeBlack = clicking.getTableWhite()[clicking.getIndexRow() + 1][clicking.getIndexColumn() + 1];
        removeBlack.setVisible(false);
        numberOfCheckersWhite = numberOfCheckersWhite - 1;
        checkWinner();
    }

    private void removeCheckerWhiteLeft() {

        ImageView removeBlack = clicking.getTableWhite()[clicking.getIndexRow() + 1][clicking.getIndexColumn() - 1];
        removeBlack.setVisible(false);
        numberOfCheckersWhite = numberOfCheckersWhite - 1;
        checkWinner();
    }

    private void removeCheckerWhiteRightBackward() {

        ImageView removeBlack = clicking.getTableWhite()[clicking.getIndexRow() - 1][clicking.getIndexColumn() + 1];
        removeBlack.setVisible(false);
        numberOfCheckersWhite = numberOfCheckersWhite - 1;
        checkWinner();
    }

    private void removeCheckerWhiteLeftBackward() {

        ImageView removeBlack = clicking.getTableWhite()[clicking.getIndexRow() - 1][clicking.getIndexColumn() - 1];
        removeBlack.setVisible(false);
        numberOfCheckersWhite = numberOfCheckersWhite - 1;
        checkWinner();
    }

    private void checkWinner() {
        if (numberOfCheckersWhite == 0) {
            System.out.println("Black player won");
            displayText.setText("Black won");
            gridPane.setVisible(false);
        }
        if (numberOfCheckersBlack == 0) {
            System.out.println("White player won");
            displayText.setText("White won");
            gridPane.setVisible(false);
        }
    }

    private void blackTurn() {
        white.setVisible(false);
        black.setVisible(true);
    }

    private void whiteTurn() {
        white.setVisible(true);
        black.setVisible(false);
    }

    private void reset() {
        gridPane.setVisible(true);
        numberOfCheckersWhite = 12;
        numberOfCheckersBlack = 12;
        Clicking reset = new Clicking();
        table = reset.getTableBoard();
        printBoard();

        b10.setVisible(true);
        b30.setVisible(true);
        b50.setVisible(true);
        b70.setVisible(true);
        b01.setVisible(true);
        b21.setVisible(true);
        b41.setVisible(true);
        b61.setVisible(true);
        b12.setVisible(true);
        b32.setVisible(true);
        b52.setVisible(true);
        b72.setVisible(true);

        w05.setVisible(true);
        w25.setVisible(true);
        w45.setVisible(true);
        w65.setVisible(true);
        w16.setVisible(true);
        w36.setVisible(true);
        w56.setVisible(true);
        w76.setVisible(true);
        w07.setVisible(true);
        w27.setVisible(true);
        w47.setVisible(true);
        w67.setVisible(true);

        b03.setVisible(false);
        b23.setVisible(false);
        b43.setVisible(false);
        b63.setVisible(false);
        b14.setVisible(false);
        b34.setVisible(false);
        b54.setVisible(false);
        b74.setVisible(false);
        b05.setVisible(false);
        b25.setVisible(false);
        b45.setVisible(false);
        b65.setVisible(false);
        b16.setVisible(false);
        b36.setVisible(false);
        b56.setVisible(false);
        b76.setVisible(false);
        b07.setVisible(false);
        b27.setVisible(false);
        b47.setVisible(false);
        b67.setVisible(false);

        w10.setVisible(false);
        w30.setVisible(false);
        w50.setVisible(false);
        w70.setVisible(false);
        w01.setVisible(false);
        w21.setVisible(false);
        w41.setVisible(false);
        w61.setVisible(false);
        w12.setVisible(false);
        w32.setVisible(false);
        w52.setVisible(false);
        w72.setVisible(false);
        w03.setVisible(false);
        w23.setVisible(false);
        w43.setVisible(false);
        w63.setVisible(false);
        w14.setVisible(false);
        w34.setVisible(false);
        w54.setVisible(false);
        w74.setVisible(false);

        move = 0;
        player = 0;
        white.setVisible(true);
        black.setVisible(false);


    }

    public void onClickResetButton() {

        reset();
    }

    public void onMouseClickMicro() {
        music(true);
        micro.setVisible(false);
        microMuted.setVisible(true);

    }

    public void onMouseClickMicroMuted() {
        music(false);
        micro.setVisible(true);
        microMuted.setVisible(false);
    }

    private void music(boolean music) {

        try {

            if (music)
                clip.play();
            else
                clip.stop();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}



