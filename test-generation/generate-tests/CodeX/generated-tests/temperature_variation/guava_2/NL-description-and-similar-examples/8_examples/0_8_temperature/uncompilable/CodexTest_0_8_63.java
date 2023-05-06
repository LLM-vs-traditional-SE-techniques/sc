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


public class CodexTest_0_8_63 { 
  @Test
  public void testWriteBytesToHandlesPartialWrites() {
		BitArray bits = BitArray.create(new byte[]{(byte) 0xFF}, 8);
		byte[] dest = new byte[3];
		int bytesWritten = bits.writeBytesTo(dest, 1, 2);
		assertEquals("Number of bytes written is incorrect", 2, bytesWritten);
		assertArrayEquals("First byte of destination array is incorrect",
				new byte[]{0, (byte) 0xFF, 0}, dest);
	}
}