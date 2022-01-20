public class Rook implements Chessman{
    private Field field;

    @Override
    public Field[] availableMoves() {
        return new Field[1];
    }

    public Field getField(){
        return field;
    }
    Rook(Field field){
        this.field = field;
    }

    private Color color;

    public Color getColor(){
        return color;
    }

    Rook(Color color){
        this.color = color;
    }
}
