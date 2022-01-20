import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
    }
    private final List<Chessman> chessmans = new ArrayList<>();
    private Color nowMoving;


    public void startNewGame(){}
    public void move(Chessman by, Field to){}
    public Chessman promotePawn(Pawn pawn, Chessman to){
        return to;
    }

}