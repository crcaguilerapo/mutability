package org.example.dataStructures;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HashMapTest {
    @Test
    public void HashMapTest() {
        var a = new HashMap<>(Map.of(1, "one", 2, "two", 3, "three"));

        // Before Modification
        assertTrue(a.equals(Map.of(1, "one", 2, "two", 3, "three")));

        modify(a);

        // After Modification
        assertTrue(a.equals(
                Map.of(1, "one", 2, "two", 3, "three", 4, "four")
        ));
    }

    public static void modify(Map<Integer, String> a1) {
        a1.put(4, "four");
    }

    @Test
    public void deepCopyHashMapWithCopyOf() {
        var a = new HashMap<>(Map.of(1, "one", 2, "two", 3, "three"));
        var b = Map.copyOf(a);
        assertFalse(a == b);
    }

    @Test
    public void deepCopyHashMapWithCloneable() {
        var a = new HashMap<>(Map.of(1, "one", 2, "two", 3, "three"));
        var b = a.clone();
        assertFalse(a == b);
    }

    @Test
    public void deepCopyHashMapWithJson() {
        var a = new HashMap<>(Map.of(1, "one", 2, "two", 3, "three"));
        Gson gson = new Gson();
        var b = gson.fromJson(gson.toJson(a), HashMap.class);
        assertFalse(a == b);
    }

    @Test
    public void deepCopyHashMapWithSerializable() throws IOException, ClassNotFoundException {
        var a = new HashMap<>(Map.of(1, "one", 2, "two", 3, "three"));
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
            var b = (Map<Integer, String>) ois.readObject();
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
