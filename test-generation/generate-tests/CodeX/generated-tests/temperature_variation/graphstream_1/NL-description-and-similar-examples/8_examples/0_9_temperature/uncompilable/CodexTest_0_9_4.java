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


public class CodexTest_0_9_4 { 
        @Test
        public void contains(){
            Assert.assertFalse("Should not contain an edge that is not in the path", path.contains(edge));
            path.add(null, edge);
            Assert.assertTrue("Should contain an edge that is added to the path", path.contains(edge));
}