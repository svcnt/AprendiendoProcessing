/* 

Aprendiendo Processing - switch()

- Cambia de cuadrado a círculo cada 100 fotogramas

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
//variable que modifica el switch
int contador = 0;

//SETUP
void setup() {
	size(400,400);
	background(#202020);
	stroke(255);
	fill(#202020);
	rectMode(CENTER);
}

//LOOP
void draw() {
	//suma 1 a 'contador' cada 100 fotogramas
	if (frameCount % 100 == 0) {
	 	contador++;
	 } 
	
	switch (contador) {
		//se ejecuta por defecto
		default :
			rect(width/2, height/2, 300, 300);
		break;	
		//si 'contador' es igual a 1
		case 1 :
			background(#202020);
			ellipse(width/2, height/2, 300, 300);
		break;
		//si 'contador' es igual a 2
		case 2 :
			//reinicia 'contador'
			contador = 0;
		break;
		
	}
}