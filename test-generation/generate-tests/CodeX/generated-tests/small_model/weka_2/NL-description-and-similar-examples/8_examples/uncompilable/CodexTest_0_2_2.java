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


public class CodexTest_0_2_2 { 
  @Test
  public void testGetAsInstance() {
    try {
      double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
      AlgVector v = new AlgVector(data);
      Instances model = new Instances(new StringReader("@relation test\n"
							+ "@attribute x numeric\n"
							+ "@attribute y numeric\n"
				
}