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
  public void testWriteBytes() {
      byte[] bytes = new byte[4];
      for (int i = 0; i < bytes.length; i++) {
          bytes[i] = (byte) i;
      }
      ImmutableBitArray b = ImmutableBitArray.createFromBytes(bytes);
      byte[] written = new byte[4];
      assertEquals(4, b.writeBytesTo(written, 0, 4));
      assertArrayEquals(bytes, written);
      assertEquals(4, b.writeBytesTo(written, 1, 4));
      assertArrayEquals(bytes, written);
  }
}