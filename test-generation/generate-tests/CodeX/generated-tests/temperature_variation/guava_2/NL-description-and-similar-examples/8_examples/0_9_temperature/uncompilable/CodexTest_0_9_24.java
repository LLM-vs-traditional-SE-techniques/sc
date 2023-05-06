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


public class CodexTest_0_9_24 { 
  @Test
  public void testSetRandomLong() {
    CRC32 crc32 = new CRC32();
    for (int i = 0; i < 1000; ++i) {
      ByteBuffer b = ByteBuffer.allocate(Long.SIZE / 8);
      b.order(ByteOrder.LITTLE_ENDIAN);
      b.putLong(i);
      crc32.update(b.array(), 0, b.remaining());
      kv.setRandom(1);
      kv.writeBytesTo(b.array(), 0, Long.SIZE / 8);
      assertEquals(Long.SIZE / 8, kv.writeBytesTo(new byte[8], 0, 8));
      assertEquals(Long.SIZE / 8, kv.writeFixedBytesTo(new byte[8], 0));
      assertEquals(Long.SIZE / 8, kv.writeVarBytesTo(new byte[8], 0));
      crc32.update(b.array(), 0, b.remaining());
      assertEquals(crc32.getValue(), kv.getCrc32c());
    }
  }
}