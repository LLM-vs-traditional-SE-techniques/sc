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


public class CodexTest_0_2_9 { 
    @Test
    public void testContains() {
        Path path = new Path();
        path.add(new Edge(new Node("a"), new Node("b")));
        path.add(new Edge(new Node("b"), new Node("c")));
        path.add(new Edge(new Node("c"), new Node("d")));
        path.add(new Edge(new Node("d"), new Node("e")));
        path.add(new Edge(new Node("e"), new Node("f")));
        path.add(new Edge(new Node("f"), new Node("g")));
        path.add(new Edge(new Node("g"), new Node("h")));
        path.add(new Edge(new Node("h"), new Node("i")));
        path.add(new Edge(new Node("i"), new Node("j")));
        path.add(new Edge(new Node("j"), new Node("k")));
        path.add(new Edge(new Node("k"), new Node("l")));
        path.add(new Edge(new Node("l"), new Node("m")));
        path.add(new Edge(new Node("m"), new Node("n")));
        path.add(new Edge(new Node("n"), new Node("o")));
        path.add(new Edge(new Node("o"), new Node("p")));
        path.add(new Edge(new Node("p"), new Node("q")));
        path.add(new Edge(new Node("q"), new Node("r")));
        path.add(new Edge(new Node("r"), new Node("s")));
        path.add(new Edge(new Node("s"), new Node("t")));
        path.add(new Edge(new Node("t"), new Node("u")));
        path.add(new Edge(new Node("u"), new Node("v")));
        path.add(new Edge(new Node("v"), new Node("w")));
        path.add(new Edge(new Node("w"), new Node("x")));
        path.add(new Edge(new Node("x"), new Node("y")));
}