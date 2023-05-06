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


public class CodexTest_0_7_54 { 
  @Test
  public void testCollision() {
    HashCode hashA1 = HashCode.fromLong(1);
    HashCode hashA2 = HashCode.fromLong(1);
    HashCode hashB = HashCode.fromLong(2);
    assertEquals(hashA1, hashA2);
    assertNotEquals(hashA1, hashB);
    assertEquals(hashA1.hashCode(), hashA2.hashCode());
    assertNotEquals(hashA1.hashCode(), hashB.hashCode());
  }
}