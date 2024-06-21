package chess;

import bordgame.Board;
import bordgame.Position;
import chess.pices.King;
import chess.pices.Rook;

public class chessMatch {

    private Board board;

    public chessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private  void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column,row).toPosition());
    }

    private  void initialSetup(){
        placeNewPiece('b', 8,new Rook(board, Color.WHITE));
        placeNewPiece('e',8,new King(board, Color.BLACK));
        placeNewPiece('e',8,new King(board, Color.WHITE));
    }


}
