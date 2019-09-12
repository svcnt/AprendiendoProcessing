/*

Aprendiendo Processing
VJ Toy

Cómo crear pantallas modelables 
que muestran proyecciones de diferentes tipos.

01 - Crear las pantallas

*/

//VARIABLES

//Vértices de la pantalla
PVector v1 = new PVector(10,10);
PVector v2 = new PVector(590,10);
PVector v3 = new PVector(590,590);
PVector v4 = new PVector(10,590);

//¿Arrastrar y soltar?
boolean _v1, _v2, _v3, _v4 = false;

//SETUP

/* Processing 3.0
void settings(){
	size(600, 600, P2D);
}
*/

void setup() {
	//P 3.0? Comment out next line
	size(600, 600, P2D);
	//
	background(0);
	stroke(255);
}

void draw() {
	background(0);
	fill(0);
	pantalla();
	fill(255);
	text("Arrastra las esquinas", 20, 40);
}

void pantalla(){

	// Cuadrilátero
	beginShape(QUADS);
	  vertex(v1.x,v1.y);
	  vertex(v2.x,v2.y);
	  vertex(v3.x,v3.y);
	  vertex(v4.x,v4.y);
  	endShape();

  	testMouseOver();
}


//¿Está el cursor sobre las esquinas de la pantalla?
void testMouseOver(){
	//Si está cerca de la primera esquina...
	if (mouseX>v1.x-5 && mouseX<v1.x+5 && mouseY>v1.y-5 && mouseY<v1.y+5) {
		//... cambia el cursor...
		cursor(HAND);
		//... dibuja un círculo...
		ellipse(v1.x, v1.y, 5, 5);
		//... y avisa de que está.
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

	//Si no está sobre las esquinas...
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

void mouseDragged(){
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

