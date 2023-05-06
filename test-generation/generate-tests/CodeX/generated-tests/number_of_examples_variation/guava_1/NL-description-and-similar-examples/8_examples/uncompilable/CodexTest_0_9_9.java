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
   public void testHashEmptyCodes() {
    Set<String> hashCodes = new HashSet<>();
    hashCodes.add(HashCode.fromLong(0L).toString());
    hashCodes.add(HashCode.fromLong(1L).toString());
    hashCodes.add(HashCode.fromLong(-1L).toString());
    hashCodes.add(HashCode.fromLong(Integer.MIN_VALUE).toString());
    hashCodes.add(HashCode.fromLong(Integer.MAX_VALUE).toString());
    hashCodes.add(HashCode.fromLong(Long.MIN_VALUE).toString());
    hashCodes.add(HashCode.fromLong(Long.MAX_VALUE).toString());
    assertEquals(7, hashCodes.size());
  }
}