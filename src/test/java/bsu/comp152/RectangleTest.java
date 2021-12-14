package bsu.comp152;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    //tests if the inner rectangle hits the outer rectangle
    @Test
    public void testRectangleInside(){
        Rectangle outerRectangle = new Rectangle(2,4,7,1);
        Rectangle innerRectangle = new Rectangle(3,2,6,3);
        assertTrue(innerRectangle.doesHit(outerRectangle));
    }

    //tests if the rectangles will intersect eachother
    @Test
    public void testRectangleIdentical(){
        Rectangle outerRectangle = new Rectangle(1,3,7,9);
        Rectangle innerRectangle = new Rectangle(1,3,7,9);
        assertTrue(outerRectangle.doesHit(innerRectangle));
    }

    //tests if the rectangles over lap on a given side
    @Test
    public void testRectangleOverLapUpperLeftRectangle(){
        Rectangle outerRectangle = new Rectangle(1,5,7,9);
        Rectangle innerRectangle = new Rectangle(2,3,9,10);
        assertTrue(outerRectangle.doesHit(innerRectangle));
    }
}