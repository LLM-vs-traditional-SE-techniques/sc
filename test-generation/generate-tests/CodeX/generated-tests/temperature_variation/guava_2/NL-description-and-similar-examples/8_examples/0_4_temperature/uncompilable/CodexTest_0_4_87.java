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


public class CodexTest_0_4_87 { 
  @Test
  public void testWriteBytesTo_smallerThanOneByte() {
    byte[] dest = new byte[1];
    BitArray bits = new BitArray(new int[] { 1 }, 7);
    int written = bits.writeBytesTo(dest, 0, 1);
    assertEquals(1, written);
    assertEquals(0b00000001, dest[0]);
  }
}