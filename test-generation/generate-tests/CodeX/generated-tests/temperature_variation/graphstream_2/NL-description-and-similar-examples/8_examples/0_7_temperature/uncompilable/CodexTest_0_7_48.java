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


public class CodexTest_0_7_48 { 
        @Test
	public void testEquals() {
		Node a = new DefaultNode( "a" );
		Node b = new DefaultNode( "b" );
		Node c = new DefaultNode( "c" );
		Node d = new DefaultNode( "d" );
		Edge ab = new DefaultEdge( "ab", a, b );
		Edge bc = new DefaultEdge( "bc", b, c );
		Edge cd = new DefaultEdge( "cd", c, d );
		Path path = new Path();
}