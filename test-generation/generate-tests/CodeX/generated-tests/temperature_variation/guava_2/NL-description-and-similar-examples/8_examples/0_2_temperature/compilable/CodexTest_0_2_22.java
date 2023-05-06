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


public class CodexTest_0_2_22 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    int offset = 2;
    int maxLength = 4;
    byte[] expected = new byte[8];
    expected[2] = (byte) 0x12;
    expected[3] = (byte) 0x34;
    expected[4] = (byte) 0x56;
    expected[5] = (byte) 0x78;
    HashCode hashCode = HashCode.fromBytes(new byte[] {0x12, 0x34, 0x56, 0x78, (byte) 0x9A, (byte) 0xBC, (byte) 0xDE, (byte) 0xF0});
    int length = hashCode.writeBytesTo(dest, offset, maxLength);
    assertEquals(4, length);
    assertEquals(HashCode.fromBytes(expected), HashCode.fromBytes(dest));
  }
}