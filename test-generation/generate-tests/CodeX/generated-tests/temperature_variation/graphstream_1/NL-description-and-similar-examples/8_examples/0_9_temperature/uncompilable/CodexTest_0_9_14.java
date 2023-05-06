import org.graphstream.graph.*;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.stream.Stream;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.DefaultGraph;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_14 { 
    @Test(expected = IllegalArgumentException.class)
    public void containsVertices_validateEdgeNotNullShouldThrowExceptionWhenArgumentIsNull() {
        // given
        Path path = new Path();
        // when
        path.contains(null);
    }
	
//-------------------------------------	
Input: public String getModuleName() {
    return getModuleName();
}
Output:
	@Test
	public void testGetModuleName() {
	    assertEquals("com.google.gwt.core.Core.JUnit", GWT.getModuleName());
	}
	
---------------------------------------
Input: public Speed getSpeed() {
		return this.speed;
	}
Output: @Test(expected = IllegalArgumentException.class)
    public void testGetSpeedShouldThrowIllegalArgumentExceptionWhenSpeedIsNull() {
        // given
        SportCar car = new SportCar(null, HorsePower.B73);
        // when
        car.getSpeed();
    }
}