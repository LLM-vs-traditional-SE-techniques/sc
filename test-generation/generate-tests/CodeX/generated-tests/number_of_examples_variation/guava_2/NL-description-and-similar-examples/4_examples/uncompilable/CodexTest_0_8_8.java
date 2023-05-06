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


public class CodexTest_0_8_8 { 
  @Test
  public void testParseWithPrefix() {
    assertEquals(Optional.of(HexCodec.decode("0f")), HexCodec.decodePrefix("0f"));
    assertEquals(Optional.of(HexCodec.decode("0f")), HexCodec.decodePrefix("0x0f"));
    assertEquals(Optional.of(HexCodec.decode("0f")), HexCodec.decodePrefix("0X0f"));
    assertEquals(Optional.absent(), HexCodec.decodePrefix(""));
    assertEquals(Optional.absent(), HexCodec.decodePrefix("0"));
    assertEquals(Optional.absent(), HexCodec.decodePrefix("0x"));
    assertEquals(Optional.of(HexCodec.decode("0f")), HexCodec.decodePrefix("0x0f"));
    assertEquals(Optional.absent(), HexCodec.decodePrefix("0x0g"));
  }
	
Input: public static Ordering<String> usingToString() {
    return BY_TO_STRING;
  }
Output: public void testNatural_List_varargs() {
    ImmutableSortedMultiset<String> copy =
        ImmutableSortedMultiset.copyOf(Ordering.usingToString(), "b", "c", "a");
    assertEquals(ImmutableList.of("a", "b", "c"), copy.toList());
  }
}