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
    public void testEpsilonEdgeContainsItself() {
        Geometry gg = IOUtil.read("MULTILINESTRING((20 20, 30 20, 30 30, 30 40), "
                + "(40 40, 50 40, 50 30, 50 20, 40 20))");
        Path path = new Path();
        for (Edge e : new EpsilonEdgeSetIntersector().getEdges(gg, 20)) {
            path.add(e);
        }
}