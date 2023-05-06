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
  public void testWriteBytesTo_maxLengthTooShort() {
    byte[] dest = new byte[10];
    int maxLength = 5;
    int offset = 2;
    HashCode hash = Hashing.sha1().hashLong(0);
    int written = hash.writeBytesTo(dest, offset, maxLength);
    assertEquals(maxLength, written);
    assertEquals(hash.asBytes()[0], dest[offset]);
    assertEquals(hash.asBytes()[1], dest[offset + 1]);
    assertEquals(hash.asBytes()[2], dest[offset + 2]);
    assertEquals(hash.asBytes()[3], dest[offset + 3]);
    assertEquals(hash.asBytes()[4], dest[offset + 4]);
    assertEquals(0, dest[offset + 5]);
  }
}