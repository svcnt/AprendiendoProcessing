/* 

Aprendiendo Processing - copy()

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


    PImage img;

    int x = 150;

    int y = 75;

    int tam = 200;

     

    void setup() {

      size(300, 300);

      background(0);

    }

     

    void draw() {

      img = loadImage("../../../data/img.jpg");

      //los cuatro primeros datos están controlados por variables

      copy(img, x, y, tam, tam, 10, 10, width-20, height-20);

      x = x+int(random(-1, 1)*2);

      y = y+int(random(-1, 1)*2);

      tam = tam+int(random(-1, 1)*2);

    }