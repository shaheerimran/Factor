public class Factor {
  public static void main(String[] args) {
    findFactor(1044);
  }

  public static void findFactor(int number){
    for(int x = 2; x <= number/2; x++){
      if(number % x != 0){
      	continue;
      }
      else{
      	System.out.println("( " + x + " , " + number/x + " )");
      }
    }
  }
}
