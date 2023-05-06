import com.google.common.hash.*;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;
import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;

import static com.google.common.io.BaseEncoding.base16;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
  @Test
  
Input: public static double toRadians(double angdeg) {
		return Math.toRadians(angdeg);
	}
Output: public void testToRadians() {
		double t0 = 0;
		double t1 = 30;
		assertEquals(0.5235987755982988, Maths.toRadians(t0), 0);
		assertEquals(0.5235987755982988, Maths.toRadians(t1), 0);
		assertEquals(0.5235987755982988, Maths.toRadians(0), 0);
		assertEquals(2*Math.PI, Maths.toRadians(360), 0);
}