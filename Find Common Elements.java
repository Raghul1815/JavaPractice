class Solution {
    public void commonElements(int[] a, int[] b) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    
                    break;
                }
            }
        }
    }
}
