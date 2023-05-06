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


public class CodexTest_0_4_97 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[5];
    int numBytesWritten = HashCode.fromInt(0x01020304).writeBytesTo(bytes, 1, 3);
    assertEquals(3, numBytesWritten);
    assertEquals(0x00, bytes[0]);
    assertEquals(0x01, bytes[1]);
    assertEquals(0x02, bytes[2]);
    assertEquals(0x03, bytes[3]);
    assertEquals(0x00, bytes[4]);
  }
}