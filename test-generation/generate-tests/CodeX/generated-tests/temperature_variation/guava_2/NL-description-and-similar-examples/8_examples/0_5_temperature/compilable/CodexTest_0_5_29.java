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


public class CodexTest_0_5_29 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[6];
    HashCode hashCode = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    int bytesWritten = hashCode.writeBytesTo(dest, 1, 3);
    assertEquals("Number of bytes written differs", 3, bytesWritten);
    assertEquals("Byte 0 differs", 0, dest[0]);
    assertEquals("Byte 1 differs", -56, dest[1]);
    assertEquals("Byte 2 differs", -102, dest[2]);
    assertEquals("Byte 3 differs", -47, dest[3]);
    assertEquals("Byte 4 differs", -118, dest[4]);
    assertEquals("Byte 5 differs", -123, dest[5]);
  }
}