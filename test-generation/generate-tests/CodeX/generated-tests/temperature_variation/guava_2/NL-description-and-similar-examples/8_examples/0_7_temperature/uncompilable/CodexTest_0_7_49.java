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


public class CodexTest_0_7_49 { 
  @Test
  public void testWriteBytesToArray1() {
    BitSet bs = new BitSet();
    bs.set(1);
    bs.set(2);
    bs.set(31);
    bs.set(32);
    byte[] dest = new byte[1024];
    int written = bs.writeBytesTo(dest, 1, 3);
    assertEquals(3, written);
    assertEquals((byte) 0x80, dest[1]);
    assertEquals((byte) 0xC0, dest[2]);
    assertEquals((byte) 0x00, dest[3]);
  }
}