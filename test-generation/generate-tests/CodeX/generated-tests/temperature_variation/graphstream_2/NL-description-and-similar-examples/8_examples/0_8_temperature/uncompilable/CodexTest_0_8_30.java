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


public class CodexTest_0_8_30 { 
    @Test
	public void add_shouldCheckIfSourceMatchesHead() {
		// given
		Graph graph = createSimpleGraph();
		// check if Path.equals() will check if nodePath.size() is equal
		Path path = new Path();
		path.setRoot(graph.getNode(a));
		path.add(graph.getEdge(ab));
		// when
		path.add(graph.getEdge(cd));
}