// https://www.hackerrank.com/challenges/grading/problem 


// My solution:
class Result {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int grade:grades) {
            if(grade < 38 || grade % 5 <= 2 ) {
                ans.add(grade);
            } else if(grade % 5 > 2) {
                int add = 5 - (grade % 5);
                ans.add(grade + add);
            }
        }
        return ans;
    }

}