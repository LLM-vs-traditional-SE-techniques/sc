import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_55 { 
  @Test
  public void testForKthSortedLinkedList() {
    KthSortedLL kthSortedLinkedList = new KthSortedLL();
    Assert.assertTrue(kthSortedLinkedList.isEmpty());
    Assert.assertEquals(kthSortedLinkedList.size(), 0);
    kthSortedLinkedList.add(27);
    kthSortedLinkedList.add(12);
    kthSortedLinkedList.add(55);
    kthSortedLinkedList.add(67);
    kthSortedLinkedList.add(33);
    kthSortedLinkedList.add(29);
    kthSortedLinkedList.add(35);
    kthSortedLinkedList.add(22);
    kthSortedLinkedList.add(18);
    kthSortedLinkedList.add(3);
    kthSortedLinkedList.add(5);
    Assert.assertTrue(kthSortedLinkedList.isSorted());
    Assert.assertEquals(kthSortedLinkedList.size(), 12);
    Assert.assertEquals(kthSortedLinkedList.getKthSmallestValue(1).intValue(), 3);
    Assert.assertEquals(kthSortedLinkedList.getKthSmallestValue(3).intValue(), 12);
    Assert.assertEquals(kthSortedLinkedList.getKthSmallestValue(5).intValue(), 18);
    Assert.assertEquals(kthSortedLinkedList.getKthSmallestValue(7).intValue(), 22);
    Assert.assertEquals(kthSortedLinkedList.getKthSmallestValue(12).intValue(), 67);
  }
}