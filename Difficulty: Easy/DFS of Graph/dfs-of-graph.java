class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>ans=new ArrayList<>();
        boolean[]vis=new boolean[adj.size()];
        Dfs(adj,0,vis,ans);
        return ans;
        
       
        }
        public static void Dfs(ArrayList<ArrayList<Integer>> adj,int curr,boolean vis[],ArrayList<Integer> ans){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<adj.get(curr).size();i++){
            int neibhour=adj.get(curr).get(i);
            if(!vis[neibhour]){
                Dfs(adj,neibhour,vis,ans);
            }
        }
        
    }
        
    }
