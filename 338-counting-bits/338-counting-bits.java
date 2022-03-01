class Solution {
    public int[] countBits(int num) {
    int[] r = new int[num + 1];
    for (int i=1; i<=num; i++) r[i] = r[i >> 1] + (i & 1);
    return r;
    }
}