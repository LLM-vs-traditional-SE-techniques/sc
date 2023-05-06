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


public class CodexTest_0_8_59 { 
  @Test
  
Input: public double[] toArray() {
		double[] d = new double[size];
		int idx = 0;
		for (double i : this) {
			d[idx++] = i;
		}
		return d;
	}
Output: public void testToArray() {
		List<Double> l = new ArrayList<>();
		l.add(Math.random());
		l.add(Math.random());
		l.add(Math.random());
		DoubleList dl = new DoubleArrayList(l);
		double[] d = dl.toArray();
		assertEquals(d.length, 3);
		assertEquals(d[0], l.get(0), 0D);
		assertEquals(d[1], l.get(1), 0D);
		assertEquals(d[2], l.get(2), 0D);
	}
}