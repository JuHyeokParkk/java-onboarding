package onboarding;

public class Problem3 {

    static Integer[] countRecord;
    static final int MAX_INDEX = 10001;

    public static int solution(int number) {
        int answer = 0;
        return answer;
    }

    static int getClapCount(int number) {

        if(countRecord[number] != null)
            return countRecord[number];

        if(number == 0)
            return 0;

        int currentNum = number % 10;

        return (currentNum == 3 || currentNum == 6 || currentNum == 9 ? 1 : 0) + getClapCount(number / 10);
    }
}
