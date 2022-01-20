public class Knight implements Chessman{
    private Field field;

    @Override
    public Field[] availableMoves() {
        return new Field[4];
    }

    public Field getField(){
        return field;
    }
    Knight(Field field){
        this.field = field;
    }

    private Color color;

    public Color getColor(){

        return color;
    }

    Knight(Color color){

        this.color = color;
    }
}


