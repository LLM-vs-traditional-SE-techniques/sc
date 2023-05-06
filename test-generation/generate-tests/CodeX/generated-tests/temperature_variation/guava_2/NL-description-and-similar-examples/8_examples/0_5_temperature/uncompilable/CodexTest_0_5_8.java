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


public class CodexTest_0_5_8 { 
  @Test
  public void testWriteBytesTo() {
    for (int i = 0; i < 100; i++) {
      byte[] bytes = new byte[i];
      BitArray bits = new BitArray(i);
      for (int j = 0; j < i; j++) {
        bits.set(j, j % 2 == 0);
      }
      int length = bits.writeBytesTo(bytes, 0, i);
      assertEquals(i, length);
      for (int j = 0; j < i; j++) {
        assertEquals(j % 2 == 0, bytes[j] == 1);
      }
    }
  }
}