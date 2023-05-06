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


public class CodexTest_0_6_16 { 
  @Test
  public void testHasher() {
    Hasher hasher = Hashing.sha256().newHasher(3);
    hasher.putByte((byte) 0);
    hasher.putByte((byte) 1);
    hasher.putByte((byte) 2);
    byte[] expected = {(byte) 0xba, (byte) 0x78, (byte) 0x16, (byte) 0xbf, (byte) 0x8f, (byte) 0x01, (byte) 0xcf, (byte) 0xea,
        (byte) 0x41, (byte) 0x41, (byte) 0x40, (byte) 0xde, (byte) 0x5d, (byte) 0xae, (byte) 0x22, (byte) 0x23, (byte) 0xb0,
        (byte) 0x03, (byte) 0x61, (byte) 0xa3, (byte) 0x96, (byte) 0x17, (byte) 0x7a, (byte) 0x9c, (byte) 0xb4, (byte) 0x10,
        (byte) 0xff, (byte) 0x61, (byte) 0xf2, (byte) 0x00, (byte) 0x15, (byte) 0xad};
    assertEquals(HashCode.fromBytes(expected), hasher.hash());
  }
}