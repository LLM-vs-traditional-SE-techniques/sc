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


public class CodexTest_0_8_17 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[8];
    long value = 0x3322110099887766L;
    long value2 = 0x667788990011;
    long value3 = 0x6677889900113322L;
    BitArray ba = BitArray.create(Long.SIZE, value);
    BitArray ba2 = BitArray.create(32, value2);
    BitArray ba3 = BitArray.create(64, value3);
    ba.writeBytesTo(bytes, 0, 8);
    assertEquals(0x3322110099887766L, ByteBuffer.wrap(bytes).getLong());
    ba2.writeBytesTo(bytes, 0, 4);
    assertEquals(0x66778899L, ByteBuffer.wrap(bytes).getInt());
    ba3.writeBytesTo(bytes, 0, 8);
    assertEquals(0x6677889900113322L, ByteBuffer.wrap(bytes).getLong());
  }
}