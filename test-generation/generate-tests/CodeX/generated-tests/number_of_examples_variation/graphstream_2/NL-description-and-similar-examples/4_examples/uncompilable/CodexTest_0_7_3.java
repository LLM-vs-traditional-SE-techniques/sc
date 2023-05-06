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


public class CodexTest_0_7_3 { 
  @Test
    public void testEqualPathsShouldBeEqual() {
        // given
        Path path1 = new Path();
        Path path2 = new Path();
        // when
        path1.add(1, 2);
        path2.add(1, 2);
        // then
        assertTrue(path1.equals(path2));
    }
}