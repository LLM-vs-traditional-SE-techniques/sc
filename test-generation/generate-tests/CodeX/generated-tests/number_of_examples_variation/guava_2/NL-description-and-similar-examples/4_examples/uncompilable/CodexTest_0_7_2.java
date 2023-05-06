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


public class CodexTest_0_7_2 { 
  @Test
   public void testWriteBytesToWithOffset() {
    byte[] dest = new byte[32];
    int length = new BigInteger(1, EXPECTED_BYTES).bitLength() / 8;
    int offset = 3;
    int written = HashCode.fromBytes(EXPECTED_BYTES).writeBytesTo(dest, offset, length);
    assertEquals(length, written);
    assertTrue(Arrays.equals(Arrays.copyOfRange(EXPECTED_BYTES, 0, length),
        Arrays.copyOfRange(dest, offset, offset + length)));
  }

}