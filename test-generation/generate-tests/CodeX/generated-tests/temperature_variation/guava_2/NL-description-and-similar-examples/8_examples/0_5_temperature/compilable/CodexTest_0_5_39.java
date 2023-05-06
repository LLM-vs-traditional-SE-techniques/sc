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


public class CodexTest_0_5_39 { 
  @Test
  public void testWriteBytesTo() {
    HashCode hashCode = Hashing.sha1().hashLong(42);
    byte[] bytes = new byte[hashCode.bits() / 8];
    int numBytes = hashCode.writeBytesTo(bytes, 0, bytes.length);
    assertEquals("Wrong number of bytes written", bytes.length, numBytes);
    assertEquals("Wrong hash code", hashCode, HashCode.fromBytes(bytes));
  }
}