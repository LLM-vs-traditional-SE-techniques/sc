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


public class CodexTest_0_9_55 { 
  @Test
  public void testWriteBytesToHandlesGivenDestinationWithUsedBytes() {
    HashCode hash = Hashing.md5().hashString("foo", Charsets.US_ASCII);
    byte[] dest = TestUtils.hashToByteArray(hash);
    byte[] returnedDest = TestUtils.copyByteArray(dest);
    int maxLength = 16; // MD5 is always 16 bytes long
    int actualLength = hash.writeBytesTo(returnedDest, 0, maxLength);
    assertEquals(maxLength, actualLength);
    assertArrayEquals(dest, returnedDest);
  }
}