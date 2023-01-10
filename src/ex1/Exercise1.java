package ex1;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        Map<String, String> HashMap = new HashMap<>();
        HashMap.put("HotWheels", "Машинка");
        HashMap.put("Lego", "Самолет");
        HashMap.put("RoboCrush", "Робот");

        for (Map.Entry<String, String> entry : HashMap.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.print(entry.getValue() + "\n");
        }

        System.out.println("--------------------------------");

        for (String toys : HashMap.keySet()) {
            System.out.println(toys + " для Миши");
        }

        System.out.println("--------------------------------");

        for (String toys : HashMap.values()) {
            System.out.println(toys);
        }
    }
}
