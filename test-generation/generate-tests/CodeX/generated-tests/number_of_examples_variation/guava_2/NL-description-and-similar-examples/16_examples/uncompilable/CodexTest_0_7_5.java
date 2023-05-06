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


public class CodexTest_0_7_5 { 
  @Test
  public void testWriteBytesTo() {
    byte[] result = new byte[5];
    BitSet bitset = BitSet.valueOf(new long[]{0x1234567890L});
    int bytesWritten = bitset.writeBytesTo(result, 0, result.length);
    assertEquals(5, bytesWritten);
    // This test is fragile, but it checks the interesting bits.
    assertEquals((byte) 0x12, result[0]);
    assertEquals((byte) 0x34, result[1]);
    assertEquals((byte) 0x56, result[2]);
    assertEquals((byte) 0x78, result[3]);
    assertEquals((byte) 0x90, result[4]);
  }
}