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


public class CodexTest_0_9_10 { 
  @Test
    public void testEqualsWhenPathsEqualShouldReturnTrue() {
        // given
        List<Node> nodes = Arrays.asList(createDummyNode(1l), createDummyNode(2l), createDummyNode(3l));
        Path path2 = new Path(nodes);
}