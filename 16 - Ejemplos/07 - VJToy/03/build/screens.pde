//clase
class Screen{

  //VARIABLES///////////////
  PVector v1, v2, v3, v4;
  PImage pr;
  //Está el mouse sobre un vértice?
  boolean _mv1, _mv2, _mv3, _mv4 = false;

  //CONSTRUCTOR/////////////
  //Variables: 4 esquinas del QUAD, textura
  Screen(PVector _v1, PVector _v2, PVector _v3, PVector _v4, PImage _pr ){
    v1 = _v1;
    v2 = _v2;
    v3 = _v3;
    v4 = _v4;
    pr = _pr;

    display();
  }

  //MÉTODOS/////////////////
  //Forma
  void display(){
    noFill();
    stroke(255);
    beginShape(QUADS);

      texture(pr);

      vertex(v1.x,v1.y,0,0);
      vertex(v2.x,v2.y,1,0);
      vertex(v3.x,v3.y,1,1);
      vertex(v4.x,v4.y,0,1);

    endShape();

    drag();

  }

  //Hot spot
  void drag(){
    if (mouseX>v1.x-5 && mouseX<v1.x+5 && mouseY>v1.y-5 && mouseY<v1.y+5) {
    cursor(HAND);
    ellipse(v1.x, v1.y, 5, 5);
    _mv1 = true;
    } 

    else if (mouseX>v2.x-5 && mouseX<v2.x+5 && mouseY>v2.y-5 && mouseY<v2.y+5) {
      cursor(HAND);
      ellipse(v2.x, v2.y, 5, 5);
      _mv2 = true;
    }

    else if (mouseX>v3.x-5 && mouseX<v3.x+5 && mouseY>v3.y-5 && mouseY<v3.y+5) {
      cursor(HAND);
      ellipse(v3.x, v3.y, 5, 5);
      _mv3 = true;
    }


    else if (mouseX>v4.x-5 && mouseX<v4.x+5 && mouseY>v4.y-5 && mouseY<v4.y+5) {
      cursor(HAND);
      ellipse(v4.x, v4.y, 5, 5);
      _mv4 = true;
    }

    else { 
      cursor(ARROW); 

      _mv1 = false;
      _mv2 = false;
      _mv3 = false;
      _mv4 = false;

    }


  }

  //Drag & drop
  void mouseDragged(){
    if (_mv1 == true) {
      v1.x = mouseX;
      v1.y = mouseY;
    }

    else if (_mv2 == true) {
      v2.x = mouseX;
      v2.y = mouseY;
    }

    else if (_mv3 == true) {
      v3.x = mouseX;
      v3.y = mouseY;
    }

    else if (_mv4 == true) {
      v4.x = mouseX;
      v4.y = mouseY;
    }
  }

}