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


public class CodexTest_0_9_21 { 
  @Test
    public void testHashBytes() {
    	for (int i = 0; i < 500000; i++) {
      		HashCode hash1 = Hashing.murmur3_128().hashBytes(foo30.getBytes(Charsets.UTF_8));
      		HashCode hash2 = Hashing.murmur3_128().hashBytes(bar30.getBytes(Charsets.UTF_8));
      		HashCode hash3 = Hashing.murmur3_128().hashBytes(baz30.getBytes(Charsets.UTF_8));
      		assertEquals(hash2, hash1.putLong(i).putString(bar30, Charsets.UTF_8).putLong(i));
      		assertEquals(hash3, hash1.putLong(i).putString(baz30, Charsets.UTF_8).putLong(i));
      		assertNotEquals(hash2, hash3);
      		assertTrue(hash1.putLong(i).putString(bar30, Charsets.UTF_8).putLong(i).hashCode() > 0);
     	}
      }
}