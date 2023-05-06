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


public class CodexTest_0_9_7 { 
  public void testObjectHashCode() {
    long expectedHashCode = randomLong();
    HashCode hashCode42 = HashCode.fromLong(expectedHashCode);
    assertEquals(expectedHashCode, hashCode42.hashCode());
  }
  @Test
  public void testToString() {
    long expectedHashCode = randomLong();
    HashCode hashCode42 = HashCode.fromLong(expectedHashCode);
    assertEquals(Long.toString(expectedHashCode), hashCode42.toString());
  }
  
  
  public void testMurmur3Seeded() {
    HashCode hashCodeUsingSeed = HashCode.murmur3_32(1234, source, 0, source.length);
    assertEquals(0f0342947, hashCodeUsingSeed.asInt());
  }
  @Test
  public void testMurmur3SeededByte() {
    HashCode hashCodeUsingSeed = HashCode.murmur3_32(1234, source[0]);
    assertEquals(2249091128, hashCodeUsingSeed.asInt());
  }
}