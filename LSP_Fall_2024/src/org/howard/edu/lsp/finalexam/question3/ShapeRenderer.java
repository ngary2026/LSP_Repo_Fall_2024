package org.howard.edu.lsp.finalexam.question3;

/**
 * ShapeRenderer class that uses the ShapeFactory to render shapes.
 */
public class ShapeRenderer {
    public void renderShape(String shapeType) {
        // Use the factory to create the shape
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape(shapeType);

        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon
    }
}
