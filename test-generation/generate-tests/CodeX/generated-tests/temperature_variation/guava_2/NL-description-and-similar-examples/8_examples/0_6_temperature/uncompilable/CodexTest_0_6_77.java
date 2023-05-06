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


public class CodexTest_0_6_77 { 
  @Test
  public void testWriteBytesTo() {
    BitArray bitArray = new BitArray(new byte[]{0x0f, 0x0f}, 8);
    byte[] dest = new byte[4];
    int size = bitArray.writeBytesTo(dest, 1, 3);
    assertEquals(3, size);
    assertEquals(0x00, dest[0]);
    assertEquals(0x0f, dest[1]);
    assertEquals(0x0f, dest[2]);
    assertEquals(0x00, dest[3]);
  }
}