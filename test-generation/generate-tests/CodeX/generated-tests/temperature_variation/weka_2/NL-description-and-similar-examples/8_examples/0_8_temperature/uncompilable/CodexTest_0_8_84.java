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


public class CodexTest_0_8_84 { 
  @Test
    private void testInstanceFormat(int batchSize, final int classIndex) throws Exception {
			final Instances dataset = getDataset();
			dataset.setClassIndex(classIndex);
			final Instance[] instanceList = new Instance[batchSize];
			for (int j = 0; j < batchSize; j++) {
				instanceList[j] = getInstance(dataset, j);
			}
			final Object[] encodings = m_Converter.batchToValueArray(getEncoder(dataset), instanceList, dataset);
			for (int j = 0; j < batchSize; j++) {
				assertTrue(encodings[j].getClass() == double[].class);
				assertEquals(dataset.numAttributes(), ((double[]) encodings[j]).length);
			}
			for (int j = 0; j < batchSize; j++) {
				final Instance decoded = m_Converter.valueArrayToInstance(getDecoder(dataset), encodings[j], dataset);
				for (int i = 0; i < dataset.numAttributes(); i++) {
					if (dataset.classIndex() == i) {
						continue;
					}
					assertEquals("Attribute " + i + " differs for instance " + j,
							instanceList[j].value(i), decoded.value(i), Double.MIN_VALUE);
				}
			}
		}
}