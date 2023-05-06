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


public class CodexTest_0_8_6 { 
  @Test
  public void testWriteBytesTo() {
		BitArray b = BitArray.valueOf(new long[] {0xF0F0F0F0F0F0F0F0L});
		byte[] dest = new byte[10];
		assertEquals(8, b.writeBytesTo(dest, 1, 8));
		assertEquals((byte) 0xF0, dest[1]);
		assertEquals((byte) 0xF0, dest[2]);
		assertEquals((byte) 0xF0, dest[3]);
		assertEquals((byte) 0xF0, dest[4]);
		assertEquals((byte) 0xF0, dest[5]);
		assertEquals((byte) 0xF0, dest[6]);
		assertEquals((byte) 0xF0, dest[7]);
		assertEquals((byte) 0xF0, dest[8]);
		assertEquals(0, dest[9]);
	}
}