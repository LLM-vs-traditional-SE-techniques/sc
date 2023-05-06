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


public class CodexTest_0_8_25 { 
  @Test
  public void testGetAsInstance() {
    try {
      int[] m_Elements = new int[]{7, 3, 5};
      int[] m_Elements2 = new int[]{2, 9};
      DataBase db = new DataBase();
      db.createTable("test", "Movie", new String[]{"genre", "year", "name"});
      Relation r = db.getTable("test");
      r.addTuple(new Tuple(new String[]{"thriller", "2007", "The Bourne Ultimatum"})); 
      r.addTuple(new Tuple(new String[]{"action", "2006", "Casino Royale"}));
      r.addTuple(new Tuple(new String[]{"horror", "2004", "The Grudge"}));
      Instances model = new Instances(r);
      Random random = new Random();
      AlgVector v1 = new AlgVector(m_Elements);
      Instance inst1 = v1.getAsInstance(model, random);
      AlgVector v2 = new AlgVector(m_Elements2);
      Instance inst2 = v2.getAsInstance(model, random);
      assertEquals("Lengthes are not equal", v1.numElements(),
        v2.numElements());
      for (int i = 0; i < v1.numElements(); i++) {
        assertEquals((i + 1) + ". values are not equal", v1.getElement(i),
              v2.getElement(i));
      }
    } catch (Exception e) {
      fail("Exception occurs.");
    }
  }
}