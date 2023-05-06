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


public class CodexTest_0_6_37 { 
  @Test
   public void testHashCode() {
    HashCode hashCode1 = HashCode.fromLong(1L);
    HashCode hashCodeM1 = HashCode.fromLong(-1L);
    assertNotEquals(hashCode1, hashCodeM1);
    assertEquals(hashCode1.hashCode(), hashCode1.hashCode());
    assertEquals(hashCodeM1.hashCode(), hashCodeM1.hashCode());
    assertEquals(Long.valueOf(1L).hashCode(), hashCode1.hashCode());
    assertEquals(Long.valueOf(-1L).hashCode(), hashCodeM1.hashCode());
  }
}