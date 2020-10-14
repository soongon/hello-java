package kr.re.kitri.operator;

public class SalaryQuiz {
    public static void main(String[] args) {
        // 1. 내셔널리그 상위 30명의 연봉의 평균을 구하세요..
        // 2. 2010년 이후 "NYA" 의 상위 5명 연봉의 합을 구하세요..

        // 핵심..
        // 1. 필터링.. 1) NL  2) 2010 이후 연도..
        // 2. sorted..
        // 3. 매핑  Salary -> long(salary)
        // 4. Stream<Long> --> LongStream  (mapToLong)
        // 5. limit(30) limit(5)
        // 6. average(), sum()
    }
}
