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


public class CodexTest_0_9_5 { 
  @Test
   public void testToString() {
    BitArray b = new BitArray(128);
    assertEquals("0000000000000000000000000000000000000000000000000000000000000000", b.toString());
    b.set(2);
    b.set(6);
    b.set(8);
    b.set(10);
    b.set(20);
    b.set(25);
    b.set(27);
    b.set(31);
    b.set(32);
    assertEquals("01000000000000001010000000000001000001000000000010001000000000000", b.toString());
  }
}