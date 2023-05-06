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


public class CodexTest_0_7_14 { 
  @Test
  public void testWriteBytesTo() {
		byte[] b = new byte[Integer.SIZE / Byte.SIZE];
		// write int max value to the byte array
		int written = Ints.writeBytes(Integer.MAX_VALUE, b, 0, b.length);
		assertEquals(b.length, written);
		assertEquals(Integer.MAX_VALUE, Ints.readBytes(b, 0, b.length));
		// write int min value to the byte array
		written = Ints.writeBytes(Integer.MIN_VALUE, b, 0, b.length);
		assertEquals(b.length, written);
		assertEquals(Integer.MIN_VALUE, Ints.readBytes(b, 0, b.length));
		// write 0 to the byte array
		written = Ints.writeBytes(0, b, 0, b.length);
		assertEquals(b.length, written);
		assertEquals(0, Ints.readBytes(b, 0, b.length));
	}
}