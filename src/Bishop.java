public class Bishop implements Chessman {
    private Field field;

    @Override
    public Field[] availableMoves() {
        return new Field[5];
    }

    public Field getField(){
        return field;
    }
    Bishop(Field field){
        this.field = field;
    }

    private Color color;

    public Color getColor(){
        return color;
    }

    Bishop(Color color){
        this.color = color;
    }
}
