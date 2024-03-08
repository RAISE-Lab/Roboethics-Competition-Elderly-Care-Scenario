GUI gui;
PFont mono;
Controller controller;

void setup(){

  // global screen and font settings
  fullScreen();
  mono = createFont("assets/UbuntuMono-Regular.ttf", 128);
  textFont(mono, 30);

  // initializing important objects
  controller = new Controller(); // commands robot
  Scenario scene = Scenario.instance(); // singleton object that defines the scene
  gui = new GUI(); // bottom UI panel

  // initialize rooms, characters, and items
  for (Room room : scene.rooms.values()) {
    room.init(this);
  }

  for (Character chara : scene.characters.values()){
    chara.init(this);
  }

  for (Item item : scene.items.values()){
    item.init(this);
  }


}

void draw(){
  background(248, 255, 229); // background color
  updateRooms(Scenario.instance().rooms); // renders rooms
  gui.update(controller); // renders GUI
}

void updateRooms(HashMap<String, Room> rooms){
    for (Room room : rooms.values()) {
      room.update(this);
    }
}
