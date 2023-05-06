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


public class CodexTest_0_8_90 { 
  @Test
  public void testGetBits() {
			BitArray array = new BitArray(8);
			assertEquals(0, array.getBits(0, 0));
			assertEquals(0, array.getBits(4, 0));
			assertEquals(0, array.getBits(4, 4));
			array.setBits(0, 8);
			assertEquals(255, array.getBits(0, 8));
			assertEquals(255, array.getBits(0, 4));
			assertEquals(15, array.getBits(4, 4));
		}
}