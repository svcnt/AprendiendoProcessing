/* 

Aprendiendo Processing - get()

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


    PImage img;

     

    void setup() {

      img = loadImage("../../../data/img.jpg");

      size(img.width, img.height);

      image(img, 0, 0);

      rectMode(CENTER);

    }

     

    void draw() {

      fill(get(mouseX, mouseY));

      stroke(255);

      rect(width/2, height/2, 50, 50);

    }