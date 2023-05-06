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


public class CodexTest_0_1_3 { 
    @Test
    public void testContains() {
        Path path = new Path();
        path.add(new Edge("a", "b"));
        path.add(new Edge("b", "c"));
        path.add(new Edge("c", "d"));
        path.add(new Edge("d", "e"));
        path.add(new Edge("e", "f"));
        path.add(new Edge("f", "g"));
        path.add(new Edge("g", "h"));
        path.add(new Edge("h", "i"));
        path.add(new Edge("i", "j"));
        path.add(new Edge("j", "k"));
        path.add(new Edge("k", "l"));
        path.add(new Edge("l", "m"));
        path.add(new Edge("m", "n"));
        path.add(new Edge("n", "o"));
        path.add(new Edge("o", "p"));
        path.add(new Edge("p", "q"));
        path.add(new Edge("q", "r"));
        path.add(new Edge("r", "s"));
        path.add(new Edge("s", "t"));
        path.add(new Edge("t", "u"));
        path.add(new Edge("u", "v"));
        path.add(new Edge("v", "w"));
        path.add(new Edge("w", "x"));
        path.add(new Edge("x", "y"));
        path.add(new Edge("y", "z"));
        assertTrue(path.contains(new Edge("a", "b")));
        assertTrue(path.contains(new Edge("b", "c")));
        assertTrue(path.contains(new Edge("c", "d")));
        assertTrue(path.contains(new Edge("d", "e")));
        assertTrue(path.contains(new Edge("e", "f")));
        assertTrue(path.contains(
}