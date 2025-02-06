package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shapes.concrete.Triangle;


public class ShapeFactory {

    public static Shape create(RegularShapeType type) {
        Shape s = null; // Inicializamos s para que siempre tenga un valor.
        switch (type) {
            case Triangle:
                s = new Triangle();
                break;
            case Quadrilateral:
                s = new Quadrilateral();
                break;
            case Pentagon:
                s = new Pentagon();
                break;
            case Hexagon:
                s = new Hexagon();
                break;
            default:
                throw new IllegalArgumentException("Este es un mensaje de error.");
        }
        return s;
    }


}
