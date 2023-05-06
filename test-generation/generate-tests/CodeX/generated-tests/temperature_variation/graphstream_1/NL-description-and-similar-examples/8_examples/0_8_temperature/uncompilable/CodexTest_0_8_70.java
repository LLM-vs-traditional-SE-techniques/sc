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


public class CodexTest_0_8_70 { 
        @Test
        public void testContainsEdge() {
            for (int i = 0; i < mNumActions; i++) {
                assertTrue(mPath.contains(mEdge[i]));
                assertFalse(mPath2.contains(mEdge[i]));
            }
        }
}