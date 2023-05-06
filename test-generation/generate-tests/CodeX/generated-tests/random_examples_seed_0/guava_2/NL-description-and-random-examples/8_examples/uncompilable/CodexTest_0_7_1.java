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


public class CodexTest_0_7_1 { 
  @Test
  public static void testHashCode() {
    Random r = new Random();
    for (int i = 0; i < 1000; i++) {
      HashCode hashCode = HashCode.fromInt(r.nextInt());
      assertEquals(hashCode, HashCode.fromBytes(hashCode.asBytes()));
      assertEquals(hashCode.hashCode(), HashCode.fromBytes(hashCode.asBytes()).hashCode());
      byte[] bytes = new byte[4];
      hashCode.writeBytesToImpl(bytes, 0, 4);
      assertEquals(hashCode, HashCode.fromBytes(bytes));
    }
  }
}