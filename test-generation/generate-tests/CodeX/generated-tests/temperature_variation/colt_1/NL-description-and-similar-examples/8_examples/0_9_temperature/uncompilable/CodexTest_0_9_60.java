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


public class CodexTest_0_9_60 { 
  @Test
    public void testEqualsAndHashCode() {
		assertEquals(new ComboFormula(FormulaType.RACE, 0, 0),
				new ComboFormula(FormulaType.RACE, 0, 0));
		assertEquals(new ComboFormula(FormulaType.RACE, 0, 0).hashCode(),
				new ComboFormula(FormulaType.RACE, 0, 0).hashCode());
		assertFalse(new ComboFormula(FormulaType.RACE, 0, 0).equals(
				new ComboFormula(FormulaType.RACE, 1, 0)));
		assertFalse(new ComboFormula(FormulaType.RACE, 0, 0).equals(
				new ComboFormula(FormulaType.RACE, 0, 1)));
		assertFalse(new ComboFormula(FormulaType.RACE, 0, 0).hashCode() ==
				new ComboFormula(FormulaType.RACE, 1, 0).hashCode());
		assertFalse(new ComboFormula(FormulaType.RACE, 0, 0).hashCode() ==
				new ComboFormula(FormulaType.RACE, 0, 1).hashCode());
	}
}