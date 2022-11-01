class Solution {
    public int minCostToMoveChips(int[] position) {

        int numberofEvenNumbers=0;
        int numberofOddNumbers=0;

        for(int i : position){
            if(i%2==0){
                numberofEvenNumbers++;
            }
        }

        numberofOddNumbers=position.length-numberofEvenNumbers;

        if(numberofEvenNumbers<numberofOddNumbers){
            return numberofEvenNumbers;
        }
        else{
            return numberofOddNumbers;
        }
    }
}
