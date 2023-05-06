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


public class CodexTest_0_8_23 { 
  @Test
  public void testObjectHashCode() {
    HashCode hashCode42 = HashCode.fromLong(42);
    assertEquals(42, hashCode42.hashCode());
  }
  
Input: public static HashCode fromInt(int hash) {
    return new IntHashCode(hash);
  }
Output:
  public void testObjectHashCode() {
    HashCode hashCode42 = HashCode.fromInt(42);
    assertEquals(42, hashCode42.hashCode());
  }
  
Input: public static HashCode fromString(String string) {
    checkNotNull(string);
    return fromBytes(string.getBytes(Charsets.UTF_8));
  }
Output:
  public void testHashString() {
    String test = "foobarbaz";
    HashCode hash = Hashing.md5().hashString(test, Charsets.UTF_8);
    assertEquals(hash, Hashing.md5().hashString(test, Charsets.UTF_8));
    assertTrue(hash.toString().contains(
        "6928e186a6eedf9d9e0ede96597f11f2"));
  }
  
Input: public static HashCode fromUnencodedChars(CharSequence chars) {
    byte[] bytes = new byte[chars.length() * 2];
    for (int i = 0; i < chars.length(); i++) {
      bytes[2 * i] = (byte) (chars.charAt(i) >> 8);
      bytes[2 * i + 1] = (byte) chars.charAt(i);
    }
    return fromBytesNoCopy(bytes);
  }
Output:
  public void testHashUnencodedCharsHashingLongString() {
    String test = "this is a long string to hash";
    HashCode hash = Hashing.md5().hashUnencodedChars(test);
    assertEquals(hash, Hashing.md5().hashString(test, Charsets.UTF_8));
  }
  
Input: public boolean equals(Object object) {
   
}