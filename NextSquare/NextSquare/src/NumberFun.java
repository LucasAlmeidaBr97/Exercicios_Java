public class NumberFun {

        public static long findNextSquare(long sq){
            long nextNum = (long)Math.sqrt(sq) + 1;
            long nextSqr = (long)Math.pow(nextNum,2);
            double sqrRoot = Math.sqrt(sq);
            if (sqrRoot % 1 != 0 || sq < 0) {
                return -1;    
            }
            return nextSqr;
        }


}