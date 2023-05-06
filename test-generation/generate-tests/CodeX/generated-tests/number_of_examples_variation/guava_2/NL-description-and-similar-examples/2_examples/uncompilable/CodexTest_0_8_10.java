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


public class CodexTest_0_8_10 { 
  @Test
    // As the number of bytes to write is private, we need to use reflection.
    public void testWriteBytesToWithNonZeroOffset() throws Exception {
      int length = 10;
      int bits = length * 8;
      BitArray array = new BitArray(bits);
      Method writeBytesToImpl = BitArray.class.getDeclaredMethod("writeBytesToImpl", byte[].class, int.class, int.class);
      writeBytesToImpl.setAccessible(true);
      // Write some bits to the BitArray instance.
      int value = 170;
      writeBytesToImpl.invoke(array, new byte[] {(byte) value}, 0, 1);
      // Ensure the BitArray was updated appropriately.
      assertEquals(length, array.bits());
      assertEquals(value, array.array()[0]);
      // Call writeBytesTo with an offset.
      int offset = 8;
      byte[] dest = new byte[length + offset];
      int maxLength = array.writeBytesTo(dest, offset, length);
      assertEquals(length, maxLength);
      assertEquals(value, dest[offset]);
    }
}