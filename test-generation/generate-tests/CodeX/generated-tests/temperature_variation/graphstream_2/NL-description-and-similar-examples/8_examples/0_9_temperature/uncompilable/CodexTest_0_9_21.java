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


public class CodexTest_0_9_21 { 
    @Test public void testNumberType() {
        TestNumber<Integer> b = TestObjectBuilder.getTestInteger();
        Property<Integer> p = TestObjectBuilder.createNumberElementProperty(TestObjectBuilder.NUMBER_0_NAME, b, TestObjectBuilder.TOKEN0_KEY);
        Assert.assertEquals(p.getName(), TestObjectBuilder.NUMBER_0_NAME);
        Assert.assertEquals(p.getDefaultValue(), TestObjectBuilder.TOKEN0_KEY);
        Assert.assertTrue(p.validate(b.getDefault()).passed());
        Assert.assertFalse(p.validate(b.getDefault().toString()).passed());
    }
}