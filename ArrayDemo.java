public class ArrayDemo{
  public static void main(String[] args){
    int[] booyea = {
    100, 200, 300,
    400, 500, 600,
    700, 800, 900, 1000
  };
  printArray(booyea);
  }

  public static void printArray(int[]ary){
    String s = "{";
    for(int i = 0; i < ary.length; i = i + 1){
      s = s + ary[i] + ",";
    }
    s = s + "}";
    System.out.println(s);
  }

  public static void printArray(int[][]ary){
    String rar = "{";
    for(int i = 0; i < ary.length; i = i + 1){
      rar = rar + ary[i] + "}" + " " + "{";
      for(int j = 0; j < ary[i].length;j = j + 1){
        rar = rar + ary[i][j] + ",";
      }
      rar = rar + "}";
    }
    System.out.print(rar);
  }

  public static int countZeros2D(int[][] nums){
    int zeros = 0;
    for(int i = 0; i < nums.length; i = i + 1){
      if(nums[i] == 0){
        zeros = zeros + 1;
      }
      for(int j = 0; j < nums[i].length; j = j + 1){
        if(nums[i][j] == 0){
          zeros = zeros + 1;
        }
      }
    }
    return zeros;
  }

  public static void fill2D(int[][] vals){
    for(int i = 0; i < vals.length; i = i + 1){
      for(int j = 0; j < vals[i].length; j = j + 1){
        vals[i][j] = 1;
        if(i == j){
          vals[i][j] = 3;
        }
      }
    }
    printArray(vals);
  }

  public static int[][] fill2DCopy(int[][] vals){
    int[][] copy1 = vals
    for(int i = 0; i < copy1.length; i = i + 1){
      if (vals[i] < 0){
        copy1[i] = 3;
      }
      copy1[i] = 1;
      for(int j = 0; j < vals[i].length; j = j + 1){
        if(vals[i][j] < 0){
          copy1[i][j] = 3;
        }
        copy1[i][j] = 1;
      }
    }
    return copy1;
  }


}
