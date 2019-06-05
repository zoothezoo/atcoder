import java.util.*;

class A{
    public void main(String[] args){
        int N = Integer.parseInt(readLine());

        List<String> s = new ArrayList();
        List<Integer> p = new ArrayList();

        for(int i; i < N; i++){
            List<String> input = readLine().split(" ");
            s.add(input[0]);
            p.add(Integer.parseInt(input[1]));
        }

        System.out.println(s);
        System.out.println(p);





    }
}