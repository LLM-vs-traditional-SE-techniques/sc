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


public class CodexTest_0_3_3 { 
  @Test
    public void testContains() {
        Path path = new Path();
        path.add(new Edge("ab"));
        path.add(new Edge("bc"));
        path.add(new Edge("cd"));
        path.add(new Edge("de"));
        path.add(new Edge("ef"));
        path.add(new Edge("fg"));
        path.add(new Edge("gh"));
        path.add(new Edge("hi"));
        path.add(new Edge("ij"));
        path.add(new Edge("jk"));
        path.add(new Edge("kl"));
        path.add(new Edge("lm"));
        path.add(new Edge("mn"));
        path.add(new Edge("no"));
        path.add(new Edge("op"));
        path.add(new Edge("pq"));
        path.add(new Edge("qr"));
        path.add(new Edge("rs"));
        path.add(new Edge("st"));
        path.add(new Edge("tu"));
        path.add(new Edge("uv"));
        path.add(new Edge("vw"));
        path.add(new Edge("wx"));
        path.add(new Edge("xy"));
        path.add(new Edge("yz"));
        path.add(new Edge("za"));
        assertTrue(path.contains(new Edge("ab")));
        assertTrue(path.contains(new Edge("bc")));
        assertTrue(path.contains(new Edge("cd")));
        assertTrue(path.contains(new Edge("de")));
        assertTrue(path.contains(new Edge("ef")));
        assertTrue(path.contains(new Edge("fg")));
        assertTrue(path.contains(new Edge("gh")));
        assertTrue(path.contains(new Edge("hi")));
        assertTrue(path.contains(new Edge("ij")));
        assertTrue(path.contains(new Edge("jk")));
        assertTrue(path
}