/* 

Formas básicas en Processing / quad()

- Cuadrilátero con vértices móviles

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

void setup() {
	size(400, 400); //tamaño de la ventana. (ancho, alto)
	noFill();
	stroke(255);

}

void draw() {
	background(#202020);
	//Ejemplo 1
	quad(
			25+sin(frameCount*0.05)*25, //esquina 1 x
			25+sin(frameCount*0.06)*25, //esquina 1 y
			width-25+sin(frameCount*0.06)*25, //esquina 2 x
			25+sin(frameCount*0.07)*25, //esquina 2 y
			width-25+sin(frameCount*0.08)*25, //esquina 3 x
			height-25+sin(frameCount*0.06)*25, //esquina 3 y
			25+sin(frameCount*0.05)*25, //esquina 4 x
			height-25+sin(frameCount*0.04)*25 //esquina 4 y

		);
	
}
	