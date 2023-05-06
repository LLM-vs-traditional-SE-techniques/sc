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


public class CodexTest_0_6_3 { 
  @Test
  public void testHashLong() {
    assertEquals(42L, HashCode.fromLong(42L).asLong());
    assertEquals(42L, HashCode.fromLong(42L).asInt());
    assertEquals(42L, HashCode.fromLong(42L).asBytes()[0]);
    assertEquals(42L, HashCode.fromLong(42L).asBytes()[1]);
    assertEquals(42L, HashCode.fromLong(42L).asBytes()[2]);
    assertEquals(42L, HashCode.fromLong(42L).asBytes()[3]);
    assertEquals(42L, HashCode.fromLong(42L).asBytes()[4]);
    assertEquals(42L, HashCode.fromLong(42L).asBytes()[5]);
    assertEquals(42L, HashCode.fromLong(42L).asBytes()[6]);
    assertEquals(42L, HashCode.fromLong(42L).asBytes()[7]);
  }
}