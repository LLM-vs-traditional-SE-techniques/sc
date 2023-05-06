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


public class CodexTest_0_9_4 { 
        @Test
    public void testEquals() {
        // given
        SetFacet aSet = new SetFacet();
        SetFacet bSet = new SetFacet();
        final UnaryFunction<DataField, String> nameFacet = new UnaryFunction<DataField, String>() {
            @Override
            public String evaluate(DataField value) {
                return value.getName().toString();
            }
        };

}