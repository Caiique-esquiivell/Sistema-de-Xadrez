package chess;

import bordgame.Board;
import bordgame.Piece;
import bordgame.Position;

public abstract class ChessPiece extends Piece {
    private  Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public  ChessPiece getChessPosition(){
        return  ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

}
