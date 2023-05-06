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


public class CodexTest_0_9_51 { 
    @Test(expected = IllegalArgumentException.class)
	public void equals_shouldReturnFalseWhenPathsHaveDifferentLength() {
		Graph graph = createNegativeEdgedGraph();
		Path path1 = new Path();
		Path path2 = new Path();
}