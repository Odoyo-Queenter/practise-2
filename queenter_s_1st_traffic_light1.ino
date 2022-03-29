// C++ code
//
int Green = 3;
int Yellow = 2;
int Red = 1;
void setup()
{  
 pinMode(Green,OUTPUT);
  pinMode(Yellow,OUTPUT);
  pinMode(Red,OUTPUT);
}

void loop()
{
  digitalWrite(Green, HIGH);
  delay(1000); // Wait for 1000 millisecond(s)
  digitalWrite(Green, LOW);
  delay(9000); // Wait for 1000 millisecond(s)
  digitalWrite(Yellow, HIGH);
  delay(5000);
  digitalWrite(Yellow, LOW);
  delay(10000);
  digitalWrite(Red, HIGH);
  delay(9000);
  digitalWrite(Red, LOW);
  delay(9000);
}