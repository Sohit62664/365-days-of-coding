class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        //genrate prime number till then there sum is less than equals to s

        List<Integer> ls = new ArrayList<>();
        int sum = 0;
        int num = 2;
        while (sum <= s && num <= n && num + sum <= s) {
            // if num <= s/2 .. -->> wee can run it 
            //     if num+ sum <= s then go ahead 

            if (prime(num)) {
                sum += num;
                if (sum <= s)
                    ls.add(num);
            }
            num++;

        }
        return ls;
    }

    boolean prime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    // is it possible to check a number is prime or not in O(1);
    //What could be the max complexity O(n) to generate a number is prime
}
