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


public class CodexTest_0_7_71 { 
  @Test
  public void testWriteBytesToWithOffset() {
    byte[] dest = new byte[17];
    BloomFilter<Integer> filter = BloomFilter.create(Funnels.integerFunnel(), 100);
    int writtenBytes = filter.writeBytesTo(dest, 3, 7);
    assertEquals("The number of bytes written is wrong", 7, writtenBytes);
    // The first 3 bytes should be 0
    for (int i = 0; i < 3; i++) {
      assertEquals("Byte " + i + " is not 0", 0, dest[i]);
    }
    // The last 7 bytes should be equal to the first 7 bytes of the
    // bits()/8 written bytes
    for (int i = 0; i < 7; i++) {
      assertEquals("Byte " + (3 + i) + " is not correct",
          filter.bits().toByteArray()[i], dest[3 + i]);
    }
  }
}