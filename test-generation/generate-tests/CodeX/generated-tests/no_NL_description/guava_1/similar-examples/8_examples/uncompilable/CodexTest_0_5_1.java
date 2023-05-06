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


public class CodexTest_0_5_1 { 
  @Test
  public void testHashCodeFromLong() {
    for (int i = 0; i < 1000; i++) {
      long value = RANDOM.nextLong();
      HashCode hashCode = HashCode.fromLong(value);
      assertEquals(Longs.hashCode(value), hashCode.asInt());
      assertEquals(value, hashCode.asLong());
      assertEquals(Longs.toByteArray(value), hashCode.asBytes());
    }
  }
}