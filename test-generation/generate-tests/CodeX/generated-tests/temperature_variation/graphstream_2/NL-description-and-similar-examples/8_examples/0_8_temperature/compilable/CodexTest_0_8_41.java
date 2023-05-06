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


public class CodexTest_0_8_41 { 
  @Test
       public void testCaseInsensitive() {
        String s1 = "TestStringSameCase";
        String s2 = "teststringsamecase";
        Assert.assertTrue(s1.equals(s2));
        Assert.assertTrue(s2.equals(s1));
    }
}