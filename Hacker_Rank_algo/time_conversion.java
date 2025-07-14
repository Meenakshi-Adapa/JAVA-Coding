import java .util.*;
class time_conversion {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String t = sc.nextLine();
    String p = t.substring(8,10);
    String h = t.substring(0,2);
    if(p.equals("AM")){
      if(h.equals("12")) {
        String tme = "00" + t.substring(2,8);
        System.out.println(tme);

      } else {
        System.out.println(t.substring(0,8));
      }
    } else if(p.equals("PM")) {
        int hr = Integer.parseInt(h);
        if(hr != 12) {
          hr = hr + 12;
          System.out.println(hr+t.substring(2,8));
    } else {
      System.out.println(t.substring(0,8));
    }
   
  }
}
}