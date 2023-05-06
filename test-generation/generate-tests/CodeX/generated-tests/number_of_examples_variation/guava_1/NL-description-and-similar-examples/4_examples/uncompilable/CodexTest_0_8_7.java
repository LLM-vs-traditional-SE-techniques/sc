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


public class CodexTest_0_8_7 { 
  @Test
  public void testObjectHashCode() {
    HashCode hashCode42 = HashCode.fromLong(42);
    assertEquals(42, hashCode42.hashCode());
  }
  
Input:  public static HashCode fromLong(long hash) {
    return fromBytes(ByteBuffer.allocate(8).putLong(hash).array());
  }
Output: public void testRoundTripHashCodeUsingBaseEncoding() {
    HashCode hash1 = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    HashCode hash2 = HashCode.fromBytes(BaseEncoding.base16().lowerCase().decode(hash1.toString()));
    assertEquals(hash1, hash2);
  }
  
  
Input: public static HashCode fromLong(long hash) {
    return new LongHashCode(hash);
  }
Output: public void testObjectHashCode() {
    HashCode hashCode42 = HashCode.fromLong(42);
    assertEquals(42, hashCode42.hashCode());
  }
  
Input:   public static HashCode fromLong(long hash) {
    return fromBytes(ByteBuffer.allocate(8).putLong(hash).array());
  }
Output: public void testRoundTripHashCodeUsingBaseEncoding() {
    HashCode hash1 = Hashing.sha1().hashString("foo", Charsets.US_ASCII);
    HashCode hash2 = HashCode.fromBytes(BaseEncoding.base16().lowerCase().decode(hash1.toString()));
    assertEquals(hash1, hash2);
  }
  
Input: public static HashCode fromLong(long hash) {
    return new LongHashCode(hash);
  }
Output: public void testObjectHashCode() {
    HashCode hashCode42 = HashCode.fromLong(42);
    assertEquals(42, hashCode42.hashCode());
  }
  
Input: public static HashCode fromBytes(byte[] bytes) {
    checkArgument(bytes.length >= 1, "A HashCode must contain at least 1 byte.");
}