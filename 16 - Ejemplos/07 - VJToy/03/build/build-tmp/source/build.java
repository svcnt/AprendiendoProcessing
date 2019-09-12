import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.video.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class build extends PApplet {

/* Set de pruebas para VJing */
/* Crear pantallas (pol\u00edgonos) moldeables para mapping */
/* Pol\u00edgonos manipulables v\u00eda mouse */
/* Crear las pantallas mediante clases */



//LIBRARIES/////////////

//V\u00eddeo




//VARIABLES/////////////

//Texturas para los pol\u00edgonos
//(o 'projections' para las 'screens')

//Im\u00e1genes generadas con Processing
PGraphics pr01;

//Imagen fija
PImage pr02;

//V\u00eddeo
Movie pr03;

//Tama\u00f1o de la ventana
int ancho = 600;
int alto = 600;

//V\u00e9rtices
//Cada screen define los v\u00e9rtices a partir de las coordenadas del centro
//Screen 01
PVector c1 = new PVector(ancho*0.175f, alto*0.5f);
PVector s1v1 = new PVector(c1.x-87.5f, c1.y-285);
PVector s1v2 = new PVector(c1.x+87.5f, c1.y-285);
PVector s1v3 = new PVector(c1.x+87.5f, c1.y+285);
PVector s1v4 = new PVector(c1.x-87.5f, c1.y+285);
//Screen 02
PVector c2 = new PVector(ancho*0.5f, alto*0.5f);
PVector s2v1 = new PVector(c2.x-87.5f, c2.y-285);
PVector s2v2 = new PVector(c2.x+87.5f, c2.y-285);
PVector s2v3 = new PVector(c2.x+87.5f, c2.y+285);
PVector s2v4 = new PVector(c2.x-87.5f, c2.y+285);
//Screen 03
PVector c3 = new PVector(ancho*0.825f, alto*0.5f);
PVector s3v1 = new PVector(c3.x-87.5f, c3.y-285);
PVector s3v2 = new PVector(c3.x+87.5f, c3.y-285);
PVector s3v3 = new PVector(c3.x+87.5f, c3.y+285);
PVector s3v4 = new PVector(c3.x-87.5f, c3.y+285);

//Screens
Screen scr01, scr02, scr03;


//ESTRUCTURA///////////////////

public void setup(){
  size(600, 600, P2D);
  background(0);
  stroke(100);
  //Texturas
  pr02 = loadImage("tex1.jpg");
  pr03 = new Movie(this, "static_1.mp4");
  pr03.loop();
  pr01 = createGraphics(1270/3,710);
  //Ajustes para las texturas
  textureMode(NORMAL); //NORMAL o IMAGE
  textureWrap(REPEAT); //CLAMP o REPEAT
  
}




public void draw(){
	background(0);
	textura();
	//Instancias de la clase Screen
  //Variables: 4 vectores (esquinas) y textura
	scr01 = new Screen(s1v1,s1v2,s1v3,s1v4,pr01);
  //scr01.display();
  scr02 = new Screen(s2v1,s2v2,s2v3,s2v4,pr02);
  //scr02.display();
  scr03 = new Screen(s3v1,s3v2,s3v3,s3v4,pr03);
  //scr03.display();
}




//Mover v\u00e9rtices
public void mouseDragged(){
  scr01.mouseDragged();
  scr02.mouseDragged();
  scr03.mouseDragged();
}


//Actualizar imagen de v\u00eddeo
public void movieEvent(Movie m) {
  m.read();
}



//Textura1

public void textura(){
	pr01.beginDraw();
		pr01.background(0);
		pr01.fill(255);
		pr01.noStroke();
		pr01.rect(0,random(height),width,25);
	pr01.endDraw();
}
//clase
class Screen{

  //VARIABLES///////////////
  PVector v1, v2, v3, v4;
  PImage pr;
  //Est\u00e1 el mouse sobre un v\u00e9rtice?
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

  //M\u00c9TODOS/////////////////
  //Forma
  public void display(){
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
  public void drag(){
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
  public void mouseDragged(){
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










//oldcode--------------
/*
void sc01(){
  //Pol\u00edgono moldeable
  beginShape(QUADS);

	  //texture(tex);
	  texture(pr01);

	  vertex(v1.x,v1.y,0,0);
	  vertex(v2.x,v2.y,1,0);
	  vertex(v3.x,v3.y,1,1);
	  vertex(v4.x,v4.y,0,1);

  endShape();

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
*/
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "build" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
