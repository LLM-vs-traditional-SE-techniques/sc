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


public class CodexTest_0_6_1 { 
  @Test
    public void testWriteBytes() {
		BitArray ba = new BitArray(8);
		ba.set(0);
		ba.set(2);
		ba.set(3);
		ba.set(4);
		ba.set(6);
		ba.set(7);
		byte[] bytes = new byte[1];
		ba.writeBytesTo(bytes, 0, 1);
		assertEquals(0xAB, bytes[0]);
		ba.set(0);
		ba.writeBytesTo(bytes, 0, 1);
		assertEquals(0xAB, bytes[0]);
		ba.clear(0);
		ba.writeBytesTo(bytes, 0, 1);
		assertEquals(0x2B, bytes[0]);
		ba.clear(0);
		ba.clear(2);
		ba.clear(3);
		ba.clear(4);
		ba.clear(6);
		ba.clear(7);
		ba.writeBytesTo(bytes, 0, 1);
		assertEquals(0x00, bytes[0]);
	}
}