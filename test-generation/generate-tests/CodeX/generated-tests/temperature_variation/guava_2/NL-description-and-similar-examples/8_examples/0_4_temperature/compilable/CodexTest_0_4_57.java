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


public class CodexTest_0_4_57 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    HashCode hashCode = Hashing.sha1().hashBytes(new byte[10]);
    assertEquals(5, hashCode.writeBytesTo(dest, 0, dest.length));
    assertEquals(5, hashCode.writeBytesTo(dest, 1, dest.length - 1));
    assertEquals(5, hashCode.writeBytesTo(dest, 2, dest.length - 2));
    assertEquals(5, hashCode.writeBytesTo(dest, 3, dest.length - 3));
    assertEquals(5, hashCode.writeBytesTo(dest, 4, dest.length - 4));
    assertEquals(4, hashCode.writeBytesTo(dest, 5, dest.length - 5));
    assertEquals(3, hashCode.writeBytesTo(dest, 6, dest.length - 6));
    assertEquals(2, hashCode.writeBytesTo(dest, 7, dest.length - 7));
    assertEquals(1, hashCode.writeBytesTo(dest, 8, dest.length - 8));
    assertEquals(0, hashCode.writeBytesTo(dest, 9, dest.length - 9));
    assertEquals(0, hashCode.writeBytesTo(dest, 10, dest.length - 10));
  }
}