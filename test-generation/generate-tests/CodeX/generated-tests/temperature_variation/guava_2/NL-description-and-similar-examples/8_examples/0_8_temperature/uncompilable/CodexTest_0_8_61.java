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


public class CodexTest_0_8_61 { 
  @Test
  public void testWriteBytesToShouldWriteBits() {
    byte[] dest = new byte[4];
    BitArray arr = new BitArray();
    arr.set(0, true);
    arr.set(1, true);
    arr.set(8, true);
    arr.set(44, true);
    arr.set(45, true);
    arr.set(50, true);
    arr.set(63, true);
    arr.writeBytesTo(dest, 0, 4);
    assertEquals(1, dest[0]);
    assertEquals(3, dest[1]);
    assertEquals((byte) (1 << 6), dest[2]);
    assertEquals(1, dest[3]);
  }
}