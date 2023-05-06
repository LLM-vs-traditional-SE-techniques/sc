import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import java.lang.reflect.Field;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SplittableRandom;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_93 { 
  @Test
    public void testContains() throws Exception {
        XmlObject s = XmlObject.Factory.parse("<a xmlns:w=\"http://www.example.org\"><b/></a>");
        XmlObject s2 = XmlObject.Factory.parse("<a xmlns:w=\"http://www.example.org\"><b/></a>");
        XmlCursor c = s.newCursor();
        c.toFirstChild();
        XmlCursor c2 = s2.newCursor();
        c2.toFirstChild();
        c.toNextSibling();
        c2.toNextSibling();
        c.setName(new QName("http://www.example.org", "x"));
        c2.setName(new QName("http://www.example.org", "y"));
        assertTrue(c.localNameEquals("x"));
        assertTrue(c.uriEquals("http://www.example.org"));
        assertTrue(c.nameEquals(new QName("http://www.example.org", "x")));
        assertEquals("x", c.getName().getLocalPart());
        assertEquals("http://www.example.org", c.getName().getNamespaceURI());
        assertTrue(c.getName().getPrefix() == null);
        assertFalse(c.hasNextSibling());
        assertFalse(c.hasPrevSibling());
    }
}