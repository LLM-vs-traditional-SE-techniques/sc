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


public class CodexTest_0_6_32 { 
  @Test
  public void testHashCode() {
    final int[] ints = new int[] {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE};
    for (int fromInt : ints) {
      HashCode hashCode = HashCode.fromInt(fromInt);
      assertEquals(fromInt, hashCode.asInt());
      assertEquals(fromInt, hashCode.hashCode());
      assertEquals(fromInt, HashCode.fromBytes(hashCode.asBytes()).asInt());
      assertEquals(fromInt, HashCode.fromString(hashCode.toString()).asInt());
      assertEquals(fromInt, HashCode.fromLong(hashCode.asLong()).asInt());
      assertEquals(fromInt, HashCode.fromInt(hashCode.asInt()).asInt());
      assertEquals(fromInt, HashCode.fromBytesNoCopy(hashCode.asBytes()).asInt());
    }
    for (int i = 0; i < ints.length; i++) {
      for (int j = 0; j < ints.length; j++) {
        HashCode hash1 = HashCode.fromInt(ints[i]);
        HashCode hash2 = HashCode.fromInt(ints[j]);
        assertEquals(
            i + ":" + ints[i] + ", " + j + ":" + ints[j],
            (ints[i] == ints[j]) ? 0 : (ints[i] < ints[j] ? -1 : 1),
            hash1.compareTo(hash2));
      }
    }
    assertEquals(HashCode.fromString("ffffffff"), HashCode.fromInt(-1));
  }
}