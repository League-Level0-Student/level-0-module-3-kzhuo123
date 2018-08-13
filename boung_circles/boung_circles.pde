int size=600;
int x1=300;
int x2=1500;
int speed=10;
void setup() {
  size(1800,1000);
}

void draw() {
  size=600;
  noFill();
  background(255,255,255);
 for(int i=0; i<30;i++) {
   ellipse(x1,500,size,size);
  size-=20;
 
 }
 for(int p=0; p<30;p++) {
   ellipse(x2,500,size,size);
   size-=20;
   
 }
 
x1+=speed;
x2-=speed;
 if(x1>=1500||x1<300) {
   speed*=-1;
 }
 }