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


public class CodexTest_0_4_94 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    BitArray array = new BitArray(new byte[] {0x33, 0x33, 0x33, 0x33, 0x33, 0x33, 0x33, 0x33});
    int bytesWritten = array.writeBytesTo(dest, 0, dest.length);
    assertEquals(10, bytesWritten);
    assertEquals(0x33, dest[0]);
    assertEquals(0x33, dest[1]);
    assertEquals(0x33, dest[2]);
    assertEquals(0x33, dest[3]);
    assertEquals(0x33, dest[4]);
    assertEquals(0x33, dest[5]);
    assertEquals(0x33, dest[6]);
    assertEquals(0x33, dest[7]);
    assertEquals(0x00, dest[8]);
    assertEquals(0x00, dest[9]);
  }
}