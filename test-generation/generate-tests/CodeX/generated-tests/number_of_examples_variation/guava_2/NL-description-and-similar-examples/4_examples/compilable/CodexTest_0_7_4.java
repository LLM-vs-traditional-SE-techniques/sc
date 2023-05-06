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


public class CodexTest_0_7_4 { 
  @Test
  public void testRoundTripHashCodeUsingBytes() {
    HashCode hash1 = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    byte[] bytes = new byte[hash1.bits() / 8];
    hash1.writeBytesTo(bytes, 0, bytes.length);
    HashCode hash2 = HashCode.fromBytes(bytes);
    assertEquals(hash1, hash2);
  }
}