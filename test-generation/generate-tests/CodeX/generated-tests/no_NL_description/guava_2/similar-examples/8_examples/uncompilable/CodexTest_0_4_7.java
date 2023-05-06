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


public class CodexTest_0_4_7 { 
  @Test
  public void testWriteBytesTo_WithOffset() {
    byte[] dest = new byte[4];
    dest[0] = 1;
    dest[1] = 2;
    dest[2] = 3;
    dest[3] = 4;
    int offset = 1;
    int maxLength = 2;
    int result = hashCode.writeBytesTo(dest, offset, maxLength);
    assertEquals(2, result);
    assertEquals(1, dest[0]);
    assertEquals(0x12, dest[1]);
    assertEquals(0x34, dest[2]);
    assertEquals(4, dest[3]);
  }
}