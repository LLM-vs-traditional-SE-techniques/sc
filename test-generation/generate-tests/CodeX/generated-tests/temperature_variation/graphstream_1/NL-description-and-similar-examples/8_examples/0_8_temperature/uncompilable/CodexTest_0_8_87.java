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


public class CodexTest_0_8_87 { 
    @Test
    public void contains_whenEdgePathContainsEdge_thenReturnTrue() {
        // given
        Edge e0 = new Edge("e0", V1, V2);
        Edge e1 = new Edge("e1", V2, V3);
        Path path = new Path(e0, e1);
}