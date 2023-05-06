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


public class CodexTest_0_8_14 { 
  @Test
      public void testCube() {
      // test cube
      ParameterBlock pb = new ParameterBlock();
      RenderedOp src = JAI.create("fileload", "test/resources/images/test.png");
      pb.addSource(src);
      pb.add(new Integer(3));
      RenderedOp dst = JAI.create("cube", pb, null);
      RenderedImage result = dst.getRendering();
      assertNotNull(result);
      int[] pixel = new int[3];
      src.getData().getPixel(0, 0, pixel);
      assertEquals(0, pixel[0]);
      assertEquals(0, pixel[1]);
      assertEquals(0, pixel[2]);
      src.getData().getPixel(1, 0, pixel);
      assertEquals(255, pixel[0]);
      assertEquals(255, pixel[1]);
      assertEquals(255, pixel[2]);
    }
"""
}