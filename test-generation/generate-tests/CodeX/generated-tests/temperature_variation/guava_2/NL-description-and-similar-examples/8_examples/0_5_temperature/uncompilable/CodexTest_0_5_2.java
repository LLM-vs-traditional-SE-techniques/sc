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


public class CodexTest_0_5_2 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    // This should be the same as the number of bytes in the hash.
    int bytesWritten = hashCode.writeBytesTo(dest, 0, dest.length);
    byte[] hashBytes = hashCode.asBytes();
    assertEquals(hashBytes.length, bytesWritten);
    assertEquals(hashBytes.length, dest.length);
    assertArrayEquals(hashBytes, dest);
  }
}