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


public class CodexTest_0_9_51 { 
  @Test
  public void testHashOf0() {
    assertEquals(0, Hashing.sha1().hashLong(0).asInt());
    assertEquals(0, Hashing.sha1().hashLong(0).asInt());
    assertEquals(0, Hashing.sha256().hashLong(0).asInt());
    assertEquals(0, Hashing.sha512().hashLong(0).asInt());
    assertEquals(0, Hashing.murmur3_32().hashLong(0).asInt());
    assertEquals(0, Hashing.md5().hashLong(0).asInt());
    assertEquals(0, Hashing.goodFastHash(32).hashLong(0).asInt());
    assertEquals(0L, Hashing.goodFastHash(64).hashLong(0).asLong());
    assertEquals(0, Hashing.murmur3_128().hashLong(0).asInt());
    assertEquals(0, Hashing.murmur3_128().hashLong(0).asInt());
    assertEquals(
        HashCode.fromInt(0), HashCode.fromLong(Hashing.goodFastHash(32).hashLong(10)));
    assertEquals(
        HashCode.fromLong(0), HashCode.fromLong(Hashing.goodFastHash(64).hashLong(0)));
  }
}