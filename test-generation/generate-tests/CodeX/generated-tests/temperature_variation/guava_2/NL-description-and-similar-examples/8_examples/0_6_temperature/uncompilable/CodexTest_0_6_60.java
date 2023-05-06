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


public class CodexTest_0_6_60 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    BitSet bitSet = new BitSet(8);
    bitSet.set(0);
    bitSet.set(3);
    bitSet.set(5);
    bitSet.set(7);
    int written = bitSet.writeBytesTo(dest, 0, 5);
    assertEquals(5, written);
    assertEquals((byte) 0b10101001, dest[0]);
    assertEquals((byte) 0b10000000, dest[1]);
    assertEquals((byte) 0b00000000, dest[2]);
    assertEquals((byte) 0b00000000, dest[3]);
    assertEquals((byte) 0b00000000, dest[4]);
  }
}