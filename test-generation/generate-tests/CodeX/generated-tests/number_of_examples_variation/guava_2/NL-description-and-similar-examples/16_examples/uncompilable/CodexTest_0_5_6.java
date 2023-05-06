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


public class CodexTest_0_5_6 { 
  @Test
  public void testWriteBytesTo_lessThanByte() {
    byte[] dest = new byte[2];
    BitArray array = new BitArray(new long[] {0x1L << 6}, 7);
    assertEquals(0, array.writeBytesTo(dest, 0, 0));
    assertEquals(0x40, dest[0]);
    assertEquals(0, array.writeBytesTo(dest, 0, 1));
    assertEquals(0x40, dest[0]);
    assertEquals(0, dest[1]);
  }
}