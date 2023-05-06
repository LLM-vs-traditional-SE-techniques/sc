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


public class CodexTest_0_5_8 { 
    @Test
    public void equals_shouldReturnTrueWhenPathsAreEqual() {
        // given
        Path path1 = new Path();
        path1.push(new Node("a"));
        path1.push(new Node("b"));
        path1.push(new Node("c"));
        Path path2 = new Path();
        path2.push(new Node("a"));
        path2.push(new Node("b"));
        path2.push(new Node("c"));
        // when
        boolean result = path1.equals(path2);
        // then
        assertTrue(result);
    }
}