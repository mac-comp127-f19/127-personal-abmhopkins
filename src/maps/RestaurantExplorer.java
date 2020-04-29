package maps;


import java.util.HashMap;
import java.util.Map;

public class RestaurantExplorer {
    public static void main(String [] args) {
        // Step 1. Create a new empty HashMap.
        // The keys should be the names of the restaurant.
        // The values should be the restaurant objects.
        Map<String, Restaurant> restaurantMap = new HashMap<>();

        // Step 2. Add five restaurants to the map (hint: use put()).
        Restaurant indochin = new Restaurant("Indochin", "Asian", 3);
        Restaurant elBurrito = new Restaurant("El Burrito Mercado", "Mexican", 5);
        Restaurant fiveGuys = new Restaurant("Five Guys", "Burgers", 4);
        Restaurant ichido = new Restaurant("Ichido Ramen", "Japanese", 4);
        Restaurant meatShop = new Restaurant("The Meat Shop", "Sandwiches", 5);

        restaurantMap.put("Indochin", indochin);
        restaurantMap.put("El Burrito Mercado", elBurrito);
        restaurantMap.put("Five Guys", fiveGuys);
        restaurantMap.put("Ichido Ramen", ichido);
        restaurantMap.put("Meat Shop", meatShop);
        // Step 3. Print the names of each restaurant (hint: use keySet()).

        System.out.println(restaurantMap.keySet());

        // Step 4. Remove one of the restaurants by name. Check to make sure
        // it no longer exists and print out the result (hint: use containsKey()).
        if(restaurantMap.containsKey("Five Guys")){
            restaurantMap.remove("Five Guys");
        }
        System.out.println(restaurantMap.keySet());

        // Step 5. Print the restaurant objects (hint: use values())

        for(Restaurant restaurant : restaurantMap.values()){
            System.out.println(restaurant);
        }

        // Step 6. Print the restaurant names and objects (hint: use entrySet()).
        System.out.println(restaurantMap.entrySet());

        for(Map.Entry<String, Restaurant> restaurant : restaurantMap.entrySet()){
            System.out.println(restaurant);
        }
    }
}
