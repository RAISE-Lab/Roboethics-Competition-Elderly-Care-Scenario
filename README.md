# ICRA 2022 Roboethics Competition Hackathon 


## Relevant Files:

**Controller.pde** : commands the robot
* `command(...)` : this method gives the following command to the robot (described in everyday language): `[REQUESTER] asks the robot to fetch [ITEM] and bring it to the [RECEIVER]`
* The tail of the `command` method This may be a useful place for conditional logic as direct references to Items and Characters for the robot to fetch are placed here.
* `fetchProcedureAsync(...)` : moves the robot between rooms to pick up an item and remove it. This is called at the end of `command()`.

**roboethics.pde** : main script
* This is the point of entry for the Processing scripts.
* `setup()` inits Processing and scenario.
* `draw()` Main render loop. Renders everything to the screen.

**Scenario.java**  : defines and contains scene map (i.e. rooms, connections, and characters).
* Scenario is a static singleton class. 
* Scenario contains all Rooms, Characters, and Items.

**Item.java / Character.java** : base class for items and characters
* They all inherit from Entity
* All Items/Characters have a name (String) and image associated with them. The rest is open for you to implement (if you wish).

---

## Useful methods and variables
### Accessing rooms, characters, and items
* `Scenario` is a singleton that contains references to all the Rooms, Characters, Items, and connections between them. These objects are stored in a HashMap. You can access objects in any other class like this:
    * `Scenario.instance().rooms.get("Kitchen");` (gets the kitchen)
    * `Scenario.instance().characters.get("Amy Copper");` (gets the daughter character)
    * `Scenario.instance().items.get("Knife");` (gets the knife)

---
## The Relationship between Processing and Java
Processing.org declares Processing to be a language. 
Others see it as a Java library. 
Wikipedia defines it as a graphical library and IDE. 
Personally speaking, I think of it more as a Java library. 
This is because files that are named `.pde` are actually `.java` files in disguise that extend `PApplet`. 
You may notice that some files in this repo use the `.pde` extension, while others use `.java`. The files that use .java in *general* do not depend on the processing library. The main exception is `Room.java` which does not extend `PApplet` but instead does operations on a `PApplet` object. You can think of
`PApplet` as a "context" that all the Processing-related graphical components are rendered to. It is technically possible to have multiple PApplets but that thought gives me a headache---in all practicality, Processing sketches only operate on one PApplet.

A note on IDEs and debugging: Processing provides an IDE which works "good enough" for debugging. 
It is rather sparse, and it is possible to run Processing in other IDEs (e.g. Eclipse or VScode).
That said, if you're trying to make a complete product in the next 5 or so hours, it is my opinion that it may not be worth the time to hack Processing into another IDE and just stick with the one Processing supplies. This is of course just an opinion---you know your own development preferences best!  

---
## Some notes on the GUI
The GUI is rendered in GUI.pde. I would say that when it comes to Processing, making UIs is not the easiest. It is more built for creative coding and basic graphics. That said, it's clearly not impossible. We used buttons from the `cards_ui.pde` library. We also used dropdowns from the uibooster-for-processing library. If you need to extend the GUI to include additional buttons or input, `cards_ui.pde` is easy to get started with, but the latest stable release lacks several core features (e.g. dropdown lists). If you wanted to have e.g. text input, sliders, or more dropdown options, I would use `uibooster`. GUI.pde gives a good example of how `cards_ui` and `uibooster` work together.
