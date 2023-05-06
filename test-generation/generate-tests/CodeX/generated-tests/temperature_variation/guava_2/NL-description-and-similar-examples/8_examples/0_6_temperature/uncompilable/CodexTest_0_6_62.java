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


public class CodexTest_0_6_62 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[16];
    int numBytes = Bits.writeBytes(0x1234567890abcdefL, dest, 0, dest.length);
    assertEquals(8, numBytes);
    assertEquals(0x12, dest[0] & 0xff);
    assertEquals(0x34, dest[1] & 0xff);
    assertEquals(0x56, dest[2] & 0xff);
    assertEquals(0x78, dest[3] & 0xff);
    assertEquals(0x90, dest[4] & 0xff);
    assertEquals(0xab, dest[5] & 0xff);
    assertEquals(0xcd, dest[6] & 0xff);
    assertEquals(0xef, dest[7] & 0xff);
    for (int i = 8; i < dest.length; i++) {
      assertEquals(0, dest[i]);
    }
  }
  
Input: public static final HashCode fromLong(long hash) {
			return fromBytes(
					new byte[] {
							(byte) ( hash >> 56 ),
							(byte) ( hash >> 48 ),
							(byte) ( hash >> 40 ),
							(byte) ( hash >> 32 ),
							(byte) ( hash >> 24 ),
							(byte) ( hash >> 16 ),
							(byte) ( hash >> 8 ),
							(byte) hash
					}
			);
		  }
Output: public void testRoundTripHashCodeUsingBaseEncoding() {
    HashCode hash1 = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    HashCode hash2 = HashCode.fromBytes(BaseEncoding.base16().lowerCase().decode(hash1.toString()));
    assertEquals(hash
}