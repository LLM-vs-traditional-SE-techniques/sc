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


public class CodexTest_0_7_18 { 
  @Test
  public void testWriteBytes() {
    ImmutableBitArray ba = ImmutableBitArray.create(ByteBuffer.wrap(new byte[] {1}), 8);
    assertEquals("00000000000000000000000000000001", ba.toString());
    byte[] bytes = new byte[1];
    ba.writeBytesTo(bytes, 0, 1);
    assertArrayEquals(new byte[] {1}, bytes);
  }
  ```
}