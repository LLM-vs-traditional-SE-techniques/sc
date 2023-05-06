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


public class CodexTest_0_3_7 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    int offset = 1;
    int maxLength = 4;
    HashCode hashCode = Hashing.sha256().hashLong(42);
    int bytesWritten = hashCode.writeBytesTo(dest, offset, maxLength);
    assertEquals(4, bytesWritten);
    assertArrayEquals(new byte[] {0,
        (byte) 0xE3, (byte) 0xB0, (byte) 0xC4, (byte) 0x42,
        (byte) 0x98, (byte) 0xFC, (byte) 0x1C, (byte) 0x14}, dest);
  }
}