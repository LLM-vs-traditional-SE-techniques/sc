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


public class CodexTest_0_9_10 { 
  @Test
   public void testWriteBytesTo() {
    byte[] readback = new byte[7];
    // first wrap a few bits in an int
    int n = 0;
    n = n << 1;
    n = n | 0; // LSB
    n = n << 1;
    n = n | 1;
    n = n << 1;
    n = n | 0;
    n = n << 1;
    n = n | 1;
    // and write to array
    assertEquals(1,  (new BitArray(new int[]{n})).writeBytesTo(readback, 0, 1));
    // and read back
    assertTrue(readback[0] == 5);
    // more bits
    n = n << 1;
    n = n | 0;
    n = n << 1;
    n = n | 1;
    n = n << 1;
    n = n | 0;
    n = n << 1;
    n = n | 1;
    n = n << 1;
    n = n | 1;
    n = n << 1;
    n = n | 0;
}