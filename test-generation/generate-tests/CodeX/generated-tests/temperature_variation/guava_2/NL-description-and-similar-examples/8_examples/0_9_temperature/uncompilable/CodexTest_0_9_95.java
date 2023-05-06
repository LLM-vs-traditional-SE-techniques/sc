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


public class CodexTest_0_9_95 { 
  @Test
    public void testToByteArray() {
			BloomFilter<String> one = BloomFilter.create(
				Funnels.stringFunnel(Charsets.UTF_8), 1_000_000, 0.01);
			for (int i = 0; i < 1000000; i++) {
				one.put("" + i);
			}
			byte[] bytes = one.toByteArray();
			assertEquals(202544, bytes.length);
		}
}