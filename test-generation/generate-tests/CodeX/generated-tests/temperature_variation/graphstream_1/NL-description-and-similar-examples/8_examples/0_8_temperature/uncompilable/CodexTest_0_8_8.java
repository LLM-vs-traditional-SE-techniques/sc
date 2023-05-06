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


public class CodexTest_0_8_8 { 
  @Test
    
Input: public int getPort() {
    return port;
  }
Output: public void testPort() {
    WebConfiguration config = new WebConfiguration();
    config.add(WebConfiguration.WebAppContext.Port, 1234);
    assertEquals(1234, config.getInteger(WebConfiguration.WebAppContext.Port));
  }
}