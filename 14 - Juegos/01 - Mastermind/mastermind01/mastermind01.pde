/*
Juego de deducción basado en el cásico Mastermind
*/

int espacioH = 25;
int espacioV = 30;
int tam = 10;
color huecos = #666666;
color fondo = 200;
color[] colores = { 
  #FFD900, #FF8400, #FF0000, #FF00D1, #5C00FF, #00D825
};

void setup(){
  size(250,550);
  tablero();
}

void draw(){
  
}

void tablero() {
  noStroke();
  background(fondo);
  fill(huecos);
  //primera columna de agujeros (4x10)
  for (int i=1; i<=4; i++) {
    for (int ii=1; ii<=10; ii++) {
      ellipse(i*espacioH, ii*espacioV, tam, tam);
    }
  }
  //segunda columna de agujeros (4x10)
  for (int i=1; i<=4; i++) {
    for (int ii=1; ii<=10; ii++) {
      ellipse(width/2+i*espacioH, ii*espacioV, tam, tam);
    }
  }
  //línea de 6 colores en la base
  for (int i=1; i <7; i++) {
    fill(colores[i-1]);
    strokeWeight(4);
    stroke(#202020,80);
    ellipse(i*(width/7), 525, 15, 15);
  }
}
