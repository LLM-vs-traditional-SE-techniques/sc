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


public class CodexTest_0_9_7 { 
  @Test
  public void testToString() {
    int sizeX = 10;
    int sizeY = 8;
    float mu = 0.29f;
    float sigma = 3;
    float[][] transArr = new float[sizeX][sizeY];
    for (int x = 0; x < sizeX; x++) {
      float[] testColA = new float[sizeY];
      for (int y = 0; y < sizeY; y++) {
       testColA[y] = Utils.randomFloat(mu, sigma);
      }
      ZVectorCol testCol = new ZVectorColImpl(testColA);
      transArr[x] = testCol.toFloatArray();
    }
    ZVectorCol[] arrA = new ZVectorCol[sizeX];
    for (int x = 0; x < sizeX; x++) {
      float[] testColA = transArr[x];
      ZVectorCol testCol = new ZVectorColImpl(testColA);
      arrA[x] = testCol;
    }
    ZVectorRowImpl rowA = new ZVectorRowImpl(arrA, true);
    ZVectorRowImpl rowB = rowA.transpose();
    Assert.assertEquals(rowA.get(0, 0), rowB.get(0, 0), 0);
    Assert.assertEquals(rowA.get(0, 5), rowB.get(5, 0), 0);
    Assert.assertEquals(rowA.get(2, 0), rowB.get(0, 2), 0);
    Assert.assertEquals(rowA.get(4, 4), rowB.get(4, 4), 0);
    Assert.assertEquals(rowA.get(5, 6), rowB.get(6, 5), 0);
    Assert.assertEquals(rowA.get(7, 7), rowB.get(7, 7), 0);
    Assert.assertEquals(rowA.get(9, 3), rowB.get(3, 9), 0);
  }
}