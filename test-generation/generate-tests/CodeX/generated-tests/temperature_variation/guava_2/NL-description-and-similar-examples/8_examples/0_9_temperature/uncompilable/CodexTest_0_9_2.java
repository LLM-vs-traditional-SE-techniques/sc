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


public class CodexTest_0_9_2 { 
  @Test
  public void testThatReadAndWriteBytesAppliedSeveralTimesProduceSameResult() {
    Random rnd = new Random(1234);
    for (int x = 0; x < 100; x++) {
      for (int y = 0; y < 1000; y++) {
        List<Integer> first = new ArrayList<>(y);
        List<Integer> second = new ArrayList<>(y);
        int[] randomIntegers = randomIntegers(rnd, y);
        for (int elem : randomIntegers) {
          first.add(elem);
          second.add(elem);
        }
        LongPagedHashTable table = LongPagedHashTable.create(first, StringCodecs.STRING);
        long position = table.position();
        do {
          int size = PagedHashTable.read(table.channel(), new DataInputStream(Channels.newInputStream(table.channel())), table.descriptor());
          table.close();
          File newFile = new File(FileUtil.getCurrentWorkingDirectory(), "test" + x + ".tmp");
          newFile.deleteOnExit();
          FileChannel channel = new RandomAccessFile(newFile, "rw").getChannel();
          table = PagedHashTable.open(channel);
          table.write(new DataOutputStream(Channels.newOutputStream(table.channel())), size);
          table.close();
          table = LongPagedHashTable.open(newFile);
          table.channel().position(position);
        } while (table.next());
        List<Integer> read = new ArrayList<>(y);
        table.close();
        table = LongPagedHashTable.open(newFile);
        do {
          int size = table.read(new DataInputStream(Channels.newInputStream(table.channel())), table.descriptor());
          table.close();
          File newFile = new File(FileUtil.getCurrentWorkingDirectory(), "test" + x + ".tmp");
          FileChannel channel = new RandomAccessFile(newFile, "rw").getChannel();
          table = PagedHashTable.open(channel
}