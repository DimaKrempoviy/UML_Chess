public class Queen implements Chessman{
    private Field field;

    @Override
    public Field[] availableMoves() {
        return new Field[2];
    }

    public Field getField(){
        return field;
    }
    Queen(Field field){
        this.field = field;
    }

    private Color color;

    public Color getColor(){
        return color;
    }

    Queen(Color color){
        this.color = color;
    }
}
