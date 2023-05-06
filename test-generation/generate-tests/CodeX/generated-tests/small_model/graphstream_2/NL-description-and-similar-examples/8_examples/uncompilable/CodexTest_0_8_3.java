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


public class CodexTest_0_8_3 { 
    @Test
    public void testPathEquals() {
        Path path = new Path();
        assertTrue(path.equals(path));
        assertFalse(path.equals(null));
        assertFalse(path.equals(new Path()));
        assertFalse(path.equals(new Path(1)));
        assertTrue(path.equals(new Path(Collections.emptyList())));
    }
}