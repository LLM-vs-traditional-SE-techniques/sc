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


public class CodexTest_0_9_3 { 
  @Test
  public void testHashCodeLongAdd() {
    for (int delta = 1; delta <= 256; delta += delta) {
      // Test HashCode.fromInt(0).add(delta).
      long inputLong = 0L;
      HashCode inputHashCode = HashCode.fromLong(inputLong);
      for (int i = 1; i <= 64 / smallDelta; i++) {
        HashCode addedHashCode = inputHashCode.add(smallDelta);
        long addedLong = inputHashCode.asLong() + smallDelta;
        HashCode inputExtraHashCode = HashCode.fromLong(inputLong + smallDelta);
        assertEquals(addedHashCode, inputExtraHashCode);
        assertEquals(addedHashCode.asLong(), inputExtraHashCode.asLong());
        assertEquals(
            addedLong,
            addedHashCode.asLong());
        inputLong = inputExtraHashCode.asLong();
        inputHashCode = inputExtraHashCode;
      }
}