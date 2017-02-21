import java.awt.Color;

public class Hexagono extends Forma{
    public Hexagono (int _posX, int _posY, Color _color, boolean _relleno){
        super(_posX, _posY, new int [6], new int [6], _color, _relleno, 6);
    }
}

