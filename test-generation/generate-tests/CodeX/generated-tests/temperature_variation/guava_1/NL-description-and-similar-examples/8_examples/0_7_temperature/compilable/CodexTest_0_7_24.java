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


public class CodexTest_0_7_24 { 
  @Test
  public void testHashCodeWithPrefix() {
    HashCode hashCode42 = Hashing.sha1().hashLong(42);
    String hexString = hashCode42.toString();
    assertEquals(hexString.length(), 20 * 2);
    assertTrue(hexString.startsWith("0000"));
    assertEquals(Hashing.sha1().hashString(hexString, Charsets.UTF_8), hashCode42);
  }
}