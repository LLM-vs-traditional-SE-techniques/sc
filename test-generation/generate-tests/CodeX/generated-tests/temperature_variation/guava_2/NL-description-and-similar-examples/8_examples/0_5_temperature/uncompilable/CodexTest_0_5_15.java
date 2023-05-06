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


public class CodexTest_0_5_15 { 
  @Test
  public void testWriteBytesToImpl() {
    HashCode hashCode = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    byte[] bytes = new byte[hashCode.bits() / 8];
    int bytesWritten = hashCode.writeBytesTo(bytes, 0, bytes.length);
    assertEquals(bytes.length, bytesWritten);
    assertEquals(hashCode, HashCode.fromBytesNoCopy(bytes));
  }
}