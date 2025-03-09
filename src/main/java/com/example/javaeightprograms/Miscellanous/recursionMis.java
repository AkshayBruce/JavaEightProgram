package com.example.javaeightprograms.Miscellanous;

public class recursionMis {
    public static void main(String[] args) {
        System.out.println(mystery(11,6));
    }

    public static int mystery(int x, int y)
    {
        if(y==0) return 0;
        if (y%2 == 0) return mystery(x+x, y/2);
        return mystery(x+x, y/2)+x;
    }


}
