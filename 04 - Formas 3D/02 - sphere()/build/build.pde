/* 

Aprendiendo Processing - sphere()

- Dibuja varias esferas
- Número de facetas determinado por pòsición del mouse

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
	
	smooth();
}

//LOOP
void draw() {
	//lights();
	background(#202020);
	sphereDetail(mouseX / 10, mouseY / 10);
	//Fila 1
	//Ejemplo 1
	//Esfera que se desplaza
	pushMatrix();
	translate(map(sin(frameCount*0.05), -1, 1, width*0.25,  width*0.75), height*0.25, 0);
	sphere(50);
	popMatrix();
	//Fila 2
	//Esferas que giran en torno a sus ejes X, Y, Z
	//Ejemplo 2
	pushMatrix();
	fill(#00FFFF);
	stroke(#202020);
	translate(width*0.25, height*0.5, 0);
	rotateX(frameCount*0.01);
	sphere(50);
	popMatrix();
	//Ejemplo 3
	fill(#FF00FF);
	stroke(#202020);
	pushMatrix();
	translate(width*0.5, height*0.5, 0);
	rotateY(frameCount*0.01);
	sphere(50);
	popMatrix();
	//Ejemplo 4
	fill(#FFFF00);
	stroke(#202020);
	pushMatrix();
	translate(width*0.75, height*0.5, 0);
	rotateZ(frameCount*0.01);
	sphere(50);
	popMatrix();
	//Flia 3
	//Esfera que gira alrededor de sus tres ejes y se desplaza en una elipse en los ejes X-Z
	//Ejemplo 5
	fill(#202020);
	stroke(255);
	pushMatrix();
	translate(
		map(sin(frameCount*0.04), -1, 1, width*0.25,  width*0.75), 
		height*0.75, 
		map(cos(frameCount*0.04), -1, 1, 50,  -200)
		);
	rotateX(frameCount*0.05);
	rotateY(frameCount*0.06);
	rotateZ(frameCount*0.07);
	sphere(50);
	popMatrix();

}