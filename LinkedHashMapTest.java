import junit.framework.TestCase;

public class LinkedHashMapTest extends TestCase {

    public void testPutAndGet() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        assertEquals(Integer.valueOf(1), map.get("a"));
        assertEquals(Integer.valueOf(2), map.get("b"));
        assertEquals(Integer.valueOf(3), map.get("c"));
    }


    public void testRemove() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.remove("b");
        assertNull(map.get("b"));
        assertEquals(Integer.valueOf(1), map.get("a"));
        assertEquals(Integer.valueOf(3), map.get("c"));
    }


    public void testKeySet() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        assertEquals(3, map.keySet().size());
        assertTrue(map.keySet().contains("a"));
        assertTrue(map.keySet().contains("b"));
        assertTrue(map.keySet().contains("c"));
    }


    public void testValues() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        assertEquals(3, map.values().size());
        assertTrue(map.values().contains(1));
        assertTrue(map.values().contains(2));
        assertTrue(map.values().contains(3));
    }
}