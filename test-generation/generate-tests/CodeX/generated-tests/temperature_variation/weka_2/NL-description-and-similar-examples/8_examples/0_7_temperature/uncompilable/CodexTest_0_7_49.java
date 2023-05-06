import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_49 { 
  
Input: public static Edge createEdge(Graph graph, String id, String sourceId, String targetId, boolean directed) {
		if (graph.getEdge(id) != null) {
			logger.warning("An edge with the id  + id +  already exists in the graph!");
		}
		Edge edge = new DefaultEdge(id);
		edge.setSource(graph.getNode(sourceId));
		edge.setTarget(graph.getNode(targetId));
		edge.setDirected(directed);
		return edge;
	}
Output: @Test(expected = IllegalArgumentException.class)
	public void create_edgeIdMustBeUnique() {
		Graph graph = createSimpleGraph();
}