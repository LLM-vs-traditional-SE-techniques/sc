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


public class CodexTest_0_9_9 { 
  @Test
   public static void testHashLong() {
    assertEquals(32, LONG_HASH_CODE.bits());
    assertEquals(0, fromLong(0).asLong());
    assertEquals(15, fromLong(15).asLong());
    assertEquals(0x1234567890ABCDEFL, fromLong(0x1234567890ABCDEFL).asLong());
    assertEquals(0xFFFFFFFFFFFFFFFFL, fromLong(0xFFFFFFFFFFFFFFFFL).asLong());
  }
}