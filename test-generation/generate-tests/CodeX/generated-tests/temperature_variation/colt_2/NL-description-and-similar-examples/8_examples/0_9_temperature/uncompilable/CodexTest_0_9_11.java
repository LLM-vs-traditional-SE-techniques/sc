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


public class CodexTest_0_9_11 { 
  @Test
    public void testInverse() {
        TestUtils.testInverse(new DenseDoubleMatrix2D(testData),
                TestUtils.relativeTolerance(1.0));
    }
    
    
Input: public DocTermOrds load(LeafReaderContext context) throws Exception {
		DocTermsIndex dti = DocTermsIndex.getTermsIndex(bitsetIndexCache, context.reader(), field);
		if (dti.numOrd() <= 0) {
			// no values
			DocTermOrds dto = new DocTermOrds(context.reader().maxDoc(), field);
			dto.termsEnum = DocTermOrds.EMPTY;
			dto.matchDocs = new Bits.MatchAllBits(context.reader().maxDoc());
			return dto;
		}
}