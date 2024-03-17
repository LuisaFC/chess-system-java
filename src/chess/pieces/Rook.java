package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        //repassando os dados para o construtor da superclasse
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
