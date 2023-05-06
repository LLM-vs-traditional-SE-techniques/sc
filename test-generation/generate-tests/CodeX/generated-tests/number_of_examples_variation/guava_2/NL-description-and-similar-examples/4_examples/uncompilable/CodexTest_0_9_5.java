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


public class CodexTest_0_9_5 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    BitArray bitArray = BitArray.createWithoutCopy(8);
    bitArray.setBits(0, 64);
    assertEquals(bitArray.writeBytesTo(dest, 0, 8), 8);
    assertTrue(Arrays.equals(dest, new byte[] { (byte) 0xff, (byte) 0xff,
        (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff }));
    bitArray = BitArray.createWithoutCopy(8);
    assertEquals(bitArray.writeBytesTo(dest, 0, 8), 8);
    assertTrue(Arrays.equals(dest, new byte[] { 0, 0, 0, 0, 0, 0, 0, 0 }));
  }
  
  public void testWriteBytesToLargeArray() {
    byte[] dest = new byte[0];
    BitArray bitArray = BitArray.createWithoutCopy(Long.SIZE);
    for (int i = 0; i < Long.SIZE; i++) {
      bitArray.setBit(i, true);
    }
    int res = bitArray.writeBytesTo(dest, 0, dest.length);
    assertEquals(res, Long.SIZE / 8);
    assertTrue(Arrays.equals(dest, new byte[0]));
  }
}
}