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


public class CodexTest_0_3_81 { 
  @Test
  public void testWriteBytesTo_maxLengthTooSmall() {
    byte[] dest = new byte[2];
    int maxLength = 1;
    try {
      int writtenBytes = bitArray.writeBytesTo(dest, 0, maxLength);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertEquals(
          "maxLength ("
              + maxLength
              + ") is less than the number of bytes required to represent the bit array ("
              + bitArray.bits() / 8
              + ")",
          e.getMessage());
    }
  }
}