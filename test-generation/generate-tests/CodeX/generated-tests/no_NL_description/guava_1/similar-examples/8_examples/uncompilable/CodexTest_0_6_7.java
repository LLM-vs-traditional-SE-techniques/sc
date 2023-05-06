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


public class CodexTest_0_6_7 { 
  @Test
    public void testHashCode() {
    HashCode hashCode = Hashing.sha512().hashLong(42);
    assertEquals(Hashing.sha512().hashBytes(Longs.toByteArray(42)).asLong(), hashCode.asLong());
    assertEquals("6f8db599de986fab7a21625b7916589c", hashCode.toString());
  }
}