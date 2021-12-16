class Solution
{
    class Pos {
        int x;
        int y;
        int dis;
        public Pos(int x, int y, int dis){
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        int[] m = {2, 2, 1, -1, -2, -2, 1, -1};
        int[] n = {-1, 1, -2, -2, 1, -1, 2, 2};
        boolean[][] vis = new boolean[N][N];
        vis[KnightPos[0]-1][KnightPos[1]-1] = true;
        Queue<Pos> q = new LinkedList<>();
        q.add(new Pos(KnightPos[0]-1,  KnightPos[1]-1, 0));
        boolean loop = true;
        while(!q.isEmpty() || loop) {
            Pos p = q.poll();
            if(p.x == TargetPos[0]-1 && p.y == TargetPos[1]-1){
                loop = false;
                return p.dis;
            }
            for(int i=0; i<8; i++){
                int dx = p.x + m[i];
                int dy = p.y + n[i];
                if(dx >= 0 && dx < N && dy >= 0 && dy < N 
	                    && !vis[dx][dy]){
	                    vis[dx][dy] = true;
		                q.add(new Pos(dx, dy, p.dis+1));
	                }
            }
        }
       return Integer.MAX_VALUE;
    }
}
