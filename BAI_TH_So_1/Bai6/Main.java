package Bai6;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DANHSACH.in"));
            Set<String> uniqueNames = new LinkedHashSet<>();
            while (sc.hasNextLine()) {
                String name = sc.nextLine().trim().toLowerCase();
                if (!name.isEmpty()) {
                    uniqueNames.add(normalizeName(name));
                }
            }
            sc.close();

            Map<String, Integer> emailCount = new HashMap<>();
            for (String name : uniqueNames) {
                String email = generateEmail(name, emailCount);
                System.out.println(email);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    private static String normalizeName(String name) {
        String[] parts = name.split("\\s+");
        StringBuilder normalized = new StringBuilder();
        for (String part : parts) {
            normalized.append(Character.toLowerCase(part.charAt(0)))
                      .append(part.substring(1).toLowerCase())
                      .append(" ");
        }
        return normalized.toString().trim();
    }

    private static String generateEmail(String name, Map<String, Integer> emailCount) {
        String[] parts = name.split("\\s+");
        StringBuilder email = new StringBuilder();
        email.append(parts[parts.length - 1]); 
        for (int i = 0; i < parts.length - 1; i++) {
            email.append(parts[i].charAt(0));
        }
        String baseEmail = email.toString();
        emailCount.put(baseEmail, emailCount.getOrDefault(baseEmail, 0) + 1);
        if (emailCount.get(baseEmail) > 1) {
            email.append(emailCount.get(baseEmail)); 
        }
        email.append("@ptit.edu.vn");
        return email.toString();
    }
}