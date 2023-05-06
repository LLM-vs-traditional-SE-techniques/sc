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


public class CodexTest_0_2_10 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int numBytesWritten = bitArray.writeBytesTo(dest, 0, dest.length);
    assertEquals(10, numBytesWritten);
    assertEquals(0, dest[0]);
    assertEquals(1, dest[1]);
    assertEquals(2, dest[2]);
    assertEquals(3, dest[3]);
    assertEquals(4, dest[4]);
    assertEquals(5, dest[5]);
    assertEquals(6, dest[6]);
    assertEquals(7, dest[7]);
    assertEquals(8, dest[8]);
    assertEquals(9, dest[9]);
  }
}