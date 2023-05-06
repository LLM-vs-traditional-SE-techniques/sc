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


public class CodexTest_0_6_6 { 
  @Test
    public void testEqualsShouldReturnTrueWhenPathsAreEqual() {
        // given
        Path p1 = Path.path("e1");
        Path p2 = Path.path("e1");
        // when
        boolean result = p1.equals(p2);
        // then
        assertTrue(result);
    }
}