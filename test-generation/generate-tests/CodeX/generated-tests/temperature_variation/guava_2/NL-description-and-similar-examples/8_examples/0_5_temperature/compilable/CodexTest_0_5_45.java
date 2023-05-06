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


public class CodexTest_0_5_45 { 
  @Test
  public void testWriteBytesTo() {
    HashCode hash = Hashing.md5().hashLong(42);
    byte[] dest = new byte[16];
    assertEquals(16, hash.writeBytesTo(dest, 0, 17));
    assertEquals(16, hash.writeBytesTo(dest, 0, 16));
    assertEquals(12, hash.writeBytesTo(dest, 0, 12));
    assertEquals(12, hash.writeBytesTo(dest, 4, 12));
    assertEquals(12, hash.writeBytesTo(dest, 4, 16));
    assertEquals(4, hash.writeBytesTo(dest, 12, 4));
    assertEquals(4, hash.writeBytesTo(dest, 12, 8));
    try {
      hash.writeBytesTo(dest, 12, 5);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      hash.writeBytesTo(dest, 13, 4);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
    try {
      hash.writeBytesTo(dest, 0, -1);
      fail();
    } catch (IndexOutOfBoundsException expected) {
    }
  }
}