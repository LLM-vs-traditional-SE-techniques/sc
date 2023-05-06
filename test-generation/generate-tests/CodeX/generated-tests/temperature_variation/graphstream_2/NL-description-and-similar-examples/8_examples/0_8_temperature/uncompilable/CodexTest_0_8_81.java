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


public class CodexTest_0_8_81 { 
    @Test
	public void equals_shouldReturnFalseIfPathsAreNotEqual() {
		Path firstPath = new Path();
		firstPath.setRoot(graph.getNode("0"));
		firstPath.add(graph.getEdge("01"));
		firstPath.add(graph.getEdge("12"));
		firstPath.add(graph.getEdge("23"));
}