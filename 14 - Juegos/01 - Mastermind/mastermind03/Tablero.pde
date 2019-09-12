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
  
  instrucciones(30,360);
}
