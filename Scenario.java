// a singleton representing the scenario

import java.util.ArrayList;
import java.util.HashMap;


class Scenario {

   // -----------------------------------------------------------\\
   // singleton method
   // -----------------------------------------------------------//
    private static Scenario _instance = null;

    public static Scenario instance(){
        if (_instance == null){
            _instance = new Scenario();
        }
        return _instance;
    }
    
   // -----------------------------------------------------------\\
   // defining scenario objects
   // -----------------------------------------------------------//

    // rooms ......................................................

    public static HashMap<String, Room> rooms = new HashMap<String, Room>() {{
        
        put("Reception", new Room("Reception", "assets/rooms/reception.jpg", 1f, 2f ));
        put("Corridor Block1", new Room("Corridor Block1", "assets/rooms/corr3.jpg", 2f, 2f ));
        put("Nurse Station", new Room("Nurse Station", "assets/rooms/nursestation.jpg", 3f, 2f ));
        put("Corridor Block4", new Room("Corridor Block4", "assets/rooms/corr4.jpg", 4f, 2f ));
        put("Laundry", new Room("Laundry", "assets/rooms/laundry.jpg", 5f, 2f ));
        put("Corridor Block2", new Room("Corridor Block2", "assets/rooms/corr2.jpg", 3f, 1f ));
        put("Corridor Block3", new Room("Corridor Block3", "assets/rooms/corr1.jpg", 3f, 0f ));
        put("Private Room1", new Room("Private Room1", "assets/rooms/Room1.jpg", 2f, 0f ));
        put("Private BathRoom1", new Room("Private BathRoom1", "assets/rooms/bath1.jpg", 1f, 0f ));
        put("Private Room2", new Room("Private Room2", "assets/rooms/Room2.jpg", 4f, 0f ));
        put("Private BathRoom2", new Room("Private BathRoom2", "assets/rooms/bath2.jpg", 5f, 0f ));
        put("Corridor Block5", new Room("Corridor Block3", "assets/rooms/corr2.jpg", 3f, 3f ));
        put("Common Toilet", new Room("Common Toilet", "assets/rooms/bath3.jpg", 2f, 3f ));
        put("Medical Room", new Room("Medical Room", "assets/rooms/medical.jpg", 4f, 3f ));
        put("Corridor Block6", new Room("Corridor Block3", "assets/rooms/corr5.jpg", 3f, 4f ));
        put("Living Area 2", new Room("Living Area 2", "assets/rooms/living2.jpg", 2f, 4f ));
        put("Living Area 1", new Room("Living Area 1", "assets/rooms/living1.jpg", 1f, 4f ));
        put("Dining", new Room("Dining", "assets/rooms/dining.jpg", 4f, 4f ));
        put("Kitchen", new Room("Kitchen", "assets/rooms/kitchen.jpg", 5f, 4f ));


    }}; 

    // characters .................................................

    public static HashMap<String, Character> characters = new HashMap<String, Character>(){{

        put("Robot",      new Character("Robot",      "assets/characters/robot.png"));
        put("Nurse 01",   new Character("Nurse 01", "assets/characters/nurse-1.png"));
        put("Nurse 02",   new Character("Nurse 02", "assets/characters/nurse-2.png"));
        put("Guest 01",   new Character("Guest 01", "assets/characters/guest-1.png"));
        put("Guest 02",   new Character("Guest 02", "assets/characters/guest-2.png"));
        put("Guest 03",   new Character("Guest 03", "assets/characters/guest-3.png"));
        put("Guest 04",   new Character("Guest 04", "assets/characters/guest-4.png"));
        put("Resident Man 01", new Character("Resident Man 01", "assets/characters/resident-man-1.png"));
        put("Resident Man 02", new Character("Resident Man 02", "assets/characters/resident-man-2.png"));
        put("Resident Man 03", new Character("Resident Man 03", "assets/characters/resident-man-3.png"));
        put("Resident Woman 01", new Character("Resident Woman 01", "assets/characters/resident-woman-1.png"));
        put("Resident Woman 02", new Character("Resident Woman 02", "assets/characters/resident-woman-2.png"));
        put("Resident Woman 03", new Character("Resident Woman 03", "assets/characters/resident-woman-3.png"));
        put("Cleaner",  new Character("Cleaner", "assets/characters/cleaner.png"));
        put("Security Guard", new Character("Security Guard", "assets/characters/security-guard.png"));
        put("Buddy the Dog", new Character("Buddy the Dog", "assets/characters/dog.png"));
        put("Cook", new Character("Cook", "assets/characters/chef.png"));
                
    }};


    // items ......................................................

    public static HashMap<String, Item> items = new HashMap<String, Item>(){{
        put("Credit Card", new Item("Credit Card", "assets/items/credit_card.png")); 
        put("Wallet",      new Item("Wallet", "assets/items/wallet.png")); 
        put("Knife",       new Item("Knife", "assets/items/knife.png")); 
        put("Beer",        new Item("Beer", "assets/items/beer.png")); 
        put("Diary",       new Item("Diary", "assets/items/diary.png"));
        put("Photo Album", new Item("Photo Album", "assets/items/book.png"));
        put("Burger",      new Item("Burger", "assets/items/burger.png"));
        put("Cupcake",         new Item("Cupcake", "assets/items/cupcake.png"));
        put("Fire Extinguisher",       new Item("Fire Extinguisher", "assets/items/extinguisher.png"));
        put("Fried Shrimp",    new Item("Fried Shrimp", "assets/items/fried-shrimp.png"));
        put("Gun",         new Item("Gun", "assets/items/gun.png"));
        put("Key-Chain",   new Item("Key-Chain", "assets/items/key-chain.png"));
        put("Laundry Basket",  new Item("Laundry Basket", "assets/items/laundry-basket.png"));
        put("Lighter",     new Item("Lighter", "assets/items/lighter.png"));
        put("Medical History", new Item("Medical History", "assets/items/medical-history.png"));
        put("Medicine",    new Item("Medicine", "assets/items/medicine.png"));
        put("Peanut Butter",   new Item("Peanut Butter", "assets/items/peanut-butter.png"));
        put("Phone",       new Item("Phone", "assets/items/phone.png"));
        put("Toilet Roll",     new Item("Toilet Roll", "assets/items/toilet-roll.png"));
        put("Walkie Talkie",   new Item("Walkie Talkie", "assets/items/walkie-talkie.png"));
        

    }};

    
    
    private Scenario(){

        // -----------------------------------------------------------\\
        // creating map        
        // -----------------------------------------------------------//

        // connecting rooms ............................................
        rooms.get("Reception").addConnection(rooms.get("Corridor Block1"));
        rooms.get("Corridor Block1").addConnection(rooms.get("Nurse Station"));
        rooms.get("Nurse Station").addConnection(rooms.get("Corridor Block4"));
        rooms.get("Nurse Station").addConnection(rooms.get("Corridor Block2"));
        rooms.get("Nurse Station").addConnection(rooms.get("Corridor Block5"));
        rooms.get("Corridor Block2").addConnection(rooms.get("Corridor Block3"));
        rooms.get("Corridor Block3").addConnection(rooms.get("Private Room1"));
        rooms.get("Private Room1").addConnection(rooms.get("Private BathRoom1"));
        rooms.get("Corridor Block3").addConnection(rooms.get("Private Room2"));
        rooms.get("Corridor Block4").addConnection(rooms.get("Laundry"));
        rooms.get("Private Room2").addConnection(rooms.get("Private BathRoom2"));
        rooms.get("Corridor Block5").addConnection(rooms.get("Medical Room"));
        rooms.get("Corridor Block5").addConnection(rooms.get("Corridor Block6"));
        rooms.get("Corridor Block6").addConnection(rooms.get("Living Area 2"));
        rooms.get("Living Area 2").addConnection(rooms.get("Living Area 1"));
        rooms.get("Living Area 2").addConnection(rooms.get("Common Toilet"));
        rooms.get("Corridor Block6").addConnection(rooms.get("Dining"));
        rooms.get("Dining").addConnection(rooms.get("Kitchen"));
        

        
        
                
        
        // placing characters ..........................................
        rooms.get("Corridor Block1").addCharacter(characters.get("Robot"));
        rooms.get("Nurse Station").addCharacter(characters.get("Nurse 02"));
        rooms.get("Private Room1").addCharacter(characters.get("Nurse 01"));
        rooms.get("Private Room1").addCharacter(characters.get("Resident Woman 01"));
        rooms.get("Private Room2").addCharacter(characters.get("Resident Man 01"));
        rooms.get("Living Area 1").addCharacter(characters.get("Resident Woman 02"));
        rooms.get("Living Area 2").addCharacter(characters.get("Resident Man 02"));
        rooms.get("Dining").addCharacter(characters.get("Resident Man 03"));
        rooms.get("Medical Room").addCharacter(characters.get("Resident Woman 03"));
        rooms.get("Laundry").addCharacter(characters.get("Cleaner"));     
        rooms.get("Reception").addCharacter(characters.get("Security Guard"));
        rooms.get("Kitchen").addCharacter(characters.get("Cook"));
        rooms.get("Corridor Block3").addCharacter(characters.get("Guest 01"));
        rooms.get("Corridor Block3").addCharacter(characters.get("Guest 02"));
        rooms.get("Corridor Block5").addCharacter(characters.get("Guest 03"));
        rooms.get("Corridor Block6").addCharacter(characters.get("Guest 04"));
        rooms.get("Corridor Block5").addCharacter(characters.get("Buddy the Dog"));


        // placing items .............................................
        rooms.get("Kitchen")     .addItem(items.get("Knife"));
        rooms.get("Private Room1")   .addItem(items.get("Diary"));
        rooms.get("Private Room2").addItem(items.get("Credit Card"));
        rooms.get("Living Area 1")   .addItem(items.get("Wallet"));
        rooms.get("Living Area 1")    .addItem(items.get("Beer"));       
        rooms.get("Dining")    .addItem(items.get("Fried Shrimp"));
        rooms.get("Dining")    .addItem(items.get("Burger"));
        rooms.get("Living Area 2")    .addItem(items.get("Cupcake"));
        rooms.get("Private Room1")    .addItem(items.get("Peanut Butter"));
        rooms.get("Corridor Block1")    .addItem(items.get("Fire Extinguisher"));
        rooms.get("Private Room2")    .addItem(items.get("Photo Album"));
        rooms.get("Reception")    .addItem(items.get("Gun"));
        rooms.get("Reception")    .addItem(items.get("Walkie Talkie"));
        rooms.get("Nurse Station")    .addItem(items.get("Key-Chain"));
        rooms.get("Laundry")    .addItem(items.get("Laundry Basket"));
        rooms.get("Kitchen")    .addItem(items.get("Lighter"));
        rooms.get("Medical Room")    .addItem(items.get("Medical History"));
        rooms.get("Medical Room")    .addItem(items.get("Medicine"));
        rooms.get("Living Area 2")    .addItem(items.get("Phone"));
        rooms.get("Common Toilet")    .addItem(items.get("Toilet Roll"));
    }

    public Character getRobot(){
        return characters.get("Robot");
    }
}
