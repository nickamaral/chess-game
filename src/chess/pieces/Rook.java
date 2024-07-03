package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R"; //Letra que vai aparecer no tabuleiro
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        //verificar acima
        p.setValues(position.getRow() -1, position.getColumn()); //a posição da linha - 1 para analisar a linha de cima
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){ //enquanto a posicao p existir e nao tiver uma peça la
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //esquerda
        p.setValues(position.getRow(), position.getColumn() -1); //a posição da linha - 1 para analisar a linha de cima
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){ //enquanto a posicao p existir e nao tiver uma peça la
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //direita
        p.setValues(position.getRow(), position.getColumn() +1); //a posição da linha - 1 para analisar a linha de cima
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){ //enquanto a posicao p existir e nao tiver uma peça la
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //pra baixo
        p.setValues(position.getRow() +1, position.getColumn()); //a posição da linha - 1 para analisar a linha de cima
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){ //enquanto a posicao p existir e nao tiver uma peça la
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}
