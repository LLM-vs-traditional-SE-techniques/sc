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


public class CodexTest_0_5_83 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    BitArray ba = new BitArray(4);
    ba.setBit(0, true);
    ba.setBit(1, false);
    ba.setBit(2, true);
    ba.setBit(3, true);
    int written = ba.writeBytesTo(dest, 0, 5);
    assertEquals(4, written);
    assertEquals(0b1011, dest[0]);
    assertEquals(0b0000, dest[1]);
    assertEquals(0b0000, dest[2]);
    assertEquals(0b0000, dest[3]);
    assertEquals(0b0000, dest[4]);
  }
}