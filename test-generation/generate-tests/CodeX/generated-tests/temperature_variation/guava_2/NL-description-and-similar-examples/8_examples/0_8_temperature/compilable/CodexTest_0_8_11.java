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


public class CodexTest_0_8_11 { 
  @Test
  public void testWriteBytes() {
    HashCode hash = Hashing.sha1().newHasher()
        .putInt(0)
        .putInt(1)
        .hash();
    byte[] dest = new byte[hash.bits() / 8];
    int bytesWritten = hash.writeBytesTo(dest, 0, dest.length);
    Assert.assertEquals(hash.bits() / 8, bytesWritten);
    for (int i = 0; i < hash.bits() / 8; i++) {
      Assert.assertEquals(hash.asBytes()[i], dest[i]);
    }
    // Write only some bytes to dest.
    bytesWritten = hash.writeBytesTo(dest, 0, hash.bits() / 8 - 1);
    Assert.assertEquals(hash.bits() / 8 - 1, bytesWritten);
    for (int i = 0; i < bytesWritten; i++) {
      Assert.assertEquals(hash.asBytes()[i], dest[i]);
    }
    // Write only one byte.
    bytesWritten = hash.writeBytesTo(dest, 0, 1);
    Assert.assertEquals(1, bytesWritten);
    Assert.assertEquals(hash.asBytes()[0], dest[0]);
    // Write only zero bytes.
    bytesWritten = hash.writeBytesTo(dest, 0, 0);
    Assert.assertEquals(0, bytesWritten);
  }
}