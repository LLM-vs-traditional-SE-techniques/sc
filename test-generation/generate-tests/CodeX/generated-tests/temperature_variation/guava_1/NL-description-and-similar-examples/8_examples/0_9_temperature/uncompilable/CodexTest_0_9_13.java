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


public class CodexTest_0_9_13 { 
  @Test
    public void testHash1() {
    	  long val = 1L;
		  HashCode hash = HashCode.fromLong(val);
		  Assert.assertEquals(val, hash.asLong());
		  Assert.assertEquals(0, hash.asInt());
		  Assert.assertEquals(Longs.toByteArray(val), hash.asBytes());
  		}
  		public void testObjectHashCode() {
			HashCode hashCode42 = HashCode.fromInt(42);
			assertEquals(42, hashCode42.hashCode());
		  }
}