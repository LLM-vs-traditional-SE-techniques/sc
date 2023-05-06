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


public class CodexTest_0_9_61 { 
  @Test
  public void testHashCode() {
		Path path1 = new Path();
		Assert.assertEquals(0, path1.hashCode());
		path1.add(node1);
		path1.add(node2);
		Assert.assertEquals(37 * (31 + node1.hashCode()) + 37 * (31 + node2.hashCode()), path1.hashCode());
		Path path2 = new Path();
		path2.add(node1);
		path2.add(node2);
		Assert.assertEquals(path1.hashCode(), path2.hashCode());
	}
}