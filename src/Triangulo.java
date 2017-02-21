import java.awt.Color;

public class Triangulo extends Forma{
    public Triangulo (int _posX, int _posY, Color _color, boolean _relleno){
        super(_posX, _posY, new int [3], new int [3], _color, _relleno, 3);
    }
}

