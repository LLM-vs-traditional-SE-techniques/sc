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


public class CodexTest_0_6_5 { 
  @Test
    public void testWriteBytesTo() {
    byte[] dest = new byte[20];
    int offset = 5;
    int maxLength = 10;
    HashCode hashCode = Hashing.sha1().hashBytes(new byte[20]);
    int numBytes = hashCode.writeBytesTo(dest, offset, maxLength);
    assertEquals(10, numBytes);
    assertEquals(0, dest[0]);
    assertEquals(0, dest[1]);
    assertEquals(0, dest[2]);
    assertEquals(0, dest[3]);
    assertEquals(0, dest[4]);
    assertEquals(hashCode.asBytes()[0], dest[5]);
    assertEquals(hashCode.asBytes()[1], dest[6]);
    assertEquals(hashCode.asBytes()[2], dest[7]);
    assertEquals(hashCode.asBytes()[3], dest[8]);
    assertEquals(hashCode.asBytes()[4], dest[9]);
    assertEquals(0, dest[10]);
    assertEquals(0, dest[11]);
    assertEquals(0, dest[12]);
    assertEquals(0, dest[13]);
    assertEquals(0, dest[14]);
  }
}