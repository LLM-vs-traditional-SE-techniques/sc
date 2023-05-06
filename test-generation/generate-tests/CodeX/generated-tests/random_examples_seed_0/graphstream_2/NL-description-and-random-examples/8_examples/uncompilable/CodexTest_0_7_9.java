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


public class CodexTest_0_7_9 { 
  @Test
    public void testEquals() {
        int[] nodePath = new int[]{1, 2, 3, 4};
        int[] nodePath2 = new int[]{1, 2, 3, 4};
        Path p1 = new Path(nodePath);
        Path p2 = new Path(nodePath2);
        assertEquals(p1, p2);
    }
```
}