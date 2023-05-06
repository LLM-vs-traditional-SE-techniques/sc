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


public class CodexTest_0_8_6 { 
    @Test
    public void equalityTest() {
        Path thePath1 = new Path();
        Path thePath2 = new Path();
        thePath1.addNode(4);
        thePath1.addNode(3);
        thePath1.addNode(7);
        thePath2.addNode(4);
        thePath2.addNode(3);
        thePath2.addNode(7);
        assertTrue(thePath1.equals(thePath2));
    }
}