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


public class CodexTest_0_9_3 { 
  @Test
  	public void testToByteArray() {
		/**
		 * Test whether a byte array can be created from a BitVector of
		 * length not a multiple of 8. Length should be 0 mod 8.
		 */
		BitVector bv = new BitVector(30);
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {
			os.write(bv.toByteArray());
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		byte[] b = os.toByteArray();
		assertEquals(3, b.length);
		/**
		 * Test whether a byte array can be created from a BitVector of
		 * length a multiple of 8.
		 */
		bv = new BitVector(32);
		os = new ByteArrayOutputStream();
		try {
			os.write(bv.toByteArray());
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		b = os.toByteArray();
		assertEquals(4, b.length);
}