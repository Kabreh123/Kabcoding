void setup()
{
  size(700,600);
  
  fill(120);
  stroke(200);
}
                 
void draw()
{
  background(133,180,170);
  strokeWeight(0.3);
  fill(0,255,0);
  ellipse(48, 40, 40, 60);

  strokeWeight(3.2);
  fill(0, 0, 255);
  ellipse(90, 40, 40, 60);
  
  strokeWeight(1.2);
  fill(0, 0, 255);
  rect(120,30,50,40);
  
  strokeWeight(7.2);
  fill(245, 194, 8);
  ellipse(200, 46, 45, 60);
  
  strokeWeight(0.9);
  fill(0, 0, 255);
  rect(236,30,53,40);
  
  strokeWeight(1.3);
  fill(245,72, 8);
  circle(316, 40, 45);
  
  strokeWeight(3.9);
  rect(340, 30, 51, 45);
  strokeWeight(0.6);
  rect(398, 30, 51, 45);
  
  strokeWeight(1.5);
  fill(245, 194, 8);
  ellipse(480, 40, 40, 60);
  //change this line later
  strokeWeight(0.5);
  fill(245, 194, 8);
  rect(508, 30, 50, 40);
  fill(0,255,0);
  strokeWeight(1.9);
  triangle(568,35, 611,45, 589,70);
  
  rect(590, 45, 10, 10);
  
  strokeWeight(1.3);
  fill(245, 194, 8);
  rect(620, 30, 40, 60);
  
  rect(645, 45, 10, 10);
  
  
  
  circle(mouseX,mouseY,35);
}
