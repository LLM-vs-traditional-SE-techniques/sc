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


public class CodexTest_0_6_7 { 
  @Test
  public void testWriteBytesTo() {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    BitWriter writer = new BitWriter(out);
    writer.writeBits(4, 5);
    writer.writeBits(4, 8);
    writer.writeBits(4, 11);
    writer.writeBits(4, 15);
    writer.writeBits(4, 0);
    writer.writeBits(4, 4);
    writer.writeBits(4, 5);
    writer.writeBits(4, 6);
    writer.writeBits(4, 7);
    writer.writeBits(4, 8);
    writer.writeBits(4, 9);
    writer.writeBits(4, 10);
    writer.writeBits(4, 11);
    writer.writeBits(4, 12);
    writer.writeBits(4, 13);
    writer.writeBits(4, 14);
    writer.writeBits(4, 15);
    writer.writeBits(4, 16);
    writer.writeBits(4, 17);
    writer.writeBits(4, 18);
    writer.writeBits(4, 19);
    writer.writeBits(4, 20);
    writer.writeBits(4, 21);
    writer.writeBits(4, 22);
    writer.writeBits(4, 23);
    writer.writeBits(4, 24);
    writer.writeBits(4, 25);
    writer.writeBits(4, 26);
    writer.writeBits(4, 27);
    writer.writeBits(4, 28);
    writer.writeBits(4, 29);
    writer.writeBits(4, 30);
    writer.writeBits(4, 31);
    writer.writeBits(4, 32);
    writer.writeBits(4, 33);
    writer.writeBits(4, 34);
    writer.writeBits(4, 35);
    writer.writeBits(4, 36);
    writer.writeBits(4, 37);
    writer.writeBits(4, 38);
    writer.writeBits(4, 39);
    writer.writeBits(4, 40);
    writer.writeBits(4, 41);
    writer.writeBits(4, 42);
    writer.writeBits(4, 43);
    writer.writeBits(4, 44);
    writer.writeBits(4, 45);
    writer.writeBits(4, 46);
    writer.writeBits(4, 47);
    writer.writeBits(4, 48);
    writer.writeBits(4, 49);

}