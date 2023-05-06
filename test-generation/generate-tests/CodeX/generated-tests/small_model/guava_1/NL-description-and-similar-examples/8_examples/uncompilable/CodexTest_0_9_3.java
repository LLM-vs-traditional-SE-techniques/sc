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
   public void testObjectHashCode() {
			HashCode hashCode42 = HashCode.fromLong(42);
			HashCode hashCode72 = HashCode.fromLong(72);
			assertTrue(hashCode42.equals(new LongHashCode(42)));
			assertTrue(hashCode42.equals(hashCode42));
			assertFalse(hashCode42.equals(hashCode72));
			assertFalse(hashCode42.equals(null));
			assertEquals(42, hashCode42.hashCode());
			assertEquals(42, hashCode42.asLong());
			assertFalse(hashCode42.asHexString().matches("[0-9a-f]+"));
		  }
}