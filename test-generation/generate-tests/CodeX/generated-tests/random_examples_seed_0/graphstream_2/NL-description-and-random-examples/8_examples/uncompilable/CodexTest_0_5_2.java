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


public class CodexTest_0_5_2 { 
  @Test
    public void testEquals() {
        // given
        Path path1 = new Path("/a/b/c");
        Path path2 = new Path("/a/b/c");
        // then
        assertEquals("Paths should be equal", path1, path2);
    }
}