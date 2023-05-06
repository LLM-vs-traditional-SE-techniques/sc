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


public class CodexTest_0_6_64 { 
  @Test
  public void testWriteBytesTo() {
    byte[] resultBytes = new byte[3];
    BloomFilter<Integer> filter = BloomFilter.create(Funnels.integerFunnel(), 100);
    filter.put(1);
    filter.put(2);
    filter.writeBytesTo(resultBytes, 0, 3);
    byte[] expectedBytes = new byte[3];
    byte[] rawBytes = filter.bits().toByteArray();
    System.arraycopy(rawBytes, 0, expectedBytes, 0, 3);
    assertTrue(Arrays.equals(resultBytes, expectedBytes));
  }
}