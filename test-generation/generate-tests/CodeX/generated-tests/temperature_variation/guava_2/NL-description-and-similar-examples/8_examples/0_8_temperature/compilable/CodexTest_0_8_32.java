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


public class CodexTest_0_8_32 { 
  @Test
  public void testWriteBytesToSmallArrayAtOffset() {
    byte[] dest = new byte[10];
    HashCode hashCode =
        Hashing.sha1().newHasher().putLong(0x123456789abcdef0L).putLong(0x23456789abcdef01L).hash();
    int bytesWritten = hashCode.writeBytesTo(dest, 2, 8);
    assertEquals(10, bytesWritten);
    byte[] expected = {
      (byte) 0x00, (byte) 0x00, (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78,
      (byte) 0x9a, (byte) 0xbc, (byte) 0xde, (byte) 0xf0
    };
    assertEquals(expected, dest);
  }
}