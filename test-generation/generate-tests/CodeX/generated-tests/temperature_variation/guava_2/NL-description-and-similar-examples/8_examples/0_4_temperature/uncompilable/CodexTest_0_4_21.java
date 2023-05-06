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


public class CodexTest_0_4_21 { 
  @Test
    public void testWriteBytesTo() {
    byte[] dest = new byte[3];
    int length = new BitArray(new int[] {0x12345678}, 32).writeBytesTo(dest, 0, 3);
    assertEquals(3, length);
    assertArrayEquals(new byte[] {0x12, 0x34, 0x56}, dest);
  }
}