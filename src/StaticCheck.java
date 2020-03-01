public class StaticCheck {

  static String variable = "static variable";

  static void method(){
    System.out.println("static method");
  }

  public static void main(String[] args) {
    StaticCheck staticCheck = new StaticCheck();
    StaticCheck child = new ChildStaticCheck();
    ChildStaticCheck.method();

    System.out.println(StaticCheck.variable);
  }

}


class ChildStaticCheck extends  StaticCheck {
  static String variable = " child static variable";

  static void method(){
    System.out.println("child static method");
    try {
      StaticCheck.method();
    }finally {

    }
  }
}

interface SomeInterface extends SomeInterface1,SomeInterface2 {
  static String Variable="";
}

interface SomeInterface1 {
  static String Variable="";
}
interface SomeInterface2 {
  static String Variable="";
}