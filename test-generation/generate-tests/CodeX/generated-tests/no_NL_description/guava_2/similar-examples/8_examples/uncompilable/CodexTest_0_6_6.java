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


public class CodexTest_0_6_6 { 
  @Test
  public void testWriteBytesTo() {
    HashCode hash = HASH_CODE;
    byte[] dest = new byte[hash.bits() / 8 + 1];
    int bytesWritten = hash.writeBytesTo(dest, 1, dest.length - 1);
    assertEquals(hash.bits() / 8, bytesWritten);
    byte[] expected = new byte[1 + hash.bits() / 8];
    expected[0] = 0;
    System.arraycopy(hash.asBytes(), 0, expected, 1, hash.bits() / 8);
    assertTrue(Arrays.equals(expected, dest));
  }
}