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


public class CodexTest_0_9_2 { 
  @Test
    public void testEquals() {
        List<Node<String>> nodes = new LinkedList<Node<String>>();
        nodes.add(new SingleParentNode<String>("a"));
        nodes.add(new SingleParentNode<String>("b"));
        nodes.add(new SingleParentNode<String>("c"));
}