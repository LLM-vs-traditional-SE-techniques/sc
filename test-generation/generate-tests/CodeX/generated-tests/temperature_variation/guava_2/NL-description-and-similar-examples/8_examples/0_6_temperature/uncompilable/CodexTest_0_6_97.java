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


public class CodexTest_0_6_97 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[2];
    int written = Bits.putBytes(0xABCD, bytes, 0, bytes.length);
    assertEquals(2, written);
    byte[] expected = new byte[] { (byte) 0xCD, (byte) 0xAB };
    assertTrue(Arrays.equals(expected, bytes));
  }
}