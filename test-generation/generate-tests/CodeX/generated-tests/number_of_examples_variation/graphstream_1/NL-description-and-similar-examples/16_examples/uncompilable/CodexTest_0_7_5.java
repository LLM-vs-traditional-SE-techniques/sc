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


public class CodexTest_0_7_5 { 
  @Test
    public void testContainsAll() {
        String[] s = { "A", "B", "C", "D" };
        FastVector v = new FastVector();
        for (int i = 0; i < s.length; i++) {
            v.addElement(s[i]);
        }
        ArrayList<String> al = new ArrayList<String>();
        for (int i = 0; i < s.length; i++) {
            al.add(s[i]);
        }
        assertTrue("FastVector.containsAll(ArrayList) should be true",
                   v.containsAll(al));
        v.removeElementAt(2);
        assertFalse("FastVector.containsAll(ArrayList) should be false",
                    v.containsAll(al));
    }
}