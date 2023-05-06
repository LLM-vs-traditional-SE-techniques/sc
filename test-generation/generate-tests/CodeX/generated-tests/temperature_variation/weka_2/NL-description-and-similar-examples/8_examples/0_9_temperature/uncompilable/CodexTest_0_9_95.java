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


public class CodexTest_0_9_95 { 
  @Test
        /// <summary>
        ///A test for Inverse
        ///</summary>
        [TestMethod()]
        public void InverseBigTest()
        {
            SparseSparseRowMatrix target = new SparseSparseRowMatrix(MatrixTest.GetTestMatrix_2());
            SparseSparseRowMatrix expected = new SparseSparseRowMatrix(MatrixTest.GetTestMatrix_2_Inverse());
            SparseSparseRowMatrix actual;
            actual = target.Inverse();
            Assert.AreEqual(expected, actual);
        }
}