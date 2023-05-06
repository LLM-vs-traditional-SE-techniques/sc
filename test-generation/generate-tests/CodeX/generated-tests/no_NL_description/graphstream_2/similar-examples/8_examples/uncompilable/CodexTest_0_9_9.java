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


public class CodexTest_0_9_9 { 
  @Test
    /** Two paths are considered equal if they have same length,
     * and if they have same nodes and edges at same positions.
     **/
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (obj instanceof Path) {
            Path p = (Path)obj;
            if (edges.size() != p.edges.size())
                return false;
            if (nodes.size() != p.nodes.size())
                return false;
            for (int i = 0; i < this.edges.size(); i++) {
                Edge e1 = this.edges.get(i);
                Edge e2 = p.edges.get(i);
                if (!e1.equals(e2))
                    return false;
            }
            for (int i = 0; i < this.nodes.size(); i++) {
                Node n1 = this.nodes.get(i);
                Node n2 = p.nodes.get(i);
                if (!n1.equals(n2))
                    return false;
            }
            return true;
        }
        return false;
    }
}