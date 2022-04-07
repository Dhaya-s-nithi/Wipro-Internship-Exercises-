package com.studiocode;

public class Assignment7 {
    public static void main(String[] args) {
      int y[]= {12,34,12,45,67,89};
      int s;
      s=y.length;
      for(int i=0;i<s;i++)
      {
          for(int j=i+1;j<s;j++)
          {
              if(y[i]==y[j])
              {
                  for(int r=j;r<s-1;r++)
                  {
                      y[r]=y[r+1];

                  }
                  s=s-1;
              }
          }
      }
      for(int i=0;i<s;i++)
      {
          if(i==s-1)
          {
              System.out.print(y[i]);
              break;
          }
          System.out.print(y[i]+",");
      }

    }
}
