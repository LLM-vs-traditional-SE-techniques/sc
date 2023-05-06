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
    }
	
	@Test
	public void shouldReturnTrueWhenPathsAreEqual() {
		// given
		Path path1 = new Path();
		path1.add(new Edge("e1"));
		path1.add(new Edge("e2"));
		
		Path path2 = new Path();
		path2.add(new Edge("e1"));
		path2.add(new Edge("e2"));
		
		// when
		boolean equals = path1.equals(path2);
		
		// then
		assertTrue(equals);
	}
}