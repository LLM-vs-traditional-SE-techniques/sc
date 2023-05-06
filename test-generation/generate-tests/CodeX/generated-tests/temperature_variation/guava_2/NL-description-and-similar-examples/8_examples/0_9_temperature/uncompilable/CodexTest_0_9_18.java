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


public class CodexTest_0_9_18 { 
  @Test
  public void testWriteBytesToShortArrayShortLength() {
    byte[] bytes = new byte[3];
    int length = writeBytesTo(bytes, 0, 3);
    assertEquals(length, 3);
    assertEquals(bytes[0], (byte) 0x01);
    assertEquals(bytes[1], (byte) 0x23);
    assertEquals(bytes[2], (byte) 0x45);
  }
}