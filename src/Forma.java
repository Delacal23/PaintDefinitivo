
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Forma extends Polygon {
    Color color = null;
    boolean relleno = false;
    int x = 0;
    int y = 0;
    int numLados;
    
    public Forma (int _posX, int _posY, int [] _puntosX, int [] _puntosY, Color _color, boolean _relleno, int _numeroLados){
        super(_puntosX, _puntosY, _numeroLados);
        numLados = _numeroLados;
        this.x = _posX;
        this.y = _posY;
        calculaVertices(1, 0);
        color = _color;
        relleno = _relleno;
    }
    
    public void dibujate(Graphics2D g2,int posX, int posY){
        int radio = this.y - posY;
        int giro = this.x - posX;
        calculaVertices(radio, giro);
        g2.setColor(color);
        if (relleno){
            g2.fill(this);
        }
        else {
            g2.draw(this);
        }
        
    }
    
    public void calculaVertices(int _radio, double _giro) {
        for (int i = 0; i < numLados; i++) {
            this.xpoints[i] = (int) (this.x + _radio * Math.cos((2 * Math.PI * i + _giro) / npoints));
            this.ypoints[i] = (int) (this.y + _radio * Math.sin((2 * Math.PI * i + _giro)/ npoints));
        }

    }
}
