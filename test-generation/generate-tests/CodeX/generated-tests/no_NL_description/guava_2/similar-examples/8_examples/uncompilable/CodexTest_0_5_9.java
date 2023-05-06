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


public class CodexTest_0_5_9 { 
  @Test
  public void testToByteArray() {
    byte[] expected = {(byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x9A,
        (byte) 0xBC, (byte) 0xDE, (byte) 0xF0};
    byte[] actual = new byte[8];
    HashCode hashCode = fromInt(0x12345678);
    int bytesWritten = hashCode.writeBytesTo(actual, 0, 8);
    assertEquals(8, bytesWritten);
    assertEquals(HashCode.fromBytes(expected), HashCode.fromBytes(actual));
  }
}