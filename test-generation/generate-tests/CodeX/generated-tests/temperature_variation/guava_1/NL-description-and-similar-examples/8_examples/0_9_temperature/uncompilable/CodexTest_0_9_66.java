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


public class CodexTest_0_9_66 { 
  @Test
  public void testObjectHashCodeWithLongHashCodeNull() {
    final LongHashCode lhCode = (LongHashCode) HashCode.fromLong(Hashing.murmur3_128().hashString(null, Charset.defaultCharset()));
    assertEquals("LongHashCode(0)", lhCode.toString());
    assertEquals("0", lhCode.toHashCode());
    assertFalse("HashCode must not be negative", lhCode.asLong() < 0);
    assertEquals("HashCode must have the right length", 16, lhCode.asBytes().length);
    assertEquals("HashCode has wrong hash", 0, lhCode.hashCode());
    assertEquals("HashCode must have the right value as int", 0, lhCode.asInt());
    assertEquals("HashCode must have the right value as long", 0, lhCode.asLong());
    assertEquals("HashCode must have the right value as bytes", "0000000000000000".getBytes(CHARSET_UTF_8), lhCode.asBytes());
  }
}