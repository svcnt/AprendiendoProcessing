/* 

Aprendiendo Processing - box()



José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES

//SETUP
void setup() {
	size(512, 512, P3D);
	stroke(255);
	fill(#202020);
}

//LOOP
void draw() {
	//luces por defecto
	lights();
	background(#202020);
	//Fila 1
	//Ejemplo 1
	//Cubo que se desplaza
	pushMatrix();
	translate(map(sin(frameCount*0.05), -1, 1, width*0.25,  width*0.75), height*0.25, 0);
	box(100);
	popMatrix();
	//Fila 2
	//Paralelepípedos que giran en torno a sus ejes X, Y, Z
	//Ejemplo 4
	pushMatrix();
	translate(width*0.25, height*0.5, 0);
	rotateX(frameCount*0.05);
	box(100,100,25);
	popMatrix();
	//Ejemplo 5
	pushMatrix();
	translate(width*0.5, height*0.5, 0);
	rotateY(frameCount*0.05);
	box(100,100,25);
	popMatrix();
	//Ejemplo 6
	pushMatrix();
	translate(width*0.75, height*0.5, 0);
	rotateZ(frameCount*0.05);
	box(100,100,25);
	popMatrix();
	//Flia 3
	//Cubo que gira alrededor de sus tres ejes y se desplaza en una elipse en los ejes X-Z
	//Ejemplo 7
	pushMatrix();
	translate(
		map(sin(frameCount*0.04), -1, 1, width*0.25,  width*0.75), 
		height*0.75, 
		map(cos(frameCount*0.04), -1, 1, 50,  -200)
		);
	rotateX(frameCount*0.05);
	rotateY(frameCount*0.06);
	rotateZ(frameCount*0.07);
	box(100);
	popMatrix();

}