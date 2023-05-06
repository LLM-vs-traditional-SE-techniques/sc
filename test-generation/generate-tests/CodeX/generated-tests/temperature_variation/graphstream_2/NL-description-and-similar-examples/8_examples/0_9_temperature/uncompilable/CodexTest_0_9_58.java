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


public class CodexTest_0_9_58 { 
  @Test
        public static void booleanTest4() {
            String[] tokens = new String[] {
                "a", "b", "c", "d"
            };
            List list = Arrays.asList(tokens);
            Path path1 = new Path(tokens);
            Path path2 = new Path(list);
            System.out.println("--booleanTest4--");
            System.out.println("list: " + list);
            System.out.println("path1: " + path1);
            System.out.println("path2: " + path2);
            System.out.println("path1.equals(path2): " + path1.equals(path2));
        }
}