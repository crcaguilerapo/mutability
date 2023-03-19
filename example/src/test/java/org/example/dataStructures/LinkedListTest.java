package org.example.dataStructures;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {
    @Test
    public void LinkedListTest() {
        var a = new LinkedList<Integer>(List.of(1, 2, 3));

        // Before Modification
        assertTrue(a.equals(List.of(1, 2, 3)));

        modify(a);

        // After Modification
        assertTrue(a.equals(List.of(1, 2, 3, 4)));
    }

    public static void modify(LinkedList<Integer> a1) {
        a1 = new LinkedList<Integer>(a1);
        a1.add(4);
    }

    @Test
    public void deepCopyLinkedListWithCopyOf() {
        var a = new LinkedList<Integer>(List.of(1, 2, 3));
        var b = List.copyOf(a);
        assertFalse(a == b);
    }

    @Test
    public void deepCopyLinkedListWithCloneable() {
        var a = new LinkedList<Integer>(List.of(1, 2, 3));
        var b = a.clone();
        assertFalse(a == b);
    }

    @Test
    public void deepCopyLinkedListWithJson() {
        var a = new LinkedList<Integer>(List.of(1, 2, 3));
        Gson gson = new Gson();
        var b = gson.fromJson(gson.toJson(a), LinkedList.class);
        assertFalse(a == b);
    }

    @Test
    public void deepCopyLinkedListWithSerializable() throws IOException, ClassNotFoundException {
        var a = new LinkedList<Integer>(List.of(1, 2, 3));
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try
        {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // serialize and pass the object
            oos.writeObject(a);
            oos.flush();
            ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bin);
            var b = (LinkedList<Integer>) ois.readObject();
            assertFalse(a == b);
        }
        catch(Exception e)
        {
            System.out.println("Exception in ObjectCloner = " + e);
            throw(e);
        }
        finally
        {
            oos.close();
            ois.close();
        }
    }
}
