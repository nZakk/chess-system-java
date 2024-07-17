package application;

import chess.ChessPiece;

public class UI {
    public static void printBoard(ChessPiece[][] pieces) {
        for (int currX = 0; currX < pieces.length; currX++) {
            System.out.print((8 - currX) + " ");
            for (int currY = 0; currY < pieces.length; currY++) {
                printPiece(pieces[currX][currY]);
            }
            System.out.println();
        }

        System.out.println("  a b c d e f g h");
    }
    public static void printPiece(ChessPiece piece){
        if(piece == null){
            System.out.print("-");
        }else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
