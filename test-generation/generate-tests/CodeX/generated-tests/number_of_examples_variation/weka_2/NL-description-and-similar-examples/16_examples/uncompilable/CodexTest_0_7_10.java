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


public class CodexTest_0_7_10 { 
    @Test
    public void testInsertIdx() {
        int[] idx = new int[]{0};
        int[] predIdx = new int[]{0, 1};
        int[][] idxArray = new int[][]{idx, predIdx};
        int[] insertionIdx = new int[]{1};
        int[][] insertionIdxArray = new int[][]{insertionIdx};
        ClusRun cr = new ClusRun();
        cr.setClustering(idxArray, insertionIdxArray, null, null);
        assertEquals(1, cr.getInsertIdx().length);
        assertEquals(1, cr.getInsertIdx()[0]);
    }
}