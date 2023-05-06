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


public class CodexTest_0_7_7 { 
    @Test
    public void contains() {
        Path path = new Path();
        path.add(edge);
        assertTrue(path.contains(edge));
        Graph graph = new DefaultGraph("g");
        graph.addEdge(null, "1", "2");
        Edge edge1 = graph.getEdge("1");
        assertFalse(path.contains(edge1));
    }
    
    
Input: public String[] getTargetNames() {
		return targetNames;
	}
Output:
    public void testSetTargetNames() {
        String[] targetNames = {"1", "2", "3"};
        target.setTargetNames(targetNames);
        assertTrue(Arrays.equals(target.getTargetNames(), targetNames));
    }
    
    
Input: public Collection<Pair<Double, Double>> getPairs() {
		return pairs;
	}
Output:
    public void testGetPairs() {
        Set<Pair<Double, Double>> pairs = new HashSet<Pair<Double, Double>>();
        pairs.add(new Pair<Double, Double>(1.0, 2.0));
        pairs.add(new Pair<Double, Double>(1.0, 4.0));
        Collections.reverse((List<Pair<Double, Double>>) pairs);
        assertTrue(pairs.equals(new ArrayList<Pair<Double, Double>>() {{ add(new Pair<Double, Double>(1.0, 2.0));
            add(new Pair<Double, Double>(1.0, 4.0));
        }}));
    }
    
}