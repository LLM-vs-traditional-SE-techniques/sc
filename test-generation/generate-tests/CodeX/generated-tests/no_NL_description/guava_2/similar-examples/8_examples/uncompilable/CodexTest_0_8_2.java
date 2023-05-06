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


public class CodexTest_0_8_2 { 
  @Test
  public void testWriteIntToBuffer() {
		long value = -123456789L;
		byte[] buffer = new byte[9];
		Buffer buf = new FixedLengthBuffer(buffer);
		buf.writeByte((byte) x);
		buf.writeInt(value);
		buf.writeByte((byte) y);
		String result = new String(buffer, Charset.forName("UTF-8"));
		assertEquals("x\uFF89\uFFFD\uFFFD\uFFFD\u0015\uFFFDy", result);
	}
}