class Pair {
    int first, second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Pair> q = new LinkedList<>();
        int n = image.length;
        int m = image[0].length;
        int[][] status = new int[n][m];
        q.add(new Pair(sr,sc));
        int x=image[sr][sc];
        status[sr][sc]=-1;
        image[sr][sc]=color;
        while(!q.isEmpty()){
            Pair p = q.poll();
            int i=p.first;
            int j=p.second;
            if(i+1<n && status[i+1][j]!=-1 && image[i+1][j]==x){
                q.add(new Pair(i+1,j));
                status[i+1][j]=-1;
                image[i+1][j]=color;
            }
            if(i-1>=0 && status[i-1][j]!=-1 && image[i-1][j]==x){
                q.add(new Pair(i-1,j));
                status[i-1][j]=-1;
                image[i-1][j]=color;
            }
            if(j-1>=0 && status[i][j-1]!=-1 && image[i][j-1]==x){
                q.add(new Pair(i,j-1));
                status[i][j-1]=-1;
                image[i][j-1]=color;
            }
            if(j+1<m && status[i][j+1]!=-1 && image[i][j+1]==x){
                q.add(new Pair(i,j+1));
                status[i][j+1]=-1;
                image[i][j+1]=color;
            }
        }
        return image;
    }
}