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


public class CodexTest_0_9_100 { 
  @Test
	public void testSetGetDirection() {
		Node n = Mockito.mock(Node.class);
		Edge e = new Edge(n, null);
		assertEquals(null, e.getNode());
		assertEquals(n, e.getSourceNode());
		assertEquals(e.getSource(), n);
		e.setDirection(Direction.IN);
		assertEquals(PressureLossEdgeRenderer.DIRECTION_IN, e.getDirection());
		e.setDirection(Direction.NONE);
		assertEquals(PressureLossEdgeRenderer.DIRECTION_NONE, e.getDirection());
		e.setDirection(Direction.OUT);
		assertEquals(PressureLossEdgeRenderer.DIRECTION_OUT, e.getDirection());
		e.setDirection(null);
		assertEquals(null, e.getDirection());
		assertEquals(n, e.getNode());
		assertEquals(n, e.getSourceNode());
		assertEquals(e.getSource(), n);
		e.setDirection(Direction.IN);
		assertEquals(PressureLossEdgeRenderer.DIRECTION_IN, e.getDirection());
	}
}