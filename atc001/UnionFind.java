import java.util.Scanner;

public class UnionFind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int q = Integer.parseInt(input[1]);
        UF uf = new UF(n);
        for(int i=0 ; i<q ; i++){
            String[] in = sc.nextLine().split(" ");
            String query = in[0];
            //System.out.println("query ==" + query);
            int a = Integer.parseInt(in[1]);
            int b = Integer.parseInt(in[2]);
            if(query.equals("0")){
                uf.marge(a,b);
            }
            else if(query.equals("1")){
                System.out.println(uf.same(a,b));
            }
        }
    }
    static class UF{
        int[] parent;

        public UF(int N){
            this.parent = new int[N];
            for(int i=0 ; i<N ; i++){
                parent[i] = i;
            }
        }
        public void marge(int a, int b){
            if(root(a) == root(b)){
                return;
            }
            int aroot = root(a);
            int broot = root(b);
            parent[aroot] = broot;
            return;
        }
        public int root(int a){
            if(parent[a] == a){
                return a;
            }
            else{
                return parent[a] = root(parent[a]);
            }
        }
        public String same(int a, int b){
            if(root(a) == root(b))
                return "Yes";
            else
                return "No";
        }
    }
}
