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


public class CodexTest_0_9_27 { 
    @Test
    public void addDataset() throws Exception {
        // given
        int[] expectedOrdering = { 0, 2, 4, 5, 6 };
        DistanceMatrix dataset = createDataset();
}