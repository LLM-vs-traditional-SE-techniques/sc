import cern.colt.matrix.*;
import cern.colt.list.DoubleArrayList;
import cern.colt.list.IntArrayList;
import cern.colt.matrix.impl.AbstractMatrix1D;

import hep.aida.bin.*;
import cern.colt.matrix.impl.*;
import cern.colt.function.DoubleDoubleFunction;
import cern.colt.function.DoubleFunction;
import cern.colt.list.IntArrayList;
import cern.colt.map.AbstractIntDoubleMap;
import cern.colt.map.OpenIntDoubleHashMap;
import cern.colt.matrix.DoubleFactory2D;
import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.DoubleMatrix2D;
import cern.colt.matrix.DoubleMatrix3D;
import cern.colt.matrix.doublealgo.DoubleMatrix2DComparator;
import cern.colt.matrix.linalg.Algebra;
import cern.colt.matrix.linalg.LUDecompositionQuick;
import cern.colt.matrix.linalg.SeqBlas;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_32 { 
  @Test
    public static void testMerge() {
        final String logFile = test.txt;
        final String[] data = {
                1,11,111,
                2,22,222,
                3,33,333,
                4,44,444,
        };
		final int[] colMappings = {0,1};
		try {
			PrintWriter writer = new PrintWriter(logFile, utf-8);
			for (String line : data) {
				writer.println(line);
			}
			writer.close();
			Configuration conf = new Configuration();
			FileSystem fs = FileSystem.get(new URI(logFile), conf);
			Path path = new Path(logFile);
			MultipleInputs.addInputPath(conf, path, TextInputFormat.class, 
										MapClass.class);
			fs.delete(path, true);
			Path outputDir = new Path(., test);
			fs.delete(outputDir, true);
			FileOutputFormat.setOutputPath(conf, outputDir);
			JobClient.runJob(conf);
			ArrayList<String> outList = new ArrayList<String>(1);
			Utils.readOutput(outList, outputDir, conf);
			assertEquals(1, conf.getInt(test.columns, 0));
 			assertEquals(0, outList.indexOf(1t11));
			assertEquals(1, outList.indexOf(2t22));
			assertEquals(2, outList.indexOf(3t33));
			assertEquals(3, outList.indexOf(4t44));
		} catch (Exception e) {
			fail(e.toString());
		}
	}
}