import java.util.*;
public class Parabola {
  private int a;
  private int b;
  private int c;
  public Parabola(int a,int b,int c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public double getAxis(){
    return -b/(2.0*a);
  }
  public boolean isOnGraph(int x,int y){
    return a*x*x + b*x +c ==y;
  }
  /*
  public static void main(String[] args){
    Parabola par1 = new Parabola(4,2,-3);
    System.out.println(par1.getAxis());
    System.out.println(par1.isOnGraph(4,3));
  }
  */
}
