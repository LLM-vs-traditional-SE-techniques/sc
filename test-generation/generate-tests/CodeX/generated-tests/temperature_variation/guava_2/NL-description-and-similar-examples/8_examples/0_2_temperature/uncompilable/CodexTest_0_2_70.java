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


public class CodexTest_0_2_70 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    BitArray bits = new BitArray(10);
    bits.set(0, true);
    bits.set(1, false);
    bits.set(2, true);
    bits.set(3, false);
    bits.set(4, true);
    bits.set(5, false);
    bits.set(6, true);
    bits.set(7, false);
    bits.set(8, true);
    bits.set(9, false);
    int written = bits.writeBytesTo(dest, 0, 10);
    assertEquals(10, written);
    assertEquals(0x55, dest[0]);
  }
}