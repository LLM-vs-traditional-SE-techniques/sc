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


public class CodexTest_0_8_1 { 
  @Test
    /**
     * Simple test to verify that a MutableFastList does not
     * support equals and hashCode.
     *
     * @since 3.3
     */
    public void testEqualsHashCode() {
        Assert.assertFalse("A MutableFastList must never support equals",
                new MutableFastList().equals(null));
        Assert.assertFalse("A MutableFastList must never support hashCode",
                new MutableFastList().hashCode() == 0);
    }
}