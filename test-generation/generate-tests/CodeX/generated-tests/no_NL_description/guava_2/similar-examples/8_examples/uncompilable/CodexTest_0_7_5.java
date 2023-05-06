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


public class CodexTest_0_7_5 { 
  @Test
  private void testWriteBytesTo() {
    byte[] dest = new byte[20];
    int maxLength = 8;
    new IntHashCode(0x12345678).writeBytesTo(dest, 4, maxLength);
    assertEquals(0x12, dest[4] & 0xFF);
    assertEquals(0x34, dest[5] & 0xFF);
    assertEquals(0x56, dest[6] & 0xFF);
    assertEquals(0x78, dest[7] & 0xFF);
    for (int i = 0; i < 4; i++) {
      assertEquals(0, dest[i]);
    }
    for (int i = 8; i < 20; i++) {
      assertEquals(0, dest[i]);
    }
  }
}