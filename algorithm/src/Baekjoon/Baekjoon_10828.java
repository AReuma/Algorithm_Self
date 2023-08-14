package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_10828 {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        //StringBuilder sb = new StringBuilder();

        stack = new int[n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    bw.write(pop() +"\n");
                    break;
                case "size":
                    bw.write(size() +"\n");
                    break;
                case "empty":
                    bw.write(empty() +"\n");
                    break;
                case "top":
                    bw.write(top() +"\n");
                    break;
            }

            bw.flush();
        }

        bw.close();
    }

    public static void push(int num){
        stack[size] = num;
        size++;
    }

    public static int pop(){
        if(size == 0) return -1;
        else {
            int res = stack[size -1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }

    public static int size(){
        return size;
    }

    public static int empty(){
        if(size == 0){
            return 1;
        }else return 0;
    }

    public static int top(){
        if(size == 0) return -1;
        else return stack[size -1];
    }
}
