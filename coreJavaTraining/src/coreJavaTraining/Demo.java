package coreJavaTraining;

class Demo{
    int  value1;
    int  value2;
    Demo(){
       value1 = 10;
       value2 = 20;
       System.out.println("Inside Constructor");
   }

   public void display(){
      System.out.println("Value1 === "+value1);
      System.out.println("Value2 === "+value2);
  }

 public static void main(String args[]){
     Demo d1 = new Demo();
//     int time=1;
    d1.display();
//    System.out.println((time<18)?"good day":"good evening");
}

}
