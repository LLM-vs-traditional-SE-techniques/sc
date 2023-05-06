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


public class CodexTest_0_9_65 { 
  @Test
  public void testMinArray() {
    Random r = newRandom();
    final int[] ints = new int[] { r.nextInt(), r.nextInt(), r.nextInt() };
    final short[] shorts = new short[] { (short) r.nextInt(), (short) r.nextInt(), (short) r.nextInt() };
    assertEquals(
        Ints.min(ints), Ints.min(Ints.asList(ints)));
    int expectedMin = r.nextInt() & 0xffff;
    int expectedMax = expectedMin + r.nextInt(10);
    for (int k = 0; k < 10; k++) {
      Arrays.fill(shorts, (short) (expectedMin + r.nextInt(expectedMax - expectedMin + 1)));
      Arrays.sort(shorts);
      assertEquals(Ints.min(shorts[0], shorts[1]), Ints.min(shorts[0], shorts.clone()));
    }
    try {
      Ints.min((int[]) null);
      fail("Expected NPE");
    } catch (NullPointerException expected) {
    }
    try {
      Ints.min((int[]) null, r.nextInt());
      fail("Expected NPE");
    } catch (NullPointerException expected) {
    }
    try {
      Ints.min(new int[] {}, r.nextInt());
      fail("Expected IAE");
    } catch (IllegalArgumentException expected) {
    }
  }
}