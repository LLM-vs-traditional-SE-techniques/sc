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


public class CodexTest_0_7_1 { 
  @Test
    public void testToString() {
        // given
        Path path = new Path();
        // when
        path.add(new Node("root"));
        path.add(new Node("child"));
        path.add(new Node("grandchild"));
        path.add(new Node("greatgrandchild"));
        path.add(new Node("greatgreatgrandchild"));
        // then
        assertEquals("/root/
}