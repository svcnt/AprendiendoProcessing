//Textura1

void textura(){
	pr01.beginDraw();
		pr01.background(0);
		pr01.fill(255);
		pr01.noStroke();
		pr01.rect(0,random(height),width,25);
	pr01.endDraw();
}