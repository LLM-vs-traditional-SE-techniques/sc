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


public class CodexTest_0_6_2 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    assertEquals(4, hashCode.writeBytesTo(dest, 0, 4));
    assertEquals(hashCode, HashCode.fromBytes(dest));
    assertEquals(4, hashCode.writeBytesTo(dest, 0, 5));
    assertEquals(hashCode, HashCode.fromBytes(dest));
    assertEquals(1, hashCode.writeBytesTo(dest, 0, 1));
    assertEquals(HashCode.fromBytes(Arrays.copyOf(hashCode.asBytes(), 1)),
                 HashCode.fromBytes(dest));
    assertEquals(0, hashCode.writeBytesTo(dest, 0, 0));
    assertEquals(HashCode.fromBytes(new byte[0]),
                 HashCode.fromBytes(dest));
    assertEquals(0, hashCode.writeBytesTo(dest, 1, 0));
    assertEquals(HashCode.fromBytes(new byte[0]),
                 HashCode.fromBytes(dest));
  }
}