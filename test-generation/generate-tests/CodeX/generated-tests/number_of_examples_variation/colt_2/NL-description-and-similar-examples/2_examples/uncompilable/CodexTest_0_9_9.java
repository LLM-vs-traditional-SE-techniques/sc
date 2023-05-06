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


public class CodexTest_0_9_9 { 
  @Test
        public void testDoubleFactory2DmakerWithRowDimensionAndColumnDimension() {
            DoubleFactory2D f = DoubleFactory2D.dense;
            double[][] arrMatrix = 
            { 
                { 1, 2, 3, 4, 5, 6},
                { 2, 3, 4, 5, 6, 7}
            };
            DoubleMatrix2D matrix = f.make(arrMatrix);
            DoubleMatrix2D res = f.make(matrix.rows(),matrix.columns());
            res.assign(matrix);
            IntArrayList columnList = new IntArrayList(new int[] { 0 });
            IntArrayList rowList = new IntArrayList(new int[] { 0 });
            double value2 = 3.5;
            double value3 = 4.5;
            res.viewSelection(rowList, columnList).assign(value2);            
            columnList = new IntArrayList(new int[] { 1 });
            columnList = new IntArrayList(new int[] { 1 });
            res.viewSelection(rowList,columnList).assign(value3);
            IntArrayList columnIndexes = new IntArrayList(new int[] { 0, 1 });
            for (int r = 0; r < res.rows(); r++)
}