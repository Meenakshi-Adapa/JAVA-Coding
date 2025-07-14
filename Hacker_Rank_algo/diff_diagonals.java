import java .util.*;
class diff_diagonals {
  public static void main(String args[]) {
    Scanner sc = new Scanner (System .in) ;
    int n = sc.nextInt();
    List<List<Integer>> m= new ArrayList<>();
    for(int i = 0; i < n; i++) { 
      List<Integer> row = new ArrayList<>();
      for(int j = 0; j < n; j++) {
        row.add(sc.nextInt());
      } m.add(row);

  }

  List<Integer> pd = new ArrayList<>();
  List<Integer> sd = new ArrayList<>();
  int sum_pd = 0,sum_sd = 0;
  for(int i = 0 ; i< n ; i++) {
    pd.add(m.get(i).get(i));
    sd.add(m.get(i).get(n-1-i));
  } for( int i : pd) {
    sum_pd += i;
  }for( int i : sd) {
    sum_sd += i;
  }

  System.out.println(Math.abs(sum_pd - sum_sd));
}
}