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


public class CodexTest_0_8_1 { 
  @Test
   public void testAssign15() {
        DoubleMatrix1D source = new cern.colt.matrix.impl.DenseDoubleMatrix1D(SIZE*2);
        DoubleMatrix1D target = new cern.colt.matrix.impl.DenseDoubleMatrix1D(SIZE*2);
        DoubleMatrix1D view = target.viewPart(SIZE/3,SIZE/2);
        //testing view-view assignment with view having larger stride than source
        source = cern.jet.math.Functions.chain(source,new cern.jet.math.Functions.PlusMult(2));
        cern.jet.math.Functions F = cern.jet.math.Functions.functions;
        view.assign(source.viewRowFlip().viewPart(SOURCE_ROWS/2,SOURCE_ROWS/2),F.div);
        Assert.assertTrue(checkView(source,0,0,view,true));
        view = target.viewPart(SIZE/3,SIZE/2);
        source = source.viewRowFlip().viewPart(SOURCE_ROWS/2,SOURCE_ROWS/2);
        //testing view-view assignment with view having smaller stride than source
        view.assign(source,F.div);
        Assert.assertTrue(checkView(source,0,0,view,true));
    }

}