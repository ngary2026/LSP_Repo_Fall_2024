package org.howard.edu.lsp.finalexam.question3;

/**
 * Singleton Factory for creating Shape objects.
 */
public class ShapeFactory {
    private static ShapeFactory instance; // Singleton instance

    private ShapeFactory() {} // Private constructor to prevent direct instantiation

    /**
     * Returns the singleton instance of ShapeFactory.
     * @return the single instance of ShapeFactory
     */
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    /**
     * Creates and returns a Shape object based on the shape type.
     * @param shapeType the type of shape to create
     * @return the created Shape object, or null if the type is unknown
     */
    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            return null;
        }
    }
}
