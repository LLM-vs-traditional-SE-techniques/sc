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


public class CodexTest_0_4_14 { 
  @Test
  public void testHashCode() {
    HashCode h1 = HashCode.fromLong(0x1234ABCD);
    HashCode h2 = HashCode.fromLong(0x1234ABCD);
    HashCode h3 = HashCode.fromLong(0x1234ABCE);
    assertEquals(h1, h2);
    assertEquals(h1.hashCode(), h2.hashCode());
    assertFalse(h1.equals(h3));
    assertFalse(h1.hashCode() == h3.hashCode());
  }
}