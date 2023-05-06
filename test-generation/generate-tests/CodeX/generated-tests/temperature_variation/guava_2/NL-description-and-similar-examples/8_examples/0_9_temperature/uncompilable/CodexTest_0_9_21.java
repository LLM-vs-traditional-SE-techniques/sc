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
  public void testSortAlphabeticallyOrder() {
    final DatabaseInfo db1 = new DatabaseInfo(
      SqlIdentifier.createIdentifier("databse3"),
      DatabaseKind.UNKNOWN,
      "catalog3",
      "schem3");
    final DatabaseInfo db2 = new DatabaseInfo(
      SqlIdentifier.createIdentifier("databse2"),
      DatabaseKind.UNKNOWN,
      "catalog2",
      "schem2");
    final DatabaseInfo db3 = new DatabaseInfo(
      SqlIdentifier.createIdentifier("databse1"),
      DatabaseKind.UNKNOWN,
      "catalog1",
      "schem1");
    final List<DatabaseInfo> list = Arrays.asList(db1, db2, db3);
    DatabaseInfo.sortAlphabetically(list);
    assertArrayEquals(list.toArray(), new Object[] {db3, db2, db1});
  }
}