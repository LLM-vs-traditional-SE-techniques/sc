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


public class CodexTest_0_7_88 { 
  @Test
  public void testWriteBytesTo() {
    byte[] d = new byte[42];
    HashCode hashCode = Hashing.sha1().hashLong(42);
    int numBytesWritten = hashCode.writeBytesTo(d, 12, 4);
    assertEquals(4, numBytesWritten);
    int i = 0;
    for (byte b : hashCode.asBytes()) {
      if (i >= 12 && i < 16) {
        assertEquals(b, d[i]);
      } else {
        assertEquals(0, d[i]);
      }
      i++;
    }
    for (; i < d.length; i++) {
      assertEquals(0, d[i]);
    }
  }
}