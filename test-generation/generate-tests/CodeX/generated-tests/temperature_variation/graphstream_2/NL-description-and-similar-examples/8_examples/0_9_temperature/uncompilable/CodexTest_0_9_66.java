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


public class CodexTest_0_9_66 { 
    boolean found_21 = false;
    for(int index_20 = 0 ; index_20 < a.edges.size();index_20++) { 
     Edge e_22 = a.edges.get(index_20);
     if(e_22.getStartNode().equals(b) && e_22.getEndNode().equals(c))
     found_21=true;
    }
    assertTrue(found_21);
    
Input: public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Person)) {
			return false;
		}
		Person p = (Person) o;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.id, p.id);
		builder.append(this.firstname, p.firstname);
		builder.append(this.lastname, p.lastname);
		builder.append(this.email, p.email);
		return builder.isEquals();
	}
Output: @Test
	public void equals_differentLastName_returnsFalse() {
		// SETUP
		Person p1 = new Person(1, John, Snow, ...);
		Person p2 = new Person(1, John, Wick, ...);
		// EXEC
		boolean actual = p1.equals(p2);
		// VERIFY
		assertFalse(actual);
	}
}