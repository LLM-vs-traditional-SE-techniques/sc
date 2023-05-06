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


public class CodexTest_0_9_90 { 
    	@Test
		public void getObjectSequence_addOneParam_returnsObjectArray() throws Exception {
			// Arrange
			DefaultGraphContainerBuilder graphContainerBuilder = spy(new DefaultGraphContainerBuilder());
			// Act
			Object[] actualObjectArray = graphContainerBuilder.getObjectSequence(graphContainerBuilder.getObjectArray("foo"));
			// Assert
			assertEquals(1, actualObjectArray.length);
			assertTrue(ObjectSequence.class.isAssignableFrom(actualObjectArray[0].getClass()));
			assertEquals(new Object[]{"foo"}, actualObjectArray);
		}
}