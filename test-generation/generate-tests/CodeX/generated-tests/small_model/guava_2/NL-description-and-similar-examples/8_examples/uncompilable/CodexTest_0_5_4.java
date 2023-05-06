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


public class CodexTest_0_5_4 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[3];
    ByteBuffer buffer = ByteBuffer.wrap(dest);
    buffer.putInt(1);
    buffer.putInt(2);
    buffer.putInt(3);
    assertEquals(0, buffer.position());
    assertEquals(12, buffer.limit());
    assertEquals(3, buffer.capacity());
    assertEquals(3, buffer.remaining());
    assertEquals(3, buffer.limit());
    assertEquals(12, buffer.position());
    assertEquals(3, buffer.limit());
    assertEquals(3, buffer.capacity());
    assertEquals(3, buffer.remaining());
    assertEquals(3, dest.length);
    assertEquals(1, dest[0]);
    assertEquals(2, dest[1]);
    assertEquals(3, dest[2]);
  }
}