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


public class CodexTest_0_7_8 { 
  @Test
  public static void testSerialize() throws Exception {
    for (int i = 0; i < 10; i++) {
      BloomFilter<String> filter = BloomFilter.create(Funnels.unencodedCharsFunnel(), i, 0.01);
      for (int j = 0; j < i; j++) {
        filter.put("" + j);
      }
      byte[] bytes = new byte[filter.expectedFpp() == 0 ? (i * 64) / 8 : filter.expectedDataLength()];
      filter.writeTo(ByteBuffer.wrap(bytes, 0, bytes.length));
      BloomFilter<String> deserialized = BloomFilter.readFrom(
          ByteBuffer.wrap(bytes, 0, bytes.length), Funnels.unencodedCharsFunnel());
      assertEquals(filter.expectedFpp(), deserialized.expectedFpp(), 0.01);
      assertEquals(filter.expectedNumEntries(), deserialized.expectedNumEntries());
      assertEquals(filter.expectedDataLength(), deserialized.expectedDataLength());
      assertEquals(filter.approximateElementCount(), deserialized.approximateElementCount());
      for (int j = 0; j < i; j++) {
        assertTrue(deserialized.mightContain("" + j));
      }
    }
  }
}