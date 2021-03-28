public class RowSumOddNumbers {
    public  int rowSumOddNumbers(int n) {
        int equation;
        int total=0;
        equation=(n*n)-(n-1);
        for(int j=0;j<n;j++){
            total+=equation;
            equation+=2;
        }
        return total;
    }
}
