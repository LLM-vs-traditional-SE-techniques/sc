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


public class CodexTest_0_9_62 { 
  @Test
  public void testCannotContainBothEdge(){
    Assert.assertFalse(this.path.contains(this.edge1)&&this.path.contains(this.edge8)&&this.path.contains(this.edge9)&&this.path.contains(this.edge6));
  }

}