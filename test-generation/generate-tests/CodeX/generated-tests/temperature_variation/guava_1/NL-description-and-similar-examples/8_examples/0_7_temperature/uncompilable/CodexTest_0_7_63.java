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


public class CodexTest_0_7_63 { 
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
Input: public static HashCode fromBytes(byte[] bytes) {
    checkArgument(bytes.length >= 1, "A HashCode must contain at least 1 byte.");
    return fromBytesNoCopy(bytes.clone());
  }
Output: public void testRoundTripHashCodeUsingBaseEncoding() {
    HashCode hash1 = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    HashCode hash2 = HashCode.fromBytes(BaseEncoding.base16().lowerCase().decode(hash1.toString()));
    assertEquals(hash1, hash2);
  }
Input: public static HashCode fromBytesNoCopy(byte[] bytes) {
    return new BytesHashCode(bytes);
  }
Output: public void testCreateHashCodeFromByteArray() {
      byte[] bytes = {-12, 0, 14, 85, -32, 16, 23, -127, 0, 91, -115, -40};
      HashCode hashCode = HashCode.fromBytes(bytes);
      assertTrue(Arrays.equals(bytes, hashCode.asBytes()));
    }
Input: public static HashCode fromString(CharSequence chars) {
    checkNotNull(chars);
    return fromBytesNoCopy(chars.toString().getBytes(Charsets.UTF_8));
  }
Output: public void testCreateHashCodeFromString() {
    String string = "Hello World";
    HashCode hashCode = HashCode.fromString(string);
    assertTrue(string.equals(hashCode.toString()));
    assertTrue(Arrays.equals(
}