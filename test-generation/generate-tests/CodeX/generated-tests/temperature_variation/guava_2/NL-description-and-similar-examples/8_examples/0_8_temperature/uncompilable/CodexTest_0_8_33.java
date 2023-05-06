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


public class CodexTest_0_8_33 { 
  @Test
  public void testSha256_normal_maxLength() {
    Hasher hasher = Hashing.sha256().newHasher();
    hasher.putBytes(TEST_SEQUENCE);
    HashCode hash = hasher.hash();
    byte[] bytes = {0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
        0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
    byte[] bytesCopy = Arrays.copyOf(bytes, bytes.length);
    int writtenBytes = hash.writeBytesTo(bytes, 0, 16);
    assertEquals(16, writtenBytes);
    assertFalse(Arrays.equals(bytesCopy, bytes));
    assertEquals(new HashCode(bytesCopy, 0, 16), hash);
  }
}