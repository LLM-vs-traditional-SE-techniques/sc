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
        /**
         * Tests the equals method of this path
         */
        @Test
        public void testEquals() {
            //new instance with predefined nodes
            Path path = new Path(graph, new String[]{"a", "b", "c"});
            //new instance with same predefined nodes
            Path path2 = new Path(graph, new String[]{"a", "b", "c"});
            //new instance with different predefined nodes
            Path path3 = new Path(graph, new String[]{"a", "b", "d"});
            //new instance with different nodes length
            Path path4 = new Path(graph, new String[]{"a", "b"});
}