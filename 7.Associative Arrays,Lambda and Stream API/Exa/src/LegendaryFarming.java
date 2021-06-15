import java.util.*;
import java.util.stream.Stream;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> theWeaponCostMaterials = new TreeMap<>();
        theWeaponCostMaterials.put("motes", 0);
        theWeaponCostMaterials.put("fragments", 0);
        theWeaponCostMaterials.put("shards", 0);
        boolean sold = false;
        while (!sold) {
            String[] tokens = scanner.nextLine().split(" ");
            for (int i = 0; i <= tokens.length - 1; i += 2) {
                if (sold){
                    break;
                }
                String theMaterial = tokens[i + 1].toLowerCase();
                int theAmount = Integer.parseInt(tokens[i]);
                Integer bonusMaterial = theWeaponCostMaterials.get(theMaterial);
                if (theWeaponCostMaterials.containsKey(theMaterial)) {
                    theWeaponCostMaterials.put(theMaterial, theAmount + bonusMaterial);
                } else {
                    theWeaponCostMaterials.put(theMaterial, theAmount);
                }
                if (theWeaponCostMaterials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    theWeaponCostMaterials.put("motes", theWeaponCostMaterials.get("motes") - 250);
                    sold = true;

                } else if (theWeaponCostMaterials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    theWeaponCostMaterials.put("fragments", theWeaponCostMaterials.get("fragments") - 250);
                    sold = true;

                } else if (theWeaponCostMaterials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    theWeaponCostMaterials.put("shards", theWeaponCostMaterials.get("shards") - 250);
                    sold = true;

                }
            }
        }
        theWeaponCostMaterials.entrySet().stream()
                .filter(key -> key.getKey().equals("motes") || key.getKey().equals("fragments") || key.getKey().equals("shards"))
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach((a1)-> System.out.println(a1.getKey()+": "+a1.getValue()));

        theWeaponCostMaterials.entrySet().stream()
                .filter(key -> !(key.getKey().equals("motes") || key.getKey().equals("fragments") || key.getKey().equals("shards")))
                .forEach((a1)-> System.out.println(a1.getKey()+": "+a1.getValue()));
    }
}
