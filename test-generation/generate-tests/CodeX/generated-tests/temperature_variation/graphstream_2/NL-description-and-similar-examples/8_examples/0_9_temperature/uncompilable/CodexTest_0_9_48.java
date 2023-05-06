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


public class CodexTest_0_9_48 { 
    
Input: public MapBuilder<K, V> add(K k, V v) {
        map.put(k, v);
        return this;
    }
Output: @Test
    public void testPut() {
        MapBuilder<String, String> mapBuilder = MapBuilder.<String, String>newHashMapBuilder().add("foo", "bar");
        assertEquals(mapBuilder.map().get("foo"), "bar");
    }
}