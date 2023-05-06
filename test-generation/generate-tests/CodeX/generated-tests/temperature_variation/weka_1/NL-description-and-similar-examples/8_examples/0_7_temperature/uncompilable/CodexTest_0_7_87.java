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


public class CodexTest_0_7_87 { 
    @Test
    public void testAdd() {
        System.out.println("add");
        AlgVector b = new AlgVector(2);
        b.m_Elements[0]=2;
        b.m_Elements[1]=1;
        AlgVector c = new AlgVector(2);
        c.m_Elements[0]=1;
        c.m_Elements[1]=2;
}