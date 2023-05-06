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


public class CodexTest_0_7_1 { 
    @Test
    public void testEquals() {
        // given
        Object[] object = new Object[] { new Object(), new Object() };
        String[] string = new String[] { "x", "y", "z" };
        int[] number = new int[] { 1, 2, 3 };
        Path path1 = new Path(object, string, number);
        Path path2 = new Path(object, string, number);
        // when
        boolean result = path1.equals(path2);
        // then
        assertTrue(result);
    }

}