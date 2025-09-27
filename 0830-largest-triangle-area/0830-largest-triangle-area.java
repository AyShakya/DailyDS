class Solution {
    public double area(double x1, double y1, double x2, double y2, double x3, double y3){
        return 0.5*(x1*((y2-y3)) + x2*((y3-y1)) + x3*((y1-y2)));
    }
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxi = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j && j!=k){
                        maxi = Math.max(maxi, area(points[i][0], points[i][1], points[j][0], points[j][1], points[k][0], points[k][1]));
                    }
                }
            }
        }
        return maxi;
    }
}