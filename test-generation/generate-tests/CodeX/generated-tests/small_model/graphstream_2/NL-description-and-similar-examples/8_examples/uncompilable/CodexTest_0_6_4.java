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


public class CodexTest_0_6_4 { 
  @Test
    public static void main(String[] args) {
        int size = 0;
        if (args.length == 1) {
            size = Integer.parseInt(args[0]);
        } else {
            System.out.println("Usage: java TestPath <size>");
            System.exit(1);
        }
        Path path = new Path();
        System.out.println("Size: " + size);
        System.out.
}