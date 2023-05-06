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


public class CodexTest_0_8_62 { 
    @Test
    public void testNumElements() {
      int len = 22;
      AlgVector v1 = new AlgVector(len);
      AlgVector v2 = new AlgVector(len);
      assertEquals("Number of elements differs", v1.numElements(), v2.numElements());
    }

}