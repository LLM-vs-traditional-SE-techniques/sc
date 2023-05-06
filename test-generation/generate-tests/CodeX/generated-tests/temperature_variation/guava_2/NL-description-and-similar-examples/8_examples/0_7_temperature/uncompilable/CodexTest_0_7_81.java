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


public class CodexTest_0_7_81 { 
  @Test
  public void testBitToByteConversion() {
    for (int i = 0; i < 64; i++) {
      for (int bitOffset = 0; bitOffset < 8; bitOffset++) {
        for (int byteLength = 0; byteLength < 8; byteLength++) {
          for (int value = 0; value < (1 << i); value++) {
            BitArray bits = create(i, value);
            byte[] bytes = new byte[byteLength + bitOffset / 8];
            bits.writeBytesTo(bytes, bitOffset, byteLength);
            BitArray copy = create(i, 0);
            copy.setBits(bytes, bitOffset, byteLength);
            assertEquals(bits, copy);
          }
        }
      }
    }
  }
}