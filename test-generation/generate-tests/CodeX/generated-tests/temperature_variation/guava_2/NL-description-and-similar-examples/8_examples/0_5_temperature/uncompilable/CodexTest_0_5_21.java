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


public class CodexTest_0_5_21 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    int offset = 1;
    int maxLength = 4;
    byte[] expected = new byte[dest.length];
    byte[] input = {1, 2, 3, 4, 5, 6, 7, 8};
    for (int i = 0; i < input.length; i++) {
      expected[i] = input[i];
    }
    expected[offset] = 1;
    expected[offset + 1] = 2;
    expected[offset + 2] = 3;
    expected[offset + 3] = 4;
    BitArray bits = new BitArray(input);
    bits.writeBytesTo(dest, offset, maxLength);
    assertTrue(Arrays.equals(expected, dest));
  }
}