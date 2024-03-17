package chess;

import boardgame.Board;

public class ChessMatch {
    private Board board;

    // Define o tamanho do tabuleiro
    public ChessMatch(){
        board = new Board(8, 8);
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
}
