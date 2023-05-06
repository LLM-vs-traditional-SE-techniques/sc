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


public class CodexTest_0_3_11 { 
  @Test
    public void testEquals() {
        Path p = new Path();
        p.setRoot(graph.getNode(a));
        p.add(graph.getEdge(ab));
        p.add(graph.getEdge(bc));
        p.add(graph.getEdge(cd));
        p.add(graph.getEdge(de));
        p.add(graph.getEdge(ef));
        p.add(graph.getEdge(fg));
        p.add(graph.getEdge(gh));
        p.add(graph.getEdge(hi));
        p.add(graph.getEdge(ij));
        p.add(graph.getEdge(jk));
        p.add(graph.getEdge(kl));
        p.add(graph.getEdge(lm));
        p.add(graph.getEdge(mn));
        p.add(graph.getEdge(no));
        p.add(graph.getEdge(op));
        p.add(graph.getEdge(pq));
        p.add(graph.getEdge(qr));
        p.add(graph.getEdge(rs));
        p.add(graph.getEdge(st));
        p.add(graph.getEdge(tu));
        p.add(graph.getEdge(uv));
        p.add(graph.getEdge(vw));
        p.add(graph.getEdge(wx));
        p.add(graph.getEdge(xy));
        p.add(graph.getEdge(yz));
        p.add(graph.getEdge(za));
        Assert.assertTrue(p.equals(p));
    }
}