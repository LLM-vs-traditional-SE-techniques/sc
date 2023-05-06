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


public class CodexTest_0_7_3 { 
  @Test
  public void testWriteBytes() {
	int[] data = new int[3];
	data[0] = 64;
	data[1] = 128;
	data[2] = 256;
	AlgVector v = new AlgVector(data);
	byte[] bytes = new byte[4];
	int bytesWritten = v.writeBytesTo(bytes, 0, 4);
	assertEquals("Wrong number of bytes written", 4, bytesWritten);
	assertEquals("Wrong contents of first byte", 64, bytes[0]);
	assertEquals("Wrong contents of second byte", 128, bytes[1]);
	assertEquals("Wrong contents of third byte", 0, bytes[2]);
	assertEquals("Wrong contents of fourth byte", 0, bytes[3]);
  }

}