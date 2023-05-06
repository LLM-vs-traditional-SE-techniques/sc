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


public class CodexTest_0_8_11 { 
  @Test
	public void testGetAsInstance() throws Exception {
		AlgVector v = new AlgVector(1.1, 2.2, 3.3, 4.4);
		Instance i = v.getAsInstance(m_Instances, m_Random);
		assertEquals("Wrong number of attributes!", 4, i.numAttributes());
		assertEquals("Wrong number of values!", 4, i.numValues());
		assertEquals("Wrong value for attribute 1!", 1.1, i.value(0), 1E-6);
		assertEquals("Wrong value for attribute 2!", 2.2, i.value(1), 1E-6);
		assertEquals("Wrong value for attribute 3!", 3.3, i.value(2), 1E-6);
		assertEquals("Wrong value for attribute 4!", 4.4, i.value(3), 1E-6);
	  }
Input: public static void main(String[] argv) {
			try {
				final List<String> list = new ArrayList<>();
				list.add(a);
				list.add(b);
				list.add(c);
				list.add(d);
				list.add(e);
				final Iterator<String> it = list.iterator();
				int counter = 0;
				while (it.hasNext()) {
					final String s = it.next();
					if (s.equals(c)) {
						it.remove();
					} else {
						System.out.println(s);
						counter++;
					}
				}
				Assert.assertEquals(4, counter);
			} catch (final Exception ex) {
				ex.printStackTrace();
			}
		}
Output:
	
}