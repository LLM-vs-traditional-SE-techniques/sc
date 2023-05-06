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


public class CodexTest_0_7_89 { 
  @Test
  public void testWriteBytesTo() {
			byte[] bytes = {a, b, c, d, e, f, g, h, i, j};
			HashCode hash = HashCode.fromBytesNoCopy(bytes);
			byte[] out = new byte[10];
			int numBytesWritten = hash.writeBytesTo(out, 0, 5);
			assertEquals("Wrong number of bytes written", 5, numBytesWritten);
			for (byte b : out) {
			  assertEquals("Wrong value written", b, bytes[b]);
			}
		  }
}