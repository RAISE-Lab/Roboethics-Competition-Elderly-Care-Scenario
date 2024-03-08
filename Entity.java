import processing.core.PApplet;
import processing.core.PImage;

class Entity extends PApplet {
  String name;
  protected PImage img; 
  protected String imagePath; 
  
  
  Entity(String name, String imagePath){
    this.name = name;
    this.imagePath = imagePath;
  }

  public void init(PApplet papplet){
    this.img = papplet.loadImage(this.imagePath);
  }

  public void getImage(PApplet papplet, float x, float y, int width, int height){
    papplet.image(this.img, x, y, width, height);
    papplet.textSize(10);
    papplet.fill(0,0,0);
    papplet.text(name,x+25,y+50);    

  }

  //public void update(PApplet papplet){};
}
