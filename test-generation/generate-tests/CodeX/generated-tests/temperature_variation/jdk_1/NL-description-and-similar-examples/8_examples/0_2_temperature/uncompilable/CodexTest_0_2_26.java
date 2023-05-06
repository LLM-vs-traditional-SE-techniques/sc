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


public class CodexTest_0_2_26 { 
  @Test
    public void testRemove() {
        final List<String> list = new ArrayList<String>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        list.add("qux");
        list.add("quux");
        list.add("corge");
        list.add("grault");
        list.add("garply");
        list.add("waldo");
        list.add("fred");
        list.add("plugh");
        list.add("xyzzy");
        list.add("thud");
        list.add("blargh");
        list.add("foobar");
        list.add("bazqux");
        list.add("quxquux");
        list.add("corgegrault");
        list.add("graultgarply");
        list.add("garplywaldo");
        list.add("waldofred");
        list.add("fredplugh");
        list.add("plughxyzzy");
        list.add("xyzzythud");
        list.add("thudblargh");
        list.add("blarghfoobar");
        list.add("foobarbazqux");
        list.add("bazquxquxquux");
        list.add("quxquuxcorgegrault");
        list.add("corgegraultgraultgarply");
        list.add("graultgarplygarplywaldo");
        list.add("garplywaldowaldofred");
        list.add("waldofredfredplugh");
        list.add("fredplughplughxyzzy");
        list.add("plughxyzzyxyzzythud");
        list.add("xyzzythudthudblargh");
        list.add("thudblarghblarghfoobar");
        list.add("blarghfoobarfoobarbazqux");
        list.add("foobarbazquxbazquxquxquux");
        list.add("bazquxquxquuxquxquuxcorgegrault");
}