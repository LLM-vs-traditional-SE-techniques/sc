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


public class CodexTest_0_2_32 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    int offset = 1;
    int maxLength = 6;
    int length = bitArray.writeBytesTo(dest, offset, maxLength);
    assertEquals(6, length);
    assertEquals(0, dest[0]);
    assertEquals(0, dest[7]);
    assertEquals(0, dest[6]);
    assertEquals(0, dest[5]);
    assertEquals(0, dest[4]);
    assertEquals(0, dest[3]);
    assertEquals(0, dest[2]);
    assertEquals(0, dest[1]);
  }
}