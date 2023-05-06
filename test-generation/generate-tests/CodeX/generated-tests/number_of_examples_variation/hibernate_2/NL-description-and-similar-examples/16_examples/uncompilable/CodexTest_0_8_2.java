import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_2 { 
  @Test
  public void testConstructor() {
    Boolean value = Boolean.TRUE;
    RTree<Integer,Boolean> tree = RTree.maxChildren(4).<Integer,Boolean>create()
        .add(1,1,value)
        .add(2,2,value)
        .add(3,3,value)
        .add(4,4,value)
        .add(5,5,value)
        .add(6,6,value)
        .add(7,7,value)
        .add(8,8,value)
        .add(9,9,value)
        .add(10,10,value)
        .add(11,11,value)
        .add(12,12,value)
        .add(13,13,value)
        .add(14,14,value)
        .add(15,15,value)
        .add(16,16,value)
        .add(17,17,value)
        .add(18,18,value)
        .add(19,19,value)
        .add(20,20,value)
        .add(21,21,value)
        .add(22,22,value)
        .add(23,23,value)
        .add(24,24,value)
        .add(25,25,value)
        .add(26,26,value)
        .add(27,27,value)
        .add(28,28,value)
        .add(29,29,value)
        .add(30,30,value)
        .add(31,31,value)
        .add(32,32,value)
        .add(33,33,value)
        .add(34,34,value)
        .add(35,35,value)
        .add(36,36,value)
        .add(37,37,value)
        .add(38,38,value)
        .add(39,39,value)
        .add(40,40,value);
}