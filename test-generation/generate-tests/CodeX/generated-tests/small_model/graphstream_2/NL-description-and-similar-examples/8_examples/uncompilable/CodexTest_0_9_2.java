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
 
        Out.prln("Creating equal paths");
        Path equal1 = new Path(1.0);
        equal1.add(idx);
        equal1.add(idx);
        Path equal2 = new Path(1.0);
        equal2.add(idx);
        equal2.add(idx);
     
        Out.prln("Creating different paths
}