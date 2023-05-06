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


public class CodexTest_0_6_38 { 
  @Test
    public void testBooleanEquals() {
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(true);
        assertTrue(b1.equals(b2));
    }
}