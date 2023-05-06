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


public class CodexTest_0_8_10 { 
  @Test
  public void testGetBits() {
    HashCode hash1 = HashCode.fromLong(0x1FL << 56);
    HashCode hash2 = HashCode.fromInt(0x1F);
    HashCode hash3 = HashCode.fromString("");
    assertEquals(0x1FL << 56, hash1.asLong());
    assertEquals(0x1F, hash2.asInt());
    assertEquals(0, hash3.asInt());
  }
}