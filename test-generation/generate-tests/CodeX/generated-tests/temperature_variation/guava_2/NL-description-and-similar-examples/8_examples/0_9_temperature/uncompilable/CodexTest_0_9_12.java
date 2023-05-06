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


public class CodexTest_0_9_12 { 
  @Test
  public void testWriteBytesTo() {
    byte[] data = GuavaTests.getTestData_byteArray();
    byte[] bs = Arrays.copyOf(data, data.length);
    for (int i = 0; i < bs.length; i++) {
      byte[] slice = new byte[i];
      int count = Hashing.murmur3_32().hashBytes(bs, 0, bs.length).writeBytesTo(slice, 0, i);
      String msg = String.format("iteration %s, count = %s, i = %s, bs.length = %s",
          i, count, i, bs.length);
      assertEquals(slice.length, count);
      assertEquals(msg, asList(data).subList(0, count), asList(slice));
    }
    byte[] truncated = Arrays.copyOf(bs, bs.length / 3);
    int count = Hashing.murmur3_128().hashBytes(bs, 0, bs.length).writeBytesTo(truncated, 0,
        truncated.length);
    assertEquals(truncated.length, count);
    assertEquals(asList(truncated), asList(bs).subList(0, truncated.length));
  }
}