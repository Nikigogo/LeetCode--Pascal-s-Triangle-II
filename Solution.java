public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i <= rowIndex;i++){
            for(int j = i-1;j >= 0;j--){
                if(i>=1 && j>=1){
                    result.set(j,result.get(j-1)+result.get(j));
                }
                else result.set(j,1);
            }
            result.add(1);
        }
        return result;
    }
}