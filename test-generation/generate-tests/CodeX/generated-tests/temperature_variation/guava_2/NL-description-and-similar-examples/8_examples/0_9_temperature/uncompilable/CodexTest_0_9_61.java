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


public class CodexTest_0_9_61 { 
  @Test
  public void testWriteBytesTo() {
    byte[] expected = {(byte) 0x00, (byte) 0x00, (byte) 0x00};
    byte[] dest = new byte[3];
    Pointer ptr = Pointer.fromLong(0x1231L);
    byte pos = -1;
    try {
      pos = ptr.writeBytesTo(dest, 2, 3);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    pos = ptr.writeBytesTo(dest, 0, 1);
    assertEquals(1, pos);
    pos = ptr.writeBytesTo(dest, 0, 3);
    assertEquals(3, pos);
    assertEquals(expected, dest);
  }
}