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


public class CodexTest_0_7_81 { 
  @Test
        public void equals_ifNodePathSizeDiffer_shouldReturnFalse() {
            // given
            Path path1 = new Path();
            Path path2 = new Path();
            // when
            path1.add(createNode("node1"));
            path2.add(createNode("node1"));
            path2.add(createNode("node2"));
            // then
            assertFalse(path1.equals(path2));
        }

}