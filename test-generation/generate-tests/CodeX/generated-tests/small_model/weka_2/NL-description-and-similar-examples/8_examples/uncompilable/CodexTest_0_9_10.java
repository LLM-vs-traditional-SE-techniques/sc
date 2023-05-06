import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_10 { 
  @Test
  public void testGetAsInstanceReturnsDenseInstance() throws Exception {
    Mappings mappings = new SimpleMappings("Id","Name");
    Connection c = new Connection("connectionId", mappings);
    Node node = new Node("Id");
    c.addNode(node);
    c.removeNode(node);
    assertEquals(node, c.getNodes().get(0));
    assertEquals(mappings, c.getMappings());
    assertEquals
}