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


public class CodexTest_0_5_51 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    int numBytesWritten = new BigInteger("123456789").toByteArray().length;
    assertEquals(numBytesWritten, new BigInteger("123456789").writeBytesTo(dest, 1, dest.length - 1));
    byte[] expectedBytes = new byte[] {0, 0, -75, -56, -3, -22, -20, -13, -70, -21};
    assertTrue(Arrays.equals(expectedBytes, dest));
  }
}