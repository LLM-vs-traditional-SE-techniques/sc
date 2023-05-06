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


public class CodexTest_0_8_5 { 
  @Test
    public void testWriteBytesTo() {
    int numBytes = 3;
    BloomFilter<String> filter = BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8), numBytes * 8);
    byte[] expected = new byte[3];
    for (int i = 0; i < 3; i++) {
      expected[i] = (byte) i;
    }
    filter.put("bar");
    byte[] actual = new byte[numBytes];
    filter.writeBytesTo(actual, 0, numBytes);
    assertTrue(Arrays.equals(expected, actual));
  }
}