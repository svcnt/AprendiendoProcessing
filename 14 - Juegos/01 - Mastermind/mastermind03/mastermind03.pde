/*
Juego de deducción basado en el cásico Mastermind
*/

//Fuente
PFont font;
//espacios entre agujeros
int espacioH = 25;
int espacioV = 30;
//tamaño de los agujeros
int tam = 10;
//color de los agujeros
color huecos = #666666;
//color del fondo
color fondo = 200;
//colores disponibles para la clave
color[] colores = { 
  #FFD900, #FF8400, #FF0000, #FF00D1, #5C00FF, #00D825
};
//array para almacenar la clave automática
int[] claves = new int[4];
//array para almacenar las jugadas
int[] miClave = new int[0];
//posición del primer pincho
int posicionX = 25;
int posicionY = 30;
//aciertos +color +posición
int negras = 0;
//aciertos +color -posición
int blancas = 0;
//número de intentos
int intentos = 0;

void setup(){
  size(250,550);
  font = loadFont("FuturaBT-Medium-48.vlw");
  generarClave();
}


void draw(){
  if (keyPressed && key=='k') {
    //desplaza el próximo pincho a la primera posición
    posicionX=25;
    posicionY=30;
    generarClave();
  }
  insertarClave();
}

void generarClave() {

  for (int i=0; i<4; i++) {
    claves[i] = 1+int(random(6));
    print(" Clave" + i +": "+ claves[i]);
  }

  if (
  claves[0]==claves[1]
    ||claves[0]==claves[2]
    ||claves[0]==claves[3]
    ||claves[1]==claves[2]
    ||claves[1]==claves[3]
    ||claves[2]==claves[3]
    ) {
    generarClave();
  }

  tablero();
}

void pincho(color c) {
  fill(c);
  strokeWeight(4);
  stroke(#202020, 80);
  ellipse(posicionX, posicionY, 15, 15);
}

void insertarClave() {
  int radio = 7;
  cursor();
  if (mouseX>35-radio && mouseX<35+radio && mouseY>525-radio && mouseY<525+radio && mousePressed) {
    miClave = append(miClave, 1);
    pincho(colores[0]);
    delay(500);
    posicionX+=25;
  }
  if (mouseX>70-radio && mouseX<70+radio && mouseY>525-radio && mouseY<525+radio && mousePressed) {
    miClave = append(miClave, 2);
    pincho(colores[1]);
    delay(500);
    posicionX+=25;
  }
  if (mouseX>105-radio && mouseX<105+radio && mouseY>525-radio && mouseY<525+radio && mousePressed) {
    miClave = append(miClave, 3);
    pincho(colores[2]);
    delay(500);
    posicionX+=25;
  }
  if (mouseX>140-radio && mouseX<140+radio && mouseY>525-radio && mouseY<525+radio && mousePressed) {
    miClave = append(miClave, 4);
    pincho(colores[3]);
    delay(500);
    posicionX+=25;
  }
  if (mouseX>175-radio && mouseX<175+radio && mouseY>525-radio && mouseY<525+radio && mousePressed) {
    miClave = append(miClave, 5);
    pincho(colores[4]);
    delay(500);
    posicionX+=25;
  }
  if (mouseX>210-radio && mouseX<210+radio && mouseY>525-radio && mouseY<525+radio && mousePressed) {
    miClave = append(miClave, 6);
    pincho(colores[5]);
    delay(500);
    posicionX+=25;
  }

  if (posicionX>100) {
    posicionX=25;
    posicionY+=30;
  }

  if (miClave.length == 4) { 

    compararClaves();
    miClave = new int[0];
    delay(500);
  }
}

void cursor() {
  //cambia el cursor en las áreas de clic
  int radio = 7;
  if (
  mouseX>35-radio && mouseX<35+radio && mouseY>525-radio && mouseY<525+radio 
    ||
    mouseX>70-radio && mouseX<70+radio && mouseY>525-radio && mouseY<525+radio
    ||
    mouseX>105-radio && mouseX<105+radio && mouseY>525-radio && mouseY<525+radio
    ||
    mouseX>140-radio && mouseX<140+radio && mouseY>525-radio && mouseY<525+radio
    ||
    mouseX>175-radio && mouseX<175+radio && mouseY>525-radio && mouseY<525+radio
    ||
    mouseX>210-radio && mouseX<210+radio && mouseY>525-radio && mouseY<525+radio
    ) {
    cursor(HAND);
  } else {
    cursor(ARROW);
  }
}


void compararClaves() {
  //color y posición
  if (claves[0]==miClave[0]) {    
    negras++;
  }
  if (claves[1]==miClave[1]) {    
    negras++;
  }
  if (claves[2]==miClave[2]) {    
    negras++;
  }
  if (claves[3]==miClave[3]) {    
    negras++;
  }
  //sólo color
  if (claves[0]==miClave[1] || claves[0]==miClave[2] ||claves[0]==miClave[3]) {    
    blancas++;
  }
  if (claves[1]==miClave[0] || claves[1]==miClave[2] || claves[1]==miClave[3]) {    
    blancas++;
  }
  if (claves[2]==miClave[0] || claves[2]==miClave[1] || claves[2]==miClave[3]) {    
    blancas++;
  }
  if (claves[3]==miClave[0] || claves[3]==miClave[1] || claves[3]==miClave[2]) {    
    blancas++;
  }

  //debug
  for (int i=0; i<4; i++) {    
    println(miClave[i]);
  }
  for (int i=0; i<4; i++) {    
    println(claves[i]);
  }
  println("Blancas: " + blancas);
  println("Negras: " + negras);

  //  resultado
  posicionX=width/2+espacioH;
  posicionY-=30;
  //traduce el valor de 'blancas' en pinchos blancos
  for (int i=0; i<blancas; i++) {
    pincho(#ffffff);
    posicionX+=25;
  }
  //traduce el valor de 'negras' en pinchos negros
  for (int i=0; i<negras; i++) {
    pincho(#000000);
    posicionX+=25;
  }
  //si sacas 4 negras, ganas
  if(negras==4){
    ganaste(0,360);
    
  }
  //ponemos el marcador a cero
  blancas = 0;
  negras = 0;
  //contabilizamos un intento más
  intentos++;
  //si el número de intentos es mayor de 10...
  if (intentos>=10) {
    //desplazamos el próximo pincho a la posición inicial
    posicionX=25;
    posicionY=30;
    //y pierdes
    perdiste(0,360);
    intentos=0;
  }
}


//Ganaste
void ganaste(int x, int y){
  fill(200);
  noStroke();
  rect(x,y-10,width,120);
  textAlign(CENTER);
  textFont(font, 24);
  fill(100);
  ellipse(width/2,y+50,150,150);
  fill(200);
  text("GANASTE", x, y+30, width, 125);
  textFont(font, 18);
  text("Press 'k'", x, y+60, width, 125);
}

//Perdiste
void perdiste(int x, int y){
  fill(200);
  noStroke();
  rect(x,y-10,width,120);
  textAlign(CENTER);
  textFont(font, 24);
  fill(100);
  ellipse(width/2,y+50,150,150);
  fill(200);
  text("PERDISTE", x, y+30, width, 125);
  textFont(font, 18);
  text("PRESS 'k'", x, y+60, width, 125);
}

//Panel inicial (logo, instrucciones)
void instrucciones(int x, int y){  
  textFont(font, 15);
  textAlign(CENTER);
  String s = "Adivina la clave secreta haciendo clic en los colores en el orden deseado. Pulsa 'k' para reiniciar";
  fill(#000000,80);
  text(s, x, y+40, width-60, 125);  // Text wraps within text box
  textFont(font, 36);
  text("DEC   DE", x, y, width-60, 125);
  fill(colores[3]);
  stroke(#000000,80);
  strokeWeight(6);
  ellipse(x+107,y+13,22,22);
}
