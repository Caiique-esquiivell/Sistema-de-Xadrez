package application;

import bordgame.Board;
import bordgame.Position;
import chess.chessMatch;

public class Program {
    public static void main(String[] args) {

        chessMatch chessMatch = new chessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}