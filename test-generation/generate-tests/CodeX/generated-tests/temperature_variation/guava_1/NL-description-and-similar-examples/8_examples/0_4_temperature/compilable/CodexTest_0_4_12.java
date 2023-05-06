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


public class CodexTest_0_4_12 { 
  @Test
  public void testHashCode() {
    long hash = 42;
    HashCode hashCode = HashCode.fromLong(hash);
    assertEquals(hash, hashCode.asLong());
    assertEquals(hash, hashCode.hashCode());
    assertEquals(hash, hashCode.asInt());
    assertEquals(hash, hashCode.asBytes()[0]);
    assertEquals(hash, hashCode.asBytes()[1]);
    assertEquals(hash, hashCode.asBytes()[2]);
    assertEquals(hash, hashCode.asBytes()[3]);
    assertEquals(hash, hashCode.asBytes()[4]);
    assertEquals(hash, hashCode.asBytes()[5]);
    assertEquals(hash, hashCode.asBytes()[6]);
    assertEquals(hash, hashCode.asBytes()[7]);
  }
}