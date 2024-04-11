package boardgame;

public class Piece {
    protected Position position; //nao seja visivel na camada de xadrez
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; //enfatizando mas ele ja deixa nulo
    }

    protected Board getBoard() { //somente classes no mesmo pacote e subclasses vao acessar o tabuleiro de uma peça
        return board;
    }


}
