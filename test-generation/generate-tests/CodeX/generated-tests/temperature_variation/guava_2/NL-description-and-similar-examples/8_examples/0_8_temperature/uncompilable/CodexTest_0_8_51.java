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


public class CodexTest_0_8_51 { 
  @Test
  public void testPutBytes() {
    byte[] bytes = new byte[4];
    for (int i = 0; i < 100; i++) {
      BitArray bitArray = new BitArray();
      int item = r.nextInt();
      for (int j = 0; j < 32; j++) {
        bitArray = bitArray.add(item & (1 << j) != 0);
      }
      bitArray.putBytes(bytes, 0, 4);
      for (int k = 0; k < 4; k++) {
        assertEquals(getByte(item, k), bytes[3 - k]);
      }
    }
  }
}