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


public class CodexTest_0_4_5 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    HashCode hashCode = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    int maxLength = hashCode.bits() / 8;
    int numBytesWritten = hashCode.writeBytesTo(dest, 0, maxLength);
    assertEquals(maxLength, numBytesWritten);
    assertEquals(hashCode, HashCode.fromBytes(dest, 0, maxLength));
  }
}