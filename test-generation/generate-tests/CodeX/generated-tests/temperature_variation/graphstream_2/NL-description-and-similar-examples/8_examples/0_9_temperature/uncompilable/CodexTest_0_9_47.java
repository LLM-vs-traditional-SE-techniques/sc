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


public class CodexTest_0_9_47 { 
    @Test
    @SuppressWarnings("unchecked")
    public void testNegativeEquals() {
        Path path1 = Path.buildPath(n1, n2, e12).build();
        Path path2 = Path.buildPath(n1, n2, e12).build();
}