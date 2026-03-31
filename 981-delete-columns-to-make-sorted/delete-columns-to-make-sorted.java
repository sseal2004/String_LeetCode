class Solution {
    public int minDeletionSize(String[] strs) {
      int row = strs.length;
      int col = strs[0].length();
      int count =0;
      //have to traverse letter by letter
      for(int i=0;i<col;i++){// 0th letter
        for(int j=1;j<row;j++){
            if(strs[j].charAt(i)<strs[j-1].charAt(i)){ count++; break;}//move to next coulumn if lexicographically sorted
        }
      }
      return count;
    }
}