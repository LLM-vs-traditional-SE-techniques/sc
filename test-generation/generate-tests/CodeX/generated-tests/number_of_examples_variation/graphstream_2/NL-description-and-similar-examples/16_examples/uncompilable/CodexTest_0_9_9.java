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


public class CodexTest_0_9_9 { 
  @Test
     public void testEquals() {
        DoubleMatrix2D matrix = factory.make(2, 2);
        Object d1 = new DenseDoubleMatrix1D(matrix.viewRow(0));
        Object d2 = matrix.viewRow(1);
        assertTrue(d1 != d2);
        assertTrue(d1.equals(d2));
    }
}