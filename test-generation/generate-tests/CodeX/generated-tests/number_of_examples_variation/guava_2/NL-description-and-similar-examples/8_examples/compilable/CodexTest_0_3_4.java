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


public class CodexTest_0_3_4 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    int offset = 1;
    int maxLength = 3;
    HashCode hashCode = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    int actualLength = hashCode.writeBytesTo(dest, offset, maxLength);
    assertEquals(maxLength, actualLength);
    assertEquals(0, dest[0]);
    assertEquals(0x9b, dest[1] & 0xff);
    assertEquals(0x98, dest[2] & 0xff);
    assertEquals(0x58, dest[3] & 0xff);
  }
}