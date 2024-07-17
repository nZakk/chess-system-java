package chess;

import boardgame.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for(int currX = 0; currX < board.getRows(); currX++){
            for(int currY = 0; currY < board.getColumns(); currY++){
                mat[currX][currY] = (ChessPiece) board.piece(currX, currY);
            }
        }

        return mat;
    }
}
