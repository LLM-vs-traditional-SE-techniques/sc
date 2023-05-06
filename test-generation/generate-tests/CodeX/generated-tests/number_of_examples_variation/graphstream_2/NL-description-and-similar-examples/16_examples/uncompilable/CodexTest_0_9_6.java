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


public class CodexTest_0_9_6 { 
    @Test
    public void testIVertex() {
        Map<String, Attribute> attributeMap = new HashMap<String, Attribute>();
        Attribute firstName = new Attribute("firstname", AttributeType.STRING, "Paul");
        attributeMap.put("firstname", firstName);
        Attribute secondName = new Attribute("secondname", AttributeType.STRING, "Kim");
        attributeMap.put("secondname", secondName);
}