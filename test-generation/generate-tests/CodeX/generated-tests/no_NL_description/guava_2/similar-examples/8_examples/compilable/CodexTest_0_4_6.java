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


public class CodexTest_0_4_6 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    HashCode hash = Hashing.sha512().hashLong(0x123456789abcdef0L);
    int bytesWritten = hash.writeBytesTo(dest, 0, dest.length);
    assertEquals(4, bytesWritten);
    assertEquals(0xef, dest[0] & 0xff);
    assertEquals(0xcd, dest[1] & 0xff);
    assertEquals(0xab, dest[2] & 0xff);
    assertEquals(0x89, dest[3] & 0xff);
  }
}