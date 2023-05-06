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


public class CodexTest_0_7_4 { 
  @Test
  public void testHashLong() {
    assertEquals("8dd7c1fcb607cbd9", hashLongWith(Hashing.murmur3_32(), 0).toString());
    assertEquals("dd7c1fcb", hashLongWith(Hashing.murmur3_128(), 0).toString());
    assertEquals("3a7bd3e2360a3d29ee", hashLongWith(Hashing.sipHash24(), 0).toString());
  }
}