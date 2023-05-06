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


public class CodexTest_0_9_53 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[3];
    byte[] bytes1 =
        ByteBuffer.allocate(4).putInt(111222333).array(); // little endian
    int numBytesWritten1 = BloomFilter
        .create(Funnels.integerFunnel(), 1000) // filter has 32 bits - so it should only copy 4
        .writeBytesTo(dest, 0, 3);
    assertEquals(0, dest[0]);
    assertEquals(111222333 & 0x000000FF, dest[1] & 0x000000FF);
    assertEquals((111222333 & 0x0000FF00) >>> 8, dest[2] & 0x000000FF);
    assertEquals(3, numBytesWritten1);
}