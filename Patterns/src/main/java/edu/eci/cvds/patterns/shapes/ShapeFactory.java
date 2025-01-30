package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Triangle;

public class ShapeFactory {

    public static Shape create(RegularShapeType type) {
        Shape s = null; // Inicializamos s para que siempre tenga un valor.
        switch (type) {
            case Triangle:
                s = new Triangle();
                break;
            case Quadrilateral:
                break;
            case Pentagon:
                break;
            case Hexagon:
                break;
            default:
                throw new IllegalArgumentException("Tipo de figura desconocido: " + type);
        }
        return s;
    }


}
