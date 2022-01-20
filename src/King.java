public class King implements Chessman{
    private Field field;

    @Override
    public Field[] availableMoves() {
        return new Field[3];
    }

    public Field getField(){
        return field;
    }
    King(Field field){
        this.field = field;
    }

    private Color color;

    public Color getColor(){
        return color;
    }

    King(Color color){
        this.color = color;
    }
}
