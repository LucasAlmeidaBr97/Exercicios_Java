public class NumberFun {

    public static long findNextSquare(long sq) {
        long nextNum = (long) Math.sqrt(sq) + 1;
        long nextSqr = (long) Math.pow(nextNum, 2);
        double sqrRoot = Math.sqrt(sq);
        if (sqrRoot % 1 != 0 || sq < 0) {
            return -1;
        }
        return nextSqr;
    }

    public static long findCorrectNextSquare(long sq) {
        if (sq < 0) {
            return -1;
        }

        long root = (long) Math.sqrt(sq);

        if (root * root != sq) {
            return -1;
        }

        long next = root + 1;
        return next * next;
    }

}