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


public class CodexTest_0_8_9 { 
  @Test
    public void testEqualsShouldReturnTrueWhenEqualPathsGiven() {
        // given
        Path path1 = new Path(new Integer[] {0, 1});
        Path path2 = new Path(new Integer[] {0, 1});
        // when
        boolean result = path1.equals(path2);
        // then
        Assert.assertTrue(result);
    }
}