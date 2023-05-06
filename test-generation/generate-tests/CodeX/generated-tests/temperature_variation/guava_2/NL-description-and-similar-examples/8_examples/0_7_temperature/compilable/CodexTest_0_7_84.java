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


public class CodexTest_0_7_84 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[9];
    assertEquals(8, HashCode.fromInt(0x01020304).writeBytesTo(dest, 0, 9));
    assertEquals(Ints.toByteArray(0x01020304), Arrays.copyOfRange(dest, 0, 8));
    assertEquals(0x55, dest[8]);
    assertEquals(4, HashCode.fromInt(0x01020304).writeBytesTo(dest, 1, 9));
    assertEquals(Ints.toByteArray(0x01020304), Arrays.copyOfRange(dest, 1, 5));
    assertEquals(0x55, dest[0]);
    assertEquals(0x55, dest[5]);
    assertEquals(0x55, dest[8]);
  }
}