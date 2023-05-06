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


public class CodexTest_0_7_16 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[16]; // 8 bytes more than needed
    int bytesWritten = BitArray.create(new int[] {0x12345678}, 32).writeBytesTo(dest, 8, 8);
    assertEquals(4, bytesWritten);
    byte[] expected = new byte[16];
    expected[8] = 0x12;
    expected[9] = 0x34;
    expected[10] = 0x56;
    expected[11] = 0x78;
    assertTrue(Arrays.equals(expected, dest));
  }
}