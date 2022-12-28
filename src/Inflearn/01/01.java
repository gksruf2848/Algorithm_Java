import java.util.Scanner;

Class Main {
    public int solution(String str, char t){
        int answer=0;
        str=str.toUpperCase();
        t = Character.toUpperCase(t);
        System.out.println(str);

        return answer;
    }


    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        string str=kb.next();
        char c=kb.next().charAt(0);
        System.out.print(T.soulution(str, c));
    }
}