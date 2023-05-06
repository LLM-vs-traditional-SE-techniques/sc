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
      /**
     * a1 -> a2 -> a3  -> a4
     *         b2 -> b3  -> b4
     * a1 -> a2 -> a3 -> b3 -> b4
     */
    @Test
    public void contains_shouldReturnFalseWhenEdgesAreNotAllowed() {
        Graph graph = new DefaultGraph("test");
        graph.setStrict(true);
        graph.setAutoCreate(true);
}