package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeRendererTest {

    @Test
    void testRenderCircle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("circle");
        assertNotNull(shape);
        assertTrue(shape instanceof Circle);
    }

    @Test
    void testRenderRectangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("rectangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Rectangle);
    }

    @Test
    void testRenderTriangle() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("triangle");
        assertNotNull(shape);
        assertTrue(shape instanceof Triangle);
    }

    @Test
    void testRenderUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.createShape("hexagon");
        assertNull(shape);
    }
}
