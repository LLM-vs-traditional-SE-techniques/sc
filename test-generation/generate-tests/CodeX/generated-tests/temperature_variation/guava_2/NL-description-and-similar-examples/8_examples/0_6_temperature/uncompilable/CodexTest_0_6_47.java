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


public class CodexTest_0_6_47 { 
  @Test
  public void testWriteBytesTo() {
    BloomFilter<String> filter = BloomFilter.create(Funnels.stringFunnel(UTF_8), 100);
    filter.put("foo");
    byte[] dest = new byte[100];
    int writtenBytes = filter.writeBytesTo(dest, 0, 100);
    assertEquals(12, writtenBytes);
    byte[] expected = new byte[12];
    ByteBuffer byteBuffer = ByteBuffer.wrap(expected);
    byteBuffer.putInt(100);
    byteBuffer.putInt(12);
    byteBuffer.putLong(0x8000000000000000L);
    byteBuffer.putLong(0x4000000000000000L);
    byteBuffer.putLong(0x2000000000000000L);
    byteBuffer.putLong(0x1000000000000000L);
    byteBuffer.putLong(0x0800000000000000L);
    byteBuffer.putLong(0x0400000000000000L);
    byteBuffer.putLong(0x0200000000000000L);
    byteBuffer.putLong(0x0100000000000000L);
    byteBuffer.putLong(0x0080000000000000L);
    byteBuffer.putLong(0x0040000000000000L);
    byteBuffer.putLong(0x0020000000000000L);
    assertArrayEquals(expected, dest);
  }
}