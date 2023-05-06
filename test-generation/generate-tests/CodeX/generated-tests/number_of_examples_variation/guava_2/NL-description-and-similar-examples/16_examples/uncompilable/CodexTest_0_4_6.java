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


public class CodexTest_0_4_6 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 3;
    int numBytes = 5;
    int maxLength = 7;
    byte[] bytes = new byte[] {0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a};
    BloomFilter<Integer> filter = BloomFilter.create(Funnels.integerFunnel(), 10, 0.1);
    for (int i = 0; i < 10; i++) {
      filter.put(i);
    }
    filter.writeBytesTo(dest, offset, maxLength);
    for (int i = 0; i < numBytes; i++) {
      assertEquals(bytes[i], dest[offset + i]);
    }
  }
}