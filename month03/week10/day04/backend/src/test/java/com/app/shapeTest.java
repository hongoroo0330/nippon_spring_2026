package com.app;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class shapeTest {


        @Test
        void testCircleArea() {
            Circle c = new Circle(5);
            assertEquals(78.54, c.area(), 0.01);
        }

        @Test
        void testCirclePerimeter() {
            Circle c = new Circle(5);
            assertEquals(31.42, c.perimeter(), 0.01);
        }

        @Test
        void testSquareArea() {
            Square s = new Square(4);
            assertEquals(16.0, s.area(), 0.001);
        }

        @Test
        void testSquarePerimeter() {
            Square s = new Square(4);
            assertEquals(16.0, s.perimeter(), 0.001);
        }

        @Test
        void testRectangleArea() {
            Rectangle r = new Rectangle(3, 4);
            assertEquals(12.0, r.area(), 0.001);
        }

        @Test
        void testRectanglePerimeter() {
            Rectangle r = new Rectangle(3, 4);
            assertEquals(14.0, r.perimeter(), 0.001);
        }

        @Test
        void testIsLargerThan() {
            Circle c = new Circle(5);         // area ≈ 78.54
            Rectangle r = new Rectangle(3, 4); // area = 12.0
            assertTrue(c.isLargerThan(r));
            assertFalse(r.isLargerThan(c));
        }

        @Test
        void testDescribeFormat() {
            Circle c = new Circle(5);
            String desc = c.describe();
            assertTrue(desc.contains("Circle"));
            assertTrue(desc.contains("78.5"));
        }

        @Test
        void testZeroRadius() {
            Circle c = new Circle(0);
            assertEquals(0.0, c.area(), 0.001);
            assertEquals(0.0, c.perimeter(), 0.001);
        }
    }





