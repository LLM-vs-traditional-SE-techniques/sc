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


public class CodexTest_0_8_3 { 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Test
    public void testEquals() {
        Path p = new Path();
        p.nodePath = new ArrayList<Integer>();
        p.nodePath.add(1);
        Path r = new Path();
        r.nodePath = new ArrayList<Integer>();
        r.nodePath.add(1);
        Assert.assertEquals(true, r.equals(p));
}