class Bicycle{
void displayFeatures(){
System.out.println("features:pedals,manual power");
}
}
class Motorbike extends Bicycle{
void displayFeatures(){
super.displayFeatures();
System.out.println("added feature by motorbike:engine");
}
}
class Electricbike extends Motorbike{
void displayFeatures(){
super.displayFeatures();
System.out.println("new features by electricbike;electric motor and battery");
}
}
class TranspMul{
public static void main(String args[]){
Electricbike myEbike=new Electricbike();
myEbike.displayFeatures();
}
}