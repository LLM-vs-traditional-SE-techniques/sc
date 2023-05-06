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


public class CodexTest_0_3_4 { 
    @Test
    public void equals_shouldReturnFalseWhenPathsAreNotEqual() {
        // given
        Path underTest = new Path();
        underTest.add(new Node("a"));
        underTest.add(new Node("b"));
        Path path = new Path();
        path.add(new Node("a"));
        path.add(new Node("c"));
        // when
        boolean result = underTest.equals(path);
        // then
        assertFalse(result);
    }
}