import java.util.*;
public class Convert {
  public static String convertToBinary(int n){
    int current = n;
    String bin = "";
    while (current != 0){
      bin = (current%2)+bin;
      current/=2;
    }
    return bin;
  }
  public static String convertToDecimal(String b){
    int sum =0;
    for(int i = b.length(); i>0;i--){
      if(b.substring(i-1,i).equals("1"))
        sum+= Math.pow(2,i);
    }
    return ""+sum;
  }
}
