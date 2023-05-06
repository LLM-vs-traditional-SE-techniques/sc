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


public class CodexTest_0_9_5 { 
   @Test
	public void equals_sameNodes() {
		// given
		Path path = buildPath(new String[] {"a", "b", "d", "e"});
		Path path2 = buildPath(new String[] {"a", "b", "d", "e"});
		// when
		boolean result = path.equals(path2);
		// then
		Assert.assertTrue(result);
	}
}