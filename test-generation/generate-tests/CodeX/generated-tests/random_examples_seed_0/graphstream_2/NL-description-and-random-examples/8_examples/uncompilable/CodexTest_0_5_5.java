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


public class CodexTest_0_5_5 { 
  @Test
    public void testEquals() {
		Path p = new Path(new int[] {1, 2, 3});
		Path q = new Path(new int[] {1, 2, 3});
		Path r = new Path(new int[] {1, 2, 4});
}