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


public class CodexTest_0_8_35 { 
  @Test
  public void testNullPointerException() {
    String testString = null;
    try {
      HashCode hash = Hashing.sha1().hashString(testString, Charsets.UTF_8);
      fail("Should have thrown NullPointerException");
    } catch (NullPointerException expected) {
    }
    try {
      HashCode hash = Hashing.sha1().hashUnencodedChars(testString);
      fail("Should have thrown NullPointerException");
    } catch (NullPointerException expected) {
    }
    try {
      HashCode hash = Hashing.sha1().hashLong(0).putString(testString);
      fail("Should have thrown NullPointerException");
    } catch (NullPointerException expected) {
    }
  }

}