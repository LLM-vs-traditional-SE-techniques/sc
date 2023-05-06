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


public class CodexTest_0_9_6 { 
    @Test
    public void equals_should_return_false_when_paths_have_different_elements() {
        Node node1 = NodeFactory.createURI("http://test1.com");
        Node node2 = NodeFactory.createURI("http://test2.com");
        Node node3 = NodeFactory.createURI("http://test3.com");
}