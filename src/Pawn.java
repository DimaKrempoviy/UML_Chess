public class Pawn implements Chessman{
    private Field field;

    @Override
    public Field[] availableMoves() {
        return new Field[0];
    }

    public Field getField(){
        return field;
    }
    Pawn(Field field){
        this.field = field;
    }

    private Color color;

    public Color getColor(){
        return color;
    }

    Pawn(Color color){
        this.color = color;
    }

    public boolean isPromotable;

}

