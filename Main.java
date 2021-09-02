class Main {
  public static void main(String[] args) {
    //77 int
    //-4554 int
    //0 int
    //0.00 double
    //-15.4 double
    //478.9345 double
    //check to see whether or not enrolled boolean
    //text line Hi String
    //$ char

    //true: 1
    //false: 0

    int num = 77;

    final double PI = 3.14; //final means you can't change what's assigned to pi
    //pi = -1;

    //constants
    //data you want to store, where the value
    //doesn't change:
    //final <type> NAME_OF_DATA;

    double diameter = PI * (4.5 * 4.5);
    //examples of cpnstants:
    // - any other mathematical constant, like e
    // - dimensions, measurements

    //---------------------------------------------

    int sum = 0;
    sum = sum + num;
    sum += num;
    //System.out.println(sum);
    
    sum -= 2; //sum = sum + 2;
    sum++; //sum = sum+1

    //---------------------------------------------
    //Find the error:

    int a; //look for missing ;s
    a = 0;

    //System.out.println("ab"); //make sure using""instead of''for longer than one char

    double b = 3.2; //if decimal, need double type

    int x;
    x = 1;
    int r = x + 1;

    //---------------------------------------------

    int c = (int)3.2; //forces into int by cutting off decimal
    //System.out.println(c);
    double d = (double) c;
    //System.out.println(d);

    //---------------------------------------------

    // <
    // >
    // <=
    // >=
    // == --> test to see if equal
    // !=

    // = assignment operator

    if (a == b) { //need {} when multiple lines associated to if statement
      //System.out.println("they are equal");
      //System.out.println(a);
    }

    if (a != b) {
      //System.out.println("they are not equal");
    }

    boolean check = false;
    if (check) {    //also could use check == true
      //System.out.println("check is false");
    }

    if (!check) {   //also could use check != true OR check == false
      //System.out.println("check is false");
    }

    //---------------------------------------------

    // || or
    // && and
    // ! not

    if ( (a < b && check == false) || c == 7) 
    {
      System.out.println("a is less than b and check is false");
    }

    //---------------------------------------------
     int mod = 10 % 2;
     System.out.println(mod);
  }
}