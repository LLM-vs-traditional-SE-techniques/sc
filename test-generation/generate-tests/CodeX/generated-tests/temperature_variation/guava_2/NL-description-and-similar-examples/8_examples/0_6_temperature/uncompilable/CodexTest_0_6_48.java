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


public class CodexTest_0_6_48 { 
  @Test
  public void testWriteBytesTo() {
    HashCode hash = Hashing.sha256().hashLong(0x123456789ABCDL);
    byte[] dest = new byte[hash.bits() / 8];
    int bytesWritten = hash.writeBytesTo(dest, 0, dest.length);
    assertEquals(dest.length, bytesWritten);
    byte[] expected = new byte[] {
        (byte) 0x12, (byte) 0x34, (byte) 0x56, (byte) 0x78, (byte) 0x9a, (byte) 0xbc, (byte) 0xde,
        (byte) 0xf0
    };
    assertEquals(expected, dest);
  } 
  
Input: public String toString() {
    StringBuilder sb = new StringBuilder(3 + bits() * 4 / 3);
    sb.append("Hex(").append(bits()).append(")");
    sb.append("\"");
    for (int i = 0; i < bits(); i += 4) {
      int digit = ((bits() - i) >= 4)
          ? (((int) (longBits >>> (bits() - 4 - i))) & 0x0f)
          : (((int) (longBits << (i + 4 - bits()))) & 0x0f);
      sb.append(HEX_DIGITS[digit]);
    }
    sb.append("\"");
    return sb.toString();
  }
Output:
  public static void testToString() {
    String expected = "Hex(128)\"123456789ABCDEF0123456789ABCDEF0123456789ABCDEF0123456789ABCDEF\"";
    String actual = Hashing.sha512().hashLong(0x123456789ABCDEFL).toString();
    assertEquals(expected, actual);
  }
}