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


public class CodexTest_0_9_76 { 
  @Test
    public void testEquals() {
        Path path = new Path();
        Assert.assertTrue(path.equals(path));
        Assert.assertFalse(path.equals(null));
        Assert.assertFalse(path.equals(new Object()));
        Path path2 = new Path(new Node[] {new DbaNode(0), new DbaNode(1), new DbaNode(2)});
        path2.setRoot(new DbaNode(0));
        Assert.assertTrue(path2.equals(path2));
        Assert.assertTrue(path.equals(path2));
        Assert.assertTrue(path2.equals(path));
    }
}