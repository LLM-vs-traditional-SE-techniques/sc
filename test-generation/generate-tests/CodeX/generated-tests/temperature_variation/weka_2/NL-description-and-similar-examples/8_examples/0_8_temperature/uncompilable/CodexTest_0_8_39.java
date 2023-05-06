import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_39 { 
    @Test
    public void testGetAsInstance() {
    	Id3 id3 = new Id3();
    	Id3.Tree tree = id3.new Tree("test");
        Id3.Node node1 = id3.new Node("1");
        node1.distribution = new DiscreteEstimator(2, true);
        node1.numInstances = 3;
        node1.m_Successors = new Id3.Node[2];
        node1.m_Successors[0] = node1;
        node1.m_Successors[1] = node1;
}