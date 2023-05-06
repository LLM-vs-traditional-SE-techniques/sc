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


public class CodexTest_0_7_4 { 
    @Test
    public void containsTest1() {
        //Arrange
        boolean expected = true;
        Edge edge = new Edge(new DenseDoubleMatrix1D(new double[]{1, 2, 3}), 4);
        EdgePath edgePath = new EdgePath(edge);
        //Act
        boolean actual = edgePath.contains(edge);
        //Assert
        assertEquals(expected, actual);
    }
}