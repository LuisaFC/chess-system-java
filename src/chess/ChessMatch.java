package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    // Define o tamanho do tabuleiro
    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup();
    }

    // retorna matriz de peças da partida de xadrez
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        //percorrer a matriz de peças do tabuleiro e para cada peça será feito um downcasting para ChessPiece
        for(int i=0; i< board.getRows(); i++){
            for(int j=0; j< board.getColumns(); j++){
                //downcasting pois board retorna Piece(superclasse das peças do jogo) e as peças do jogo de xadrez são do tipo ChessPiece(subclasse)
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void initialSetup(){

        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
    }
}
