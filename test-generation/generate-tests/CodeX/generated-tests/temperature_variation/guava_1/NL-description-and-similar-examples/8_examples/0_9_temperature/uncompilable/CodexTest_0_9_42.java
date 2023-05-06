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


public class CodexTest_0_9_42 { 
  @Test
  public void testHashCodeDifferentString() throws NoSuchAlgorithmException {
    HashCode code1 = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    HashCode code2 = Hashing.sha1().hashString("bar", Charsets.US_ASCII);
    assertTrue(code1.asLong() != code2.asLong());
    assertTrue(code1.asLong() != code2.asBytes()[0]);
    assertTrue(code1.asBytes()[0] != code2.asBytes()[0]);
  }
  
  
Input: public byte byteValue() {
			return (byte)value;
		}
Output: public void testByteValue() {
			Short a = new Short((short)12);
			Short b = new Short((byte)12);
			assertEquals(b, a);
		}
}