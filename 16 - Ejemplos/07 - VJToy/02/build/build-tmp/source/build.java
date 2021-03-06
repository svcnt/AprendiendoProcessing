import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class build extends PApplet {

/*

Aprendiendo Processing
VJ Toy

C\u00f3mo crear pantallas modelables 
que muestran proyecciones de diferentes tipos.

02 - A\u00f1adir textura

*/

//VARIABLES

//Textura
PGraphics t1;

//V\u00e9rtices de la pantalla
PVector v1 = new PVector(10,10);
PVector v2 = new PVector(590,10);
PVector v3 = new PVector(590,590);
PVector v4 = new PVector(10,590);

//\u00bfArrastrar y soltar?
boolean _v1, _v2, _v3, _v4 = false;

//SETUP

/* Processing 3.0
void settings(){
	size(600, 600, P2D);
}
*/

public void setup() {
	//P 3.0? Comment out next line
	size(600, 600, P2D);
	//
	background(0);
	stroke(255);

	//Textura
	t1 = createGraphics(580,580);
  	textureMode(NORMAL);
  	textureWrap(REPEAT);
}

public void draw() {
	background(0);
	textura();
	pantalla();
}

//Textura
public void textura(){
	t1.beginDraw();
		t1.background(0);
		t1.fill(255);
		t1.noStroke();
		t1.rect(0,random(height),width,25);
	t1.endDraw();
}

public void pantalla(){
	
	// Cuadril\u00e1tero
	beginShape(QUADS);
		//Textura
		texture(t1);
		//A\u00f1adir puntos de anclaje
		vertex(v1.x,v1.y, 0,0);
	  	vertex(v2.x,v2.y, 1,0);
	  	vertex(v3.x,v3.y, 1,1);
	  	vertex(v4.x,v4.y, 0,1);
  	endShape();

  	testMouseOver();
}


//\u00bfEst\u00e1 el cursor sobre las esquinas de la pantalla?
public void testMouseOver(){
	//Si est\u00e1 cerca de la primera esquina...
	if (mouseX>v1.x-5 && mouseX<v1.x+5 && mouseY>v1.y-5 && mouseY<v1.y+5) {
		//... cambia el cursor...
		cursor(HAND);
		//... dibuja un c\u00edrculo...
		ellipse(v1.x, v1.y, 5, 5);
		//... y avisa de que est\u00e1.
		_v1 = true;
	} 

	//Igual para la segunda esquina
	else if (mouseX>v2.x-5 && mouseX<v2.x+5 && mouseY>v2.y-5 && mouseY<v2.y+5) {
	  	cursor(HAND);
	  	ellipse(v2.x, v2.y, 5, 5);
	  	_v2 = true;
	}

	//Igual para la tercera
	else if (mouseX>v3.x-5 && mouseX<v3.x+5 && mouseY>v3.y-5 && mouseY<v3.y+5) {
	  	cursor(HAND);
	  	ellipse(v3.x, v3.y, 5, 5);
	  	_v3 = true;
	}

	//Igual para la cuarta
	else if (mouseX>v4.x-5 && mouseX<v4.x+5 && mouseY>v4.y-5 && mouseY<v4.y+5) {
	  	cursor(HAND);
	  	ellipse(v4.x, v4.y, 5, 5);
	  	_v4 = true;
	}

	//Si no est\u00e1 sobre las esquinas...
	else { 
		//... el cursor es una flecha...
	  	cursor(ARROW); 

	  	//... y avisa.
	  	_v1 = false;
	  	_v2 = false;
	  	_v3 = false;
	  	_v4 = false;

	}
}

public void mouseDragged(){
	if (_v1 == true) {
		v1.x = mouseX;
		v1.y = mouseY;
	}

	else if (_v2 == true) {
		v2.x = mouseX;
		v2.y = mouseY;
	}

	else if (_v3 == true) {
		v3.x = mouseX;
		v3.y = mouseY;
	}

	else if (_v4 == true) {
		v4.x = mouseX;
		v4.y = mouseY;
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "build" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
