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


public class CodexTest_0_6_46 { 
  @Test
    /**
     * A path is equal to an object if and only if the object is a path with
     * the same number of node and the same nodes.
     * @param o object to compare
     * @return true if the compared object is equal to this path.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Path) {
            Path p = (Path) o;
            return nodePath.equals(p.nodePath);
        }
        return false;
    }
}