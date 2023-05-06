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


public class CodexTest_0_8_69 { 
  @Test
  public void testObjectHashCodeWithBadHash() {
    HashCode hashCode = HashCode.fromLong(0xFFFFFFFFL);
    int value = hashCode.hashCode();
    // HashCode.hashCode() method is declared as @Override, so it should have been inherited from Object.
    // If not because of a compiler bug, this test will fail at runtime.
    assertEquals(0xFFFFFFFFL, value);
  }
}