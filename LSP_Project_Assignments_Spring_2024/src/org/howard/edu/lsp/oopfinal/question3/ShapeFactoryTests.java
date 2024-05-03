package org.howard.edu.lsp.oopfinal.question3;

//public class ShapeFactoryTests {
//
//}

import static org.junit.Assert.*;
import org.junit.Test;

public class ShapeFactoryTests {

    @Test
    public void testCircleCreation() {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testRectangleCreation() {
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }

    @Test
    public void testNullCreation() {
        Shape nullShape = ShapeFactory.getShape(null);
        assertNull(nullShape);
    }
}


//