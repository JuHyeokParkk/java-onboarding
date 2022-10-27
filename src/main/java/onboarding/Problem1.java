package onboarding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    static void validateInput(List<Integer> bookPage) throws Exception {

        if(bookPage == null || bookPage.size() != 2)
            throw new Exception();

        int leftPageNumber = bookPage.get(0);
        int rightPageNumber = bookPage.get(1);

        if(outOfPage(leftPageNumber) || outOfPage(rightPageNumber))
            throw new Exception();

        if(leftPageNumber % 2 != 1 || rightPageNumber % 2 != 0)
            throw new Exception();

        if(leftPageNumber > rightPageNumber)
            throw new Exception();

        if(rightPageNumber - 1 != leftPageNumber)
            throw new Exception();

    }

    static boolean outOfPage(int page) {
        return !(1 <= page && page <= 400);
    }

    static int getScoreFromBook(List<Integer> book) {

        int leftPageScore = getScoreFromPage(book.get(0));
        int rightPageScore = getScoreFromPage(book.get(1));

        return Math.max(leftPageScore, rightPageScore);

    }

    static int getScoreFromPage(int page) {

        int[] eachNumberArray = Stream.of(String.valueOf(page).split("")).mapToInt(Integer::parseInt).toArray();

        int sum = Arrays.stream(eachNumberArray).reduce(0, (a, b) -> a + b);
        int product = Arrays.stream(eachNumberArray).reduce(1, (a, b) -> a * b);

        return Math.max(sum, product);
    }
}