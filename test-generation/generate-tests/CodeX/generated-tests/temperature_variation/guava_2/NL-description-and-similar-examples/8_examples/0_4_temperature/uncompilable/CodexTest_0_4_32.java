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


public class CodexTest_0_4_32 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[16];
    int bytesWritten = bitArray.writeBytesTo(dest, 0, 16);
    assertEquals(8, bytesWritten);
    assertEquals(0, dest[7]);
    assertEquals(0, dest[8]);
    assertEquals(0, dest[9]);
    assertEquals(0, dest[10]);
    assertEquals(0, dest[11]);
    assertEquals(0, dest[12]);
    assertEquals(0, dest[13]);
    assertEquals(0, dest[14]);
    assertEquals(0, dest[15]);
  }
}