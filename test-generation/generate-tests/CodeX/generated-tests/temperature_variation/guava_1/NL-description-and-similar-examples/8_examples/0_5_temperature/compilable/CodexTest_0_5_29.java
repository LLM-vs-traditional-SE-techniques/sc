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


public class CodexTest_0_5_29 { 
  @Test
  public void testHashCode() {
    HashCode hashCode1 = HashCode.fromLong(42);
    HashCode hashCode2 = HashCode.fromLong(42);
    HashCode hashCode3 = HashCode.fromInt(42);
    assertEquals(hashCode1, hashCode2);
    assertEquals(hashCode1.hashCode(), hashCode2.hashCode());
    assertFalse(hashCode1.equals(hashCode3));
  }
}