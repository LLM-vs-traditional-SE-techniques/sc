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


public class CodexTest_0_7_10 { 
    
    
Input: public class DefaultGraph implements Graph {
			@Override
			public Set<Node> getNodeSet() {
				return new HashSet<Node>(nodes);
			}
		}
Output: @Test
    public void getNodeSetShouldReturnEmptySetWhenGraphHasNoNodes() {
        // given
        Graph graph = new DefaultGraph("empty");
        // when
        Set<Node> nodeSet = graph.getNodeSet();
        // then
        assertNotNull(nodeSet);
        assertTrue(nodeSet.isEmpty());
    }
}