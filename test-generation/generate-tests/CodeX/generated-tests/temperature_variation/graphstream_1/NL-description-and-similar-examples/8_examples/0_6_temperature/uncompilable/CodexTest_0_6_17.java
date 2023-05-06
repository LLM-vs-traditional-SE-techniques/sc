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


public class CodexTest_0_6_17 { 
        @Test
	public void contains_shouldReturnFalseForNullEdge() {
		// given
		Path path = new Path();
		// when
		boolean result = path.contains(null);
		// then
		assertFalse(result);
	}
}