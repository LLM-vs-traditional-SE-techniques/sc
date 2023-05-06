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


public class CodexTest_0_8_7 { 
        @Test
	public void equals_whenPathsAreEqual() {
		Path path1 = new Path();
		path1.add("v1");
		path1.add("v2");
		Path path2 = new Path();
		path2.add("v1");
		path2.add("v2");
}