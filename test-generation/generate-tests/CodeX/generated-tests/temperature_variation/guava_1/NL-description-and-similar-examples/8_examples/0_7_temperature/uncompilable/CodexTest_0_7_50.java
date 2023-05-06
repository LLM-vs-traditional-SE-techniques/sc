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


public class CodexTest_0_7_50 { 
  @Test
  public void testHashCode() {
    long[] longs = {0, 1, -1, Long.MAX_VALUE, Long.MIN_VALUE};
    for (long l : longs) {
      HashCode hashCode = HashCode.fromLong(l);
      assertEquals(l, hashCode.asLong());
      assertEquals(hashCode, HashCode.fromLong(l));
      assertEquals(l, hashCode.hashCode());
      assertEquals(l, hashCode.asBytes()[0]);
      assertEquals(l, hashCode.asBytes()[7]);
      assertEquals(0, hashCode.asBytes()[1]);
      assertEquals(0, hashCode.asBytes()[6]);
    }
  }
	
Input: public static HashCode fromInt(int hash) {
    return new IntHashCode(hash);
  }
Output: public void testHashCode() {
    int[] ints = {0, 1, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
    for (int i : ints) {
      HashCode hashCode = HashCode.fromInt(i);
      assertEquals(i, hashCode.asInt());
      assertEquals(hashCode, HashCode.fromInt(i));
      assertEquals(i, hashCode.hashCode());
      assertEquals(i, hashCode.asBytes()[0]);
      assertEquals(i, hashCode.asBytes()[3]);
      assertEquals(0, hashCode.asBytes()[1]);
      assertEquals(0, hashCode.asBytes()[2]);
    }
  }
	
Input: public static HashCode fromString(CharSequence chars) {
    byte[] bytes = chars.toString().getBytes(Charsets.UTF_8);
    return fromBytesNoCopy(bytes);
  }
Output: public void testHashCode() {
    HashCode hash1 = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    HashCode hash2 = HashCode.fromString("foo");
    assertEqu
}