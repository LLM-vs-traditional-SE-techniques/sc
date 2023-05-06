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


public class CodexTest_0_9_1 { 
  @Test
  
Input: public Object get(Object name) {
			return get(((String) name));
		}
Output: public void testObjMissing() {
  			request.put("interval", "year");
			DateHistogramInterval interval = (DateHistogramInterval) request.get("interval");
			request.put("interval", "nonsense");
			interval = (DateHistogramInterval) request.get("interval");
			assertNull(interval);
		}
}