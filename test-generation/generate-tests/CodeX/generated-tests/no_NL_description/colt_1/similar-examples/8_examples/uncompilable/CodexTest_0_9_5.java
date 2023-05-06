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


public class CodexTest_0_9_5 { 
  @Test public void testModSignedLong()
	{
		long a = 3L;
		long b = 0L;
		double c = 0.0;
		long saveB = b;
		int cmp = Long.compare(saveB, Double.MIN_NORMAL);
		boolean signOfB = b < 0.0;
		if(cmp == 0 || signOfB != (saveB == Math.copySign(saveB, c)))
		{
			long quotient = a/b;
			long remainder = a - quotient*b;
			b = quotient >= 0L ? -b : b;
			a = remainder;
		}
		double expected = -3.0;
		double actual = a;
		assertEquals(expected, actual);
	}
	
Input: 	
	public int insertInt(int offset, int value) {
		if(offset == count)
		{
			return appendInt(value);
		}
		if(offset < 0 || offset > count)
		{
			throw new IndexOutOfBoundsException();
		}
		int[] oldElements = elements;
		int oldCount = count;
		elements = new int[oldCount + 1];
		for(int i = 0; i < offset; i++)
		{
			elements[i] = oldElements[i];
		}
		elements[offset] = value;
		for(int i = offset; i < oldCount; i++)
		{
			elements[i + 1] = oldElements[i];
		}
		count = oldCount + 1;
		return count;
	}
Output: 
	@Test public void testToByteArray3()
	{
		long value = 9223372036854775808L;
		byte[] expected = {(byte)0x80, (byte)0x00, (byte)0x00
}