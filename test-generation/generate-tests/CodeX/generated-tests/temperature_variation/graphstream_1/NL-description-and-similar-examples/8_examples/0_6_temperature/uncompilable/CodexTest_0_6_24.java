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


public class CodexTest_0_6_24 { 
    @Test
    public void containsShouldReturnFalseWhenEdgeIsNotInPath() {
        // given
        Path underTest = new Path();
        underTest.add(edge1);
        underTest.add(edge2);
        underTest.add(edge3);
        // when
        boolean result = underTest.contains(edge4);
        // then
        assertFalse(result);
    }
}