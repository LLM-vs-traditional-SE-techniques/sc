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


public class CodexTest_0_8_8 { 
  @Test
    public void testEquals() {
			Path a = new Path("/a/b");
			Path aa = new Path("/a/b");
			Path aaa = new Path("/a/b/c");
			Assert.assertTrue(a.equals(aa));
			Assert.assertTrue(aa.equals(aaa));
		}
}