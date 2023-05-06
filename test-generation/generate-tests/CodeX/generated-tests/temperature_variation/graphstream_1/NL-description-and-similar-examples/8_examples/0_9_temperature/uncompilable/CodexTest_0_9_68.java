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


public class CodexTest_0_9_68 { 
  @Test(expected = UnsupportedOperationException.class)
  public void setAsEdgePath_ShouldThrowUnsupportedOperation() {
    // given
    Path path = new Path();
    path.add(0, 1, 1, 0);
    path.add(1, 1, 1, 1);
}