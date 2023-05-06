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


public class CodexTest_0_8_5 { 
  @Test
  public static void testWriteBytesTo() throws Exception {
    int[] lengths = {0, 1, 5, 8, 9, 16, 100, 1000, 10000};
    for (int i = 0; i < lengths.length; i++) {
      int length = lengths[i];
      byte[] expectedBytes = getSetBitsByteArray(length);
      byte[] dest = new byte[length];
      BitArray bits = getSetBitsBitArray(length);
      assertEquals(length, bits.writeBytesTo(dest, 0, length));
      assertTrue(Arrays.equals(expectedBytes, dest));
    }
  }
}