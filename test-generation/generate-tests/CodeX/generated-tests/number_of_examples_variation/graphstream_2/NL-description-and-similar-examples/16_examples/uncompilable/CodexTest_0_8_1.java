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


public class CodexTest_0_8_1 { 
    @Test
	public void testEqualsMethod() {
		Path path1 = new Path();
		Path path2 = new Path();
		path1.add(graph.getNode("A"));
		path1.add(graph.getNode("B"));
		path1.add(graph.getNode("C"));
		path2.add(graph.getNode("A"));
		path2.add(graph.getNode("B"));
		path2.add(graph.getNode("C"));
		Assert.assertEquals(true, path1.equals(path2));
	}

}