package interviewCode_Java;

public class reverseInteger {
    public int reverse(int x) {
        int val = Math.abs(x);
        boolean isNegative = false;
        
        if (x < 0)
        {
            isNegative = true;
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(val);
        String outputString = sb.reverse().toString();

        
        if(isNegative)
        {
            outputString = "-" + outputString;
        }
        
        Integer Output = Integer.parseInt(outputString);
        
        if (Output < Math.pow(-2, 31) || Output > Math.pow(2, 31) - 1)
        {
            return 0;
        }

        return Output;
        
    }
}
