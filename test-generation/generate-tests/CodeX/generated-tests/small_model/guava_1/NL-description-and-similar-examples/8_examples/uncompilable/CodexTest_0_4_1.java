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


public class CodexTest_0_4_1 { 
  @Test
  public void testHashCode() {
    assertEquals(0, HashCode.fromLong(0).hashCode());
    assertEquals(1, HashCode.fromLong(1).hashCode());
    assertEquals(2, HashCode.fromLong(2).hashCode());
    assertEquals(3, HashCode.fromLong(3).hashCode());
    assertEquals(4, HashCode.fromLong(4).hashCode());
    assertEquals(5, HashCode.fromLong(5).hashCode());
    assertEquals(6, HashCode.fromLong(6).hashCode());
    assertEquals(7, HashCode.fromLong(7).hashCode());
    assertEquals(8, HashCode.fromLong(8).hashCode());
    assertEquals(9, HashCode.fromLong(9).hashCode());
    assertEquals(10, HashCode.fromLong(10).hashCode());
    assertEquals(11, HashCode.fromLong(11).hashCode());
    assertEquals(12, HashCode.fromLong(12).hashCode());
    assertEquals(13, HashCode.fromLong(13).hashCode());
    assertEquals(14, HashCode.fromLong(14).hashCode());
    assertEquals(15, HashCode.fromLong(15).hashCode());
    assertEquals(16, HashCode.fromLong(16).hashCode());
    assertEquals(17, HashCode.fromLong(17).hashCode());
    assertEquals(18, HashCode.fromLong(18).hashCode());
    assertEquals(19, HashCode.fromLong(19).hashCode());
    assertEquals(20, HashCode.fromLong(20).hashCode());
    assertEquals(21, HashCode.fromLong(21).hashCode());
    assertEquals(22, HashCode.fromLong(22).hashCode());
    assertEquals(23, HashCode.fromLong(23).hashCode());
    assertEquals(24, HashCode.fromLong(24).hashCode());
    assertEquals(25, HashCode.fromLong(25).hashCode());
    assertEquals(26, HashCode.fromLong(26).hashCode());
    assertEquals(27, HashCode.fromLong(27).hashCode());
    assertEquals(28, HashCode.fromLong(28).hashCode());
    assertEquals(29, HashCode.fromLong(29).hashCode());
    assertEquals(30, HashCode.fromLong(30).hashCode());
    assertEquals(31, HashCode.fromLong(31).hashCode());
    assertEquals(32, HashCode.fromLong(32).hashCode());
    assertEquals(33, HashCode.fromLong(33).hashCode());
    assertEquals(34, HashCode.fromLong(34).hashCode());
    assertEquals(35, HashCode.fromLong(35).hashCode());
    assertEquals(36, HashCode.fromLong(36).hashCode());
    assertEquals(37, HashCode.fromLong(37).hashCode());
    assertEquals(38, HashCode.fromLong(38).hashCode());
    assertEquals(39, HashCode.fromLong(39).hashCode());
    assertEquals(40, HashCode.fromLong(40).hashCode());
    assertEquals(41, HashCode.fromLong(41).hashCode());
    assertEquals(42, HashCode.from
}