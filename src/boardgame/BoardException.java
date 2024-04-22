package boardgame;

public class BoardException extends RuntimeException {
    //private static final long serialVersionUID = 1L;

    public BoardException(String msg){
        super(msg); //repassa essa msg para o construtor da superclasse
    }
}
