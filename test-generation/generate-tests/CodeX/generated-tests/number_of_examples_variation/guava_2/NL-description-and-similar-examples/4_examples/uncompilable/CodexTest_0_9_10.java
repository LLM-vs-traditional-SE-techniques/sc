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
    byte[] buf = new byte[7];
    assertEquals(7, BitSet.valueOf(BYTES1).writeBytesTo(buf, 0, Integer.MAX_VALUE));
    assertTrue(Arrays.equals(BYTES1, buf));
    buf = new byte[50];
    assertEquals(5, BitSet.valueOf(BYTES1).writeBytesTo(buf, 0, Integer.MAX_VALUE));
    assertEquals(10, BitSet.valueOf(BYTES2).writeBytesTo(buf, 3, 500));
    byte[] expected = new byte[50];
    System.arraycopy(BYTES1, 0, expected, 0, 5);
    System.arraycopy(BYTES2, 0, expected, 3, 10);
    assertTrue(Arrays.equals(expected, buf));
    buf = new byte[5];
    assertEquals(5, BitSet.valueOf(BYTES1).writeBytesTo(buf, 0, Integer.MAX_VALUE));
    assertTrue(Arrays.equals(BYTES1, buf));
  }

}