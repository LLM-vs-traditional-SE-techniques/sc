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


public class CodexTest_0_9_79 { 
  @Test
  public void testLongHashCode() {
	HashCode hash = HashCode.fromLong(0L);
    assertEquals(0L, hash.asLong());
    assertEquals(ImmutableMap.of(), ImmutableMap.of().hashCode());
    assertEquals(m12.hashCode(), ImmutableMap.of(1, "a", 2, "b").hashCode());
    assertEquals(hash.hashCode(), ImmutableMap.of().hashCode());
}